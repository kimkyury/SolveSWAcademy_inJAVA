
import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_1152 {
	public static void main(String[] args) {
		// int answer =0 ; // 개수 카운트
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		sc.close();

		StringTokenizer st = new StringTokenizer(words, " ");

		System.out.println(st.countTokens());
	}
}