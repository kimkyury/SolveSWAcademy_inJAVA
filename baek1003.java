import java.util.*;
import java.io.*;

public class baek1003 {
    static BufferedWriter bw;
    static int cnt_0;
    static int cnt_1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            cnt_0 = 0;
            cnt_1 = 0;

            int N = Integer.parseInt(br.readLine());

            fibonacci(N);

            bw.write(Integer.toString(cnt_0) + " " + Integer.toString(cnt_1) + "\n");
        }
        bw.flush();

        // fivonacci(1) ==1출력 1 리턴, fibonacci(2) == 1리턴, fibonacci(3) == 2리턴 ,
        // fibonacci(0) == 0출력, 0 리턴
        // fibonacci(N)호출 시에, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램

    }

    static void fibonacci(int N) {

        if (N == 0) {
            cnt_0 = 1;
            return;
        }

        else if (N == 1) {
            cnt_1 = 1;
            return;
        }

        else if (N == 2) {
            cnt_1 = 2;
            fibonacci(N - 2);
        }

        else {
            fibonacci(N - 1);
        }
    }
}
