package ss3_array_method;

import java.util.Scanner;

public class TimGiaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SIZE = 5;
        int[] array = new int[SIZE];
        System.out.println("Nhập " + array.length + " phần tử:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
