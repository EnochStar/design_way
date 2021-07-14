package proxy_model.protect;

import java.lang.reflect.Proxy;

/**
 * Package:proxy_model.protect
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {

    }
    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    public PersonBean getNonProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
