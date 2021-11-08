package Account;

import java.util.ArrayList;

public class Album {
    ArrayList<String> songs;
 private String name;
    public Album(String okoko) {
        this.name=okoko;
    }

    public Album() {
    }

    public Album(ArrayList<String> songs) {
        this.songs = songs;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                name+
                '}';
    }
}
