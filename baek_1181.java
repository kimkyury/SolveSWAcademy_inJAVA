import java.io.*;
import java.util.*;

public class baek_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
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

        // 길이순 정렬
        for (int i = 0; i < word.size() - 1; i++) {
            for (int j = i; j < word.size(); j++) {
                if (word.get(i).length() > word.get(j).length()) {
                    temp = word.get(i);
                    word.set(i, word.get(j));
                    word.set(j, temp);
                }
            }
        }

        int j = 0;
        while (true) {
            if (j == word.size()) {
                break;
            }
            for (int k = j; k < word.size(); k++) {
                if (word.get(j).length() == word.get(k).length()) {
                    for (int l = 0; l < word.get(j).length(); l++) {
                        if (word.get(j).charAt(l) > word.get(k).charAt(l)) {
                            temp = word.get(j);
                            word.set(j, word.get(k));
                            word.set(k, temp);
                        }
                    }
                }
            }
            j++;
        }

        // 출력
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }
    }
}

/*
 * // 알파벳 소문자로 이루어진 N개의 단어 입력받기 for (int i = 0; i < n; i++) { words[i] =
 * br.readLine(); }
 * 
 * String temp; // 길이가 짧은 것 정렬 for (int i = 0; i < n -1; i++) { for (int j = i +
 * 1; j <n; j++) { if (words[i].length() > words[j].length()) { temp = words[i];
 * words[i] = words[j]; words[j] = temp; } } }
 * 
 * int i=0; while(true){ if( i == n-1){ if( words[i] != words[i-1]){
 * word.add(words[i]); } break; } if (words[i] == words[i+1]){ continue; }
 * word.add(words[i]); i++; }
 * 
 * 
 * // 길이가 같으면 사전순으로 정렬
 * 
 * int j =0; while(true){ if(j == word.size()){ break; } for(int k =j;
 * k<word.size(); k++){ if(word.get(j).length() == word.get(k).length()){ temp =
 * word.get(j); word.set(j, word.get(k)); word.set(k, temp); } } j++; }
 * 
 * for(int k=0; k<word.size(); k++){ System.out.println(word.get(k)); } } }
 */