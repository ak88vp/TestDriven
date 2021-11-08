package Account;

import java.util.ArrayList;

public class Account {
    private String name;
    private String pass;
    ArrayList<Album> ListAlbum=new ArrayList<Album>();
    public Account(){
    }
//    public static Account getInstance(){return instance;}
//    private static final Account instance=new Account();

    public Account(String name, String pass, ArrayList<Album> listAlbum) {
        this.name = name;
        this.pass = pass;
        ListAlbum = listAlbum;
    }

    public Account(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Album> getListAlbum() {
        return ListAlbum;
    }

    public void setListAlbum(ArrayList<Album> listAlbum) {
        ListAlbum = listAlbum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", ListAlbum=" + ListAlbum +
                '}';
    }
}
