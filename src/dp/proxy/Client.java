package dp.proxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    @Test
    public void proxyTestV1() {
        UserService userService = new UserServiceImpl();
        DeptService deptService = new DeptServiceImpl();
        MyInvocationHandler_V1 invocationHandler1 = new MyInvocationHandler_V1(userService);
        MyInvocationHandler_V1 invocationHandler2 = new MyInvocationHandler_V1(deptService);
        UserService userProxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                invocationHandler1);
        DeptService deptProxy = (DeptService) Proxy.newProxyInstance(
                deptService.getClass().getClassLoader(),
                deptService.getClass().getInterfaces(),
                invocationHandler2
        );
        userProxy.add();
        deptProxy.remove();
    }

    @Test
    public void proxyTestV2(){
        MyInvocationHandler_V2 invocationHandler = new MyInvocationHandler_V2();
        UserService userProxy = (UserService) invocationHandler.bind(new UserServiceImpl());
        DeptService deptProxy = (DeptService) invocationHandler.bind(new DeptServiceImpl());
        userProxy.add();
        deptProxy.remove();
    }

    @Test
    public void cglibProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println(method.getName());
                System.out.println("before");
                Object result = methodProxy.invokeSuper(target,args);
                System.out.println("after");
                return result;
            }
        });
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.add();
        userService.update();
    }
}
