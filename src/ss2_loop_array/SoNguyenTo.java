package ss2_loop_array;

import java.util.Scanner;

public class SoNguyenTo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to can in: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean laSoNguyenTo = true;
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        sc.close();
    }
}
