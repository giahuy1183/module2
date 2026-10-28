package ss4_class_object.bt;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    private double getRoot1() {
        double delta = getDiscriminant();
        double r1;
        return r1 = (-b + Math.pow(delta, 0.5) / 2 * a);
    }

    private double getRoot2() {
        double delta = getDiscriminant();
        double r2;
        return r2 = (-b - Math.pow(delta, 0.5) / 2 * a);
    }

    public void giaiPt() {
        double delta = getDiscriminant();
        if (delta > 0) {
            System.out.println("PT co 2 nghiem:");
            System.out.println("Nghiem 1: " + this.getRoot1());
            System.out.println("Nghiem 2: " + this.getRoot2());
        } else if (delta == 0) {
            System.out.println("PT co 1 nghiem: " + this.getRoot1());
        } else {
            System.out.println("PT vo nghiem");
        }
    }
}
