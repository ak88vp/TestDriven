import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainACC {
    public static String abcName;

    public static void main(String[] args) {
        ManiAlbum.readFile();
        Scanner scanner = new Scanner(System.in);
        int a = 88;
        while (a != 0) {
            try {
                System.out.println("1 : đăng kí");
                System.out.println("2 : đăng nhập");
                System.out.println("0 : thoát");
                a = scanner.nextInt();
                switch (a) {

                    case 1:
                        System.out.println("tên");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("mật khẩu");
                        String pass = scanner.nextLine();
                        Account account1 = new Account(name, pass);
                        ManagerAcc.getInstance().add(account1);
                        ManiAlbum.wirtFile();
                        ManiAlbum.readFile();
                        break;
                    case 2:

                        ManiAlbum.readFile();
                        System.out.println("tên");
                        scanner.nextLine();
                        String name1 = scanner.nextLine();
                        System.out.println("mật khẩu");
                        String pass1 = scanner.nextLine();
                        for (int i = 0; i < ManagerAcc.getInstance().getListACC().size(); i++) {
                            if (ManagerAcc.getInstance().getListACC().get(i).getName().equals(name1) && ManagerAcc.getInstance().getListACC().get(i).getPass().equals(pass1)) {
                                System.out.println("đăng nhập thành công");
                                abcName = name1;
                                ManiAlbum.main();
                                break;
                            }
                        }
                        break;


                }
            } catch (Exception E) {
                System.out.println("lỗi");
            }
        }
        Account account = new Account();

    }
}
