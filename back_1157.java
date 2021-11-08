import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class back_1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        boolean[] isPassed = new boolean[len];
        int[] arr = new int[len];

        String answer;
        // ArrayList<Integer> intArr = new ArrayList

        for (int i = 0; i < len; i++) {
            arr[i] = 0;
        }

        int cnt;
        for (int i = 0; i < len; i++) {
            cnt = 0;
            char apb = str.charAt(i);
            for (int j = 0; j < len; j++) {
                if (apb == str.charAt(j) && isPassed[j] == false) {
                    isPassed[j] = true;
                    cnt++;
                }
            }
            arr[i] = cnt;
        }

        int max = arr[0];
        for (int i = 1; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int maxCnt = 0;
        for (int i = 0; i < len; i++) {
            if (max == arr[i]) {
                maxCnt++;
            }
        }

        if (maxCnt > 1) {
            answer = String.valueOf('?');
        } else {
            answer = String.valueOf(max);
        }

        System.out.println(answer);
    }
}