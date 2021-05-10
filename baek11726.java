import java.io.*;

public class baek11726 {

    static int dp [];
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        dp = new int [n+1];
        dp[1] = 1;
        dp[2] = 2;
        System.out.print(cal(n));
    }

    static public int cal(int n){
        if(dp[n] >0){
            return dp[n];
        }
        //2xn을 만들려면, 2x(n-1)에서 [ | ] 를 하나씩 추가하거나
        //  2X(n-2)에서 [ = ] 를 하나씩 추가한다
        dp[n] = (cal(n-1) + cal(n-2)) % 10007;
        return dp[n];
    }
}
