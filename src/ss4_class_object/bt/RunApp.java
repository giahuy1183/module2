package ss4_class_object.bt;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        equation.giaiPt();
    }
}

