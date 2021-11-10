import java.io.Serializable;

public class Song implements Serializable {
    String name;
    int id;

    public Song(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Song(String name) {
        this.name = name;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
