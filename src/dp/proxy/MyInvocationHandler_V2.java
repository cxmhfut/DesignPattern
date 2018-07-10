package dp.proxy;

import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler_V2 implements InvocationHandler {

    private Object target;
    private MethodCallBack methodCallBack;

    interface MethodCallBack {
        void before();

        void after();
    }

    public void setMethodCallBack(MethodCallBack methodCallBack) {
        this.methodCallBack = methodCallBack;
    }

    public Object bind(Object target) {
        this.target = target;

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (methodCallBack != null) {
            methodCallBack.before();
        }
        Object result = method.invoke(target, args);
        if (methodCallBack != null) {
            methodCallBack.after();
        }
        return result;
    }
}
