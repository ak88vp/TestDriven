package Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            Album album=new Album("abc");
//            ArrayList<Album> listAlbu= new ArrayList<Album>();
//            listAlbu.add(album);
        for (int i = 0; i < 2; i++) {
            String name=scanner.nextLine();
            String pass=scanner.nextLine();
            Account account=new Account(name,pass);
            ManagerAcc.getInstance().add(account);
        }

        ManagerAcc.getInstance().getListACC().get(0).getListAlbum().add(album);
        ManagerAcc.getInstance().print();


    }
}
