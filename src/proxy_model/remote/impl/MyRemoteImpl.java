package proxy_model.remote.impl;

import proxy_model.remote.MyRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Package:proxy_model.remote.impl
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server say hello";
    }

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
