package ss5;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // Constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // Static method
    static void change() {
        college = "CODEGYM";
    }

    // Hien thi thong tin
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
