package ss2_loop_array;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Menu quản lý sinh viên------" +
                    "\n1. Danh sách"+
                    "\n2. Thêm mới"+
                    "\n3. Xóa"+
                    "\n4. Tìm kiếm"+
                    "\n5. Thoát");
            System.out.println("------Chọn chức năng------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //chức năng
                    System.out.println("Hiển thị danh sách");
                    break;
                case 2:
                    //chức năng
                    System.out.println("Đã thêm mới");
                    break;
                case 3:
                    //chức năng
                    System.out.println("Đã xóa");
                    break;
                case 4:
                    //chức năng
                    System.out.println("Hiển thị tìm kiếm");
                    break;
                case 5:
                    //chức năng
                    System.out.println("Đã thoát");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
