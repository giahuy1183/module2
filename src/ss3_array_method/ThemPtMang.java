package ss3_array_method;

import java.util.Scanner;

public class ThemPtMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {5, 8, 2, 9, 4, 7, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNhập giá trị X cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
