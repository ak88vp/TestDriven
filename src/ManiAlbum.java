
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManiAlbum {
    public static void main() throws IOException, ClassNotFoundException {
        wirtFile();
        readFile();
        Scanner scanner=new Scanner(System.in);
        int a=88;
        while (a!=0){
            try {
                System.out.println(" 1: tạo album");
                System.out.println(" 2: sửa album");
                System.out.println(" 3: xóa album");
                System.out.println(" 4: tìm album");
                System.out.println(" 5: hiển thị danh album");
                System.out.println(" 6: bài hát trong album");
                System.out.println(" 7: đổi mật khẩu");
                System.out.println("8: hiển thị danh sách account,album,song");
                System.out.println(" 0: thoát");
                a=scanner.nextInt();
                switch (a){
                    case 1:
                        try {
                            int index = getIndex();
                            System.out.println("Tên ALBUM");
                            scanner.nextLine();
                            String nameA=scanner.nextLine();
                            Album album=new Album(nameA);
                            int b=88;
                            while (b!=0){
                                System.out.println("1:Thêm bài hát");
                                System.out.println("0 :thôi");
                                b=scanner.nextInt();
                                if(b!=0){
                                    System.out.println("NHập tên bài hát muốn thêm");
                                    scanner.nextLine();
                                    String nameS=scanner.nextLine();
                                    Song song=new Song(nameS);
                                    album.add(song);

                                }
                            }
                            ManagerAcc.getInstance().getListACC().get(index).add(album);
                            wirtFile();
                            readFile();
                            break;
                        }catch (Exception e){
                            scanner.nextLine();
                        }

                    case 2:
                        int index00 = getIndex();
                        System.out.println("Tên album");
                        System.out.println("Nhập tên ab cần xóa");
                        scanner.nextLine();
                        String name00=scanner.nextLine();
                        if(ManagerAcc.getInstance().getListACC().get(index00).find(name00)!=-1){
                            System.out.println("Tên ALBUM");
                            String nameA1=scanner.nextLine();
                            ManagerAcc.getInstance().getListACC().get(index00).update1(name00,nameA1);
                            wirtFile();
                            readFile();
                            break;
                        }else System.out.println("dell tìm thấy");

                        break;
                    case 3:
                        int index0 = getIndex();
                        System.out.println("Nhập tên ab cần xóa");
                        scanner.nextLine();
                        String name0=scanner.nextLine();
                        ManagerAcc.getInstance().getListACC().get(index0).delete(name0);
                        wirtFile();
                        readFile();
                        break;
                    case 4:
                        int index1 = getIndex();
                        System.out.println("Nhập tên ab cần tìm");
                        scanner.nextLine();
                        String name=scanner.nextLine();
                        System.out.println(ManagerAcc.getInstance().getListACC().get(index1).find(name));
                        wirtFile();
                        readFile();
                        break;
                    case 5:
                        int index2 = getIndex();
                        for (int i = 0; i <ManagerAcc.getInstance().getListACC().get(index2).ListAlbum.size(); i++) {
                            System.out.println(ManagerAcc.getInstance().getListACC().get(index2).ListAlbum.get(i).getName());
                        }
                        wirtFile();
                        readFile();
                        break;
                    case 6:
                        int index3 = getIndex();
                        System.out.println("Nhập tên ab muốn xem ");
                        scanner.nextLine();
                        String nameAb=scanner.nextLine();
                        System.out.println(ManagerAcc.getInstance().getListACC().get(index3).find(nameAb));
                        break;
                    case 7:
                        int index4 = getIndex();
                        System.out.println("Nhập mk cũ");
                        scanner.nextLine();
                        String pass=scanner.nextLine();
                        if(ManagerAcc.getInstance().getListACC().get(index4).getPass().equals(pass)){
                            System.out.println("Mật khẩu mới");
                            String passNew=scanner.nextLine();
                            ManagerAcc.getInstance().getListACC().get(index4).setPass(passNew);
                            wirtFile();
                            readFile();
                        }else System.out.println("tạch mk");
                        break;

                    case 8:
                        FileInputStream fileInputStream1=new FileInputStream("music.txt");
                        ObjectInputStream objectInputStream1=new ObjectInputStream(fileInputStream1);
                        System.out.println(objectInputStream1.readObject());
                        objectInputStream1.close();
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void wirtFile()  {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("music.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ManagerAcc.getInstance().listACC);
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println();
        }

    }

    public static void readFile()  {
        try{
            ArrayList<Account> listAcc ;
            ManagerAcc a= ManagerAcc.getInstance();
            FileInputStream fileInputStream=new FileInputStream("music.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            listAcc= (ArrayList) objectInputStream.readObject();
//            ArrayList<Account> newList = (ArrayList<Account>) listAcc;
            a.setListACC(listAcc);
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println();
        }

    }

    private static int getIndex() {
        int index=-1;
        for (int i = 0; i < ManagerAcc.getInstance().getListACC().size(); i++) {
            if(ManagerAcc.getInstance().getListACC().get(i).getName().equals(MainACC.abcName)){
                index=i;
            }
        }
        return index;
    }
}
