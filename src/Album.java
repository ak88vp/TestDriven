import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable {
    private String name;
    ArrayList<Song> songArrayList=new ArrayList<>();
    private  Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Album(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void setSongArrayList(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
    }

    public Album(String name, ArrayList<Song> songArrayList, Account account) {
        this.name = name;
        this.songArrayList = songArrayList;
        this.account = account;
    }
    public void add (Song song){
        songArrayList.add(song);

    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songArrayList +
                name+
                '}';
    }
}
