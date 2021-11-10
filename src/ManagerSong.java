import java.util.ArrayList;

public class ManagerSong implements manager<Song> {
    ArrayList<Song> listSong = new ArrayList<>();

    public ManagerSong(ArrayList<Song> listSong) {
        this.listSong = listSong;
    }

    public ManagerSong() {
    }

    public ArrayList<Song> getListSong() {
        return listSong;
    }

    public void setListSong(ArrayList<Song> listSong) {
        this.listSong = listSong;
    }

    @Override
    public String toString() {
        return "ManagerSong{" +
                "listSong=" + listSong +
                '}';
    }

    @Override
    public void add(Song song) {
        listSong.add(song);
        print();
    }

    @Override
    public void delete(String name) {
        listSong.remove(find(name));
        print();
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().equals(name)) {
                System.out.println(listSong.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Song song : listSong
        ) {
            System.out.println(song);
        }
    }

    @Override
    public void update(String name, Song song) {
        listSong.set(find(name), song);
    }
}
