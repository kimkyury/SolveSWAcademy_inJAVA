import java.io.*;

public class baek11726 {

    static int dp [];
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int [n+1];
        int answer = cal(n);
        // 홀수면 무조건 ro

        System.out.print(answer);
    }

    static int cal(int n){
        dp[1] = 1;
        dp[2] = 2;

        //2xn을 만들려면, 2x(n-1)에서 [ | ] 를 하나씩 추가하거나
        //  2X(n-2)에서 [ = ] 를 하나씩 추가한다
        dp[n] = dp[n-1] + dp[n-2];
        return dp[n];
    }
}
