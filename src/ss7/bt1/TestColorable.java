package ss7.bt1;

public class TestColorable {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle  rectangle = new Rectangle(3,6);
        Circle circle = new Circle(5);
        square.howToColor();
        rectangle.howToColor();
        circle.howToColor();

    }
}
