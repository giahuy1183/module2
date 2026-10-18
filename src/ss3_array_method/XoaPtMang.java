package ss3_array_method;

import java.util.Scanner;

public class XoaPtMang {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Nhap phan tu thu [" + i + "]: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Nhap X can xoa: ");
        int X = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
