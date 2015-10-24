import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by ruype_000 on 21/10/2015.
 */
public class RMI_DataBase {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        Informations info = new Informations();

        try {

            RMI_DataBase_Interface servidor_rmi = new DataBase();
            LocateRegistry.createRegistry(info.getRmiRegistry()).rebind(info.getRmiRebind(), servidor_rmi);
            System.out.println("Servidor RMI ligado!");

        }catch (RemoteException e){
            System.out.println("PUTA VIDA MERDA CAGALHOES");
            System.out.println(e.getLocalizedMessage());
        }

    }
}