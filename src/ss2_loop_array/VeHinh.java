package ss2_loop_array;

import java.util.Scanner;

public class VeHinh {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-----Menu-----" +
                    "\n1.Vẽ hình chữ nhật" +
                    "\n2.Vẽ hình tam giác vuông cạnh góc vuông dưới" +
                    "\n3.Vẽ hình tam giác vuông cạnh góc vuông trên" +
                    "\n4.Vẽ hình tam giác cân");
            System.out.println("-----Chọn chức năng-----");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhap chieu dai: ");
                    int dai = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap chieu rong: ");
                    int rong = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < rong; i++) {
                        for (int j = 0; j < dai; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2: {
                    System.out.print("Nhap chieu cao: ");
                    int cao = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cao; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;
                case 3: {
                    System.out.print("Nhap chieu cao: ");
                    int cao = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cao; i++) {
                        for (int j = 0; j < cao - i; j++) {
                            System.out.print("*");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                }
                break;
                case 4: {
                    System.out.print("Nhap chieu cao: ");
                    int cao = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cao; i++) {
                        for (int k = 0; k < cao - i - 1; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;
                default:
                    flag = false;
            }
        }
    }
}
