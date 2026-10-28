package ss4_class_object;

import java.util.Scanner;

public class RunApp {
    static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Menu quản lý sinh viên------" +
                    "\n1. Danh sách" +
                    "\n2. Thêm mới" +
                    "\n3. Xóa" +
                    "\n4. Tìm kiếm" +
                    "\n5. Thoát");
            System.out.println("------Chọn chức năng------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên");
                    String name = sc.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();
                    Student student = new Student(id, name, address);
                    studentManager.add(student);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    studentManager.deleteById(deleteId);
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
