import java.io.*;
import java.util.*;

public class baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 개수 N 받기
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        ArrayList<String> word = new ArrayList<String>();

        // 알파벳 소문자로 이루어진 N개의 단어 입력받기
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        String temp;
        // 길이가 짧은 것 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].length() > words[j].length()) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        int i = 0;
        while (true) {
            if (i == n - 1) {
                if (words[i] != words[i - 1]) {
                    word.add(words[i]);
                }
                break;
            }
            if (words[i] == words[i + 1]) {
                continue;
            }
            word.add(words[i]);
            i++;
        }

        // 길이가 같으면 사전순으로 정렬

        int j = 0;
        while (true) {
            if (j == word.size()) {
                break;
            }
            for (int k = j; k < word.size(); k++) {
                if (word.get(j).length() == word.get(k).length()) {
                    temp = word.get(j);
                    word.set(j, word.get(k));
                    word.set(k, temp);
                }
            }
            j++;
        }

        for (int k = 0; k < word.size(); k++) {
            System.out.println(word.get(k));
        }
    }
}
