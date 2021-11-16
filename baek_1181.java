import java.io.*;
import java.util.*;

public class baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> word = new ArrayList<String>();

        String temp;
        Boolean isExist = false;

        // 단어를 중복없이 입력받기
        word.add(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            temp = br.readLine();
            for (int j = 0; j < word.size(); j++) {
                if (word.get(j).equals(temp))
                    isExist = true;
            }
            if (isExist == true) {
                isExist = false;
                continue;
            }
            word.add(temp);
        }

        // 길이순 정렬, 사전 순 정렬
        for (int i = 0; i < word.size() - 1; i++) {
            for (int j = i; j < word.size(); j++) {
                if (word.get(i).length() > word.get(j).length()) {
                    temp = word.get(i);
                    word.set(i, word.get(j));
                    word.set(j, temp);
                } else if (word.get(i).length() == word.get(j).length()) {
                    for (int k = 0; k < word.get(i).length(); k++) {
                        if (word.get(i).charAt(k) < word.get(j).charAt(k)) {
                            break;
                        } else if (word.get(i).charAt(k) == word.get(j).charAt(k)) {
                            continue;
                        } else {
                            temp = word.get(i);
                            word.set(i, word.get(j));
                            word.set(j, temp);
                            break;
                        }
                    }
                }
            }
        }
        /*
         * // 같은 길이일때 사전 순 정렬 for (int i = 0; i < word.size() - 1; i++) { for (int j =
         * i; j < word.size(); j++) { if (word.get(i).length() == word.get(j).length())
         * { for (int k = 0; k < word.get(i).length(); k++) { if (word.get(i).charAt(k)
         * > word.get(j).charAt(k)) { temp = word.get(i); word.set(i, word.get(j));
         * word.set(j, temp); } } } } }
         */
        // 출력
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }

    }
}