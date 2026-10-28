package ss4_class_object.bt2;

public class RunApp {
    static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println("Thoi gian bat dau: " + sw.getStartTime());
        for (long i = 0; i < 1000000; i++) {
            for (int j = 0; j < 1000000; j++) {
                Math.sqrt(i);
            }
        }
        sw.stop();
        System.out.println("Thoi gian ket thuc: " + sw.getEndTime());
        System.out.println("Thoi gian da dem: " + sw.getElapsedTime());
    }
}
