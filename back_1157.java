
//import java.io.*;
import java.util.*;

public class back_1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        String str = sc.nextLine();
        sc.close();

        int len = str.length();
        boolean[] isPassed = new boolean[len];
        int[] arr = new int[len];
        String answer;

        int cnt;
        for (int i = 0; i < len; i++) {
            cnt = 0;
            if (isPassed[i] == true)
                continue;
            for (int j = 0; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    cnt++;
                    isPassed[j] = true;
                }
            }
            arr[i] = cnt;
        }

        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        boolean isSame = false;
        for (int i = 1; i < len; i++) {
            if (max == arr[i]) {
                isSame = true;
            }
        }

        if (isSame == true) {
            answer = String.valueOf('?');
        } else {
            answer = String.valueOf(max);
        }

        System.out.println(answer);
    }
}