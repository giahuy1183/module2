package ss7.bt1;

public class RunResizeable {
    public static void main(String[] args) {

        Resizeable[] shapes = new Resizeable[3];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(10);

        for (int i = 0; i < shapes.length; i++) {

            double percent = Math.random() * 100;

            double oldArea = 0;

            if (shapes[i] instanceof Circle) {
                oldArea = ((Circle) shapes[i]).getArea();

            } else if (shapes[i] instanceof Rectangle) {
                oldArea = ((Rectangle) shapes[i]).getArea();
            }

            System.out.println("Dien tich truoc: " + oldArea);

            shapes[i].resize(percent);

            double newArea = 0;

            if (shapes[i] instanceof Circle) {
                newArea = ((Circle) shapes[i]).getArea();

            } else if (shapes[i] instanceof Rectangle) {
                newArea = ((Rectangle) shapes[i]).getArea();
            }

            System.out.println("Phan tram tang: " + percent + "%");
            System.out.println("Dien tich sau: " + newArea);
            System.out.println("----------------------");
        }
    }
}
