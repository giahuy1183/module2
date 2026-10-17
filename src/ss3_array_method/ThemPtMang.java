package ss3_array_method;

import java.util.Scanner;

public class ThemPtMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] duLieu = {5, 8, 2, 9, 4, 7};
        for (int i = 0; i < duLieu.length; i++) {
            arr[i] = duLieu[i];
        }
        System.out.println("Mảng ban đầu:");
        inMang(arr);
        System.out.print("Nhập giá trị X cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn (0 - " + (arr.length - 1) + "): ");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            System.out.println("Mảng sau khi chèn:");
            inMang(arr);
        }
        sc.close();
    }

    static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
