package proxy_model.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Package:proxy_model.remote
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
