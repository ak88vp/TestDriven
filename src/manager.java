public interface manager <T>{
    void add(T t);
    void delete(String name);
    int find(String name);
    void print();
    void update(String name ,T t);
}
