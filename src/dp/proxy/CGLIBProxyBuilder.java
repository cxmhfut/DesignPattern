package dp.proxy;

import net.sf.cglib.proxy.Enhancer;

public class CGLIBProxyBuilder {
    private Enhancer enhancer;
    public CGLIBProxyBuilder(){

    }

    public void bind(Object target){
        enhancer.setSuperclass(target.getClass());
    }
}
