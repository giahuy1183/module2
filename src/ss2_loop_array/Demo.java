package ss2_loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cars = {"Honda","Toyota","Yamaha"};
        int[] scores = new int[2];
        String[] list = new String[5];
        System.out.println(scores[0]);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + ":");
            scores[i] = sc.nextInt();
        }
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("Gia tri phan tu thu " + (i+1) + ":" + scores[i]);
//            scores[i] = sc.nextInt();
//        }
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 1;
        }
        for (int element : scores) {
            System.out.println(element);
        }
        Scanner sc2 = new Scanner(System.in);
    }
}
