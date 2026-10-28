package ss4_class_object.bt3;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public String toString(){
        if (this.isOn()){
            return "Do toc: "+this.speed+" Mau sac: "+this.color+" Ban kinh: "+this.radius+" Fan is on";
        }
            return "Mau sac: "+this.color+" Ban kinh: "+this.radius+" Fan is off";
    }
    public void Three(){
        this.setSpeed(3);
    }
    public void tatQuat(){
        this.speed=0;
        this.on=false;
    }
}
