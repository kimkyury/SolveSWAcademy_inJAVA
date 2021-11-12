import java.io.*;
import java.util.*;
import java.lang.Math;

public class baek_2475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        int len = st.length();
        int remainder = 0;

        for (int i = 0; i < len; i++) {
            remainder += Math.pow((int) st.charAt(i), 2);
        }

        remainder = remainder % 10;

        System.out.print(remainder);

    }
}
