package ss6.bt3;

public class Run {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(3, 5, 2, 4);

        System.out.println(p);

        p.move();

        System.out.println(p);
    }
}
