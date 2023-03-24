import java.util.Scanner;

public class Pracice2 {
    public static void main(String[] args) {
        String[] studentCodegym = {"Sơn","Nam","Giang","Công","Thi","Hùng","Tiến","Chung","Nam","Hải"};
        searchForStudent(studentCodegym);
    }
    public static void searchForStudent(String[] studentCodegym){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh ban muon tim");
        String nameStudent = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < studentCodegym.length; i++){
            if (studentCodegym[i].equals(nameStudent)) {
                System.out.println("Hoc sinh nay o vi tri thu " + (i+1) + " trong danh sach" );
                check = true;
            }
        } if (!check){
            System.out.println("Khong co hoc sinh nay");
        }
    }
}
