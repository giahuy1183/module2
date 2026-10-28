package ss4_class_object.bt3;

public class RunApp {
    static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        System.out.println(fan.toString());
        fan.Three();
        System.out.println(fan.toString());
        fan.tatQuat();
        System.out.println(fan);
    }
}
