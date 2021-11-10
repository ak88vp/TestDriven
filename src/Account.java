import java.io.Serializable;
import java.util.ArrayList;

public  class Account implements manager<Album>, Serializable {
    private String name;
    private String pass;
    ArrayList<Album> ListAlbum=new ArrayList<Album>();
    public Account(){
    }
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

    @Override
    public void add(Album album) {
        ListAlbum.add(album);
        print();

    }

    @Override
    public void delete(String name) {
        ListAlbum.remove(find(name));
        print();
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < ListAlbum.size(); i++) {
            if(ListAlbum.get(i).getName().equals(name)){
                System.out.println(ListAlbum.get(i).toString());
                System.out.println("--------------------");
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Album album:ListAlbum
             ) {
            System.out.println(album);

        }
    }

    @Override
    public void update(String name, Album album ){
        print();
    }
    public void update1(String name, String newName) {
        ListAlbum.get(find(name)).setName(newName);
        print();
    }
}
