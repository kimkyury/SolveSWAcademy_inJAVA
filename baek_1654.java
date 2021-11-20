import java.util.*;
import java.io.*;

public class baek_1654 {
    public static void main(String[] args) throws IOException {
        // 길이가 제각각인 랜선 k개
        // 모든 같은 길이 N으로 만들자
        // N개보다 많은 만드는 것도 N개를 만드는 것 포함. (즉,N개 이상 = N개)
        // 만들 수 있는 최대 랜선의 길이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lan = new int[n];

        for (int i = 0; i < n; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }

        // n 개의 수의 최대 공약수

    }
}
