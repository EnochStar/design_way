package proxy_model.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Package:proxy_model.protect
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(personBean,args);
            }else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }else{
                return method.invoke(personBean,args);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
