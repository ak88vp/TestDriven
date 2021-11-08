package Account;

import java.util.ArrayList;

public class ManagerAcc {
    ArrayList<Account> listACC=new ArrayList<Account>();
    private static final ManagerAcc instance=new ManagerAcc();
    public static ManagerAcc getInstance(){
        return instance;
    }

    public ManagerAcc(ArrayList<Account> listACC) {
        this.listACC = listACC;
    }

    private ManagerAcc() {
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


    public  void add(Account account) {
        getInstance().listACC.add(account);

    }

    public void print() {
        for (Account acc:listACC
             ) {
            System.out.println(acc);
        }
    }
}
