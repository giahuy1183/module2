package ss1_java_overview;

import java.util.Scanner;

public class ChuyenDoiTien {
    static void main(String[] args) {
        // Bước 1 & 2: Khai báo tỉ giá
        double tigia = 25000.0;
        double usd;

        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Bước 3: Cho người dùng nhập vào số tiền USD
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();

        // Bước 4: Tính toán và hiển thị kết quả
        double vnd = usd * tigia;
        System.out.println("Số tiền tương ứng bằng VND là: " + vnd + " VNĐ");
    }
}
