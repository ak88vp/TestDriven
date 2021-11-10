import java.io.Serializable;
import java.util.ArrayList;

public class ManagerAcc implements manager<Account>, Serializable {
    ArrayList<Account> listACC = new ArrayList<>();
    private static final ManagerAcc instance = new ManagerAcc();
    private ManagerAcc() {
    }
    public static ManagerAcc getInstance() {
        return instance;
    }

    public ManagerAcc(ArrayList<Account> listACC) {
        this.listACC = listACC;
    }

    public ArrayList<Account> getListACC() {
        return listACC;
    }

    public void setListACC(ArrayList<Account> listACC) {
        this.listACC = listACC;
    }

    @Override
    public String toString() {
        return "ManagerAcc{" +
                "listACC=" + listACC +
                '}';
    }


    @Override
    public void add(Account account) {
        listACC.add(account);
        print();
    }

    @Override
    public void delete(String name) {
        listACC.remove(find(name));
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < listACC.size(); i++) {
            if (listACC.get(i).getName().equals(name)) {
                System.out.println(listACC.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Account acc : listACC
        ) {
            System.out.println(acc);
        }
    }

    @Override
    public void update(String name, Account account) {
        listACC.set(find(name), account);
    }
}
