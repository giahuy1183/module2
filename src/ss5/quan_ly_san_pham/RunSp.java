package ss5.quan_ly_san_pham;

import java.util.Scanner;

public class RunSp {
    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Menu quản lý sản phẩm------" +
                    "\n1. Danh sách sản phẩm" +
                    "\n2. Thêm mới" +
                    "\n3. Xóa" +
                    "\n4. Tìm kiếm" +
                    "\n5. Sửa" +
                    "\n6. Thoát");
            System.out.println("------Chọn chức năng------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qlsp.showSp();
                    break;
                case 2:
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá");
                    float price = Float.parseFloat(sc.nextLine());
                    SanPham sp = new SanPham(id, name, price);
                    qlsp.addSp(sp);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa:");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    qlsp.deleteSp(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập id cần tìm:");
                    int searchId = Integer.parseInt(sc.nextLine());
                    qlsp.searchSp(searchId);
                    break;
                case 5:
                    System.out.println("Nhập id sản phẩm cần sửa:");
                    int editId = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên mới:");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá mới:");
                    float newPrice = Float.parseFloat(sc.nextLine());
                    qlsp.editSp(editId, newName, newPrice);
                    break;
                case 6:
                    flag = false;
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    flag = false;
            }
        }
    }
}

