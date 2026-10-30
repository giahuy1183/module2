package ss6.bt1;

public class Cyclinder extends Circle {
    private int height = 4;

    public Cyclinder() {
    }

    public Cyclinder(float radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public String toString(){
        return super.toString()+ " chieu cao: "+height;
    }
}
