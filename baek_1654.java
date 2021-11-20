import java.util.*;
import java.io.*;

public class baek_1654 {
    public static void main(String[] args) throws IOException {
        // 길이가 제각각인 랜선 k개
        // n개의 같은 길이의 랜선으로 만들자
        // n개를 만들 수 있는 랜선의 최대 길이
        // N개보다 많이 만드는 것도 N개를 만드는 것 포함. (즉,N개 이상 = N개)
        // 만들 수 있는 최대 랜선의 길이

        // 조건1. 1 <= k <= 10,000
        // 조건2. 1 <= N <= 1,000,000
        // 조건3. k <= N //랜선의 개수보다는 더 많은 수를 요구.

        // 조건4. maxLen <=2^31 -1 => 즉 int형으로 처리 가능

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lan = new int[k];
        for (int i = 0; i < k; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }

        // lan[0]~ lan[k-1]을 maxlen으로 나눈 몫의 합이 n이 되어야 한다

        // lan을 정렬하기
        Arrays.sort(lan); // 랜선 오름차순 정리

        int maxLen = 0;
        int sum = 0;

        for (int i = 1; i < lan[k - 1]; i++) { // 가장 큰 길이

            sum = 0;
            for (int j = 0; j < k; j++) {
                sum += (int) (lan[j] / i);
                if (sum > n) {
                    break;
                }
            }

            if (sum == n && maxLen < i) {
                maxLen = i;
            }
        }

        System.out.print(maxLen);
    }

}
