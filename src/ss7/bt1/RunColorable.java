package ss7.bt1;

public class RunColorable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(5);

        for (int i = 0; i < shapes.length; i++) {

            double area = 0;

            if (shapes[i] instanceof Circle) {
                area = ((Circle) shapes[i]).getArea();

            } else if (shapes[i] instanceof Rectangle) {
                area = ((Rectangle) shapes[i]).getArea();
            }

            System.out.println("Dien tich: " + area);

            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }

            System.out.println("-------------------");
        }
    }
}
