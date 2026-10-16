package ss2_loop_array;

public class SoNguyenTo100 {
    static void main(String[] args) {
        for (int N = 2; N < 100; N++) {
            boolean laNguyenTo = true;
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    laNguyenTo = false;
                    break;
                }
            }
            if (laNguyenTo) {
                System.out.print(N + " ");
            }
        }
    }

}
