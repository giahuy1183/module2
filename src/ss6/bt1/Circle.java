package ss6.bt1;

public class Circle {
    private float radius = 5;
    private String color = "red";
    private final float pi = 3.14f;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float dienTich(){
        return pi * (radius*radius);
    }

    public String toString(){
        return "radius=" + radius + " color=" + color +" dien tich= "+dienTich()+" cm2";
    }
}
