package ss5;

public class Main {
    public static void main(String[] args) {
        // Goi phuong thuc static
        Student.change();

        // Tao cac doi tuong Student
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        // Hien thi thong tin
        s1.display();
        s2.display();
        s3.display();
    }
}

