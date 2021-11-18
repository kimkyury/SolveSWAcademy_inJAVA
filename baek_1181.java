import java.io.*;
import java.util.*;

public class baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> word = new ArrayList<String>();
        String temp;

        // 단어를 중복없이 입력받기
        for (int i = 0; i < n; i++) {
            temp = br.readLine();
            if (word.contains(temp)) {
                continue;
            }
            word.add(temp);
        }

        Collections.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length())
                    return s1.compareTo(s2);
                else
                    return s1.length() - s2.length();
            }
        });

        /*
         * 
         * 
         * for (int i = 0; i < word.size() - 1; i++) { for (int j = i; j < word.size();
         * j++) { if (word.get(i).length() > word.get(j).length()) { temp = word.get(i);
         * word.set(i, word.get(j)); word.set(j, temp); } else if (word.get(i).length()
         * == word.get(j).length()) { for (int k = 0; k < word.get(i).length(); k++) {
         * if (word.get(i).charAt(k) < word.get(j).charAt(k)) { break; } else if
         * (word.get(i).charAt(k) == word.get(j).charAt(k)) { continue; } else { temp =
         * word.get(i); word.set(i, word.get(j)); word.set(j, temp); break; } } } } }
         */
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