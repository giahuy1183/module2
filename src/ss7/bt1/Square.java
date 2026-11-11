package ss7.bt1;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        double newSide = getWidth() * (1 + percent / 100);

        setWidth(newSide);
        setLength(newSide);
    }

    @Override
    public void howToColor() {
        System.out.println("Red");
    }
}
