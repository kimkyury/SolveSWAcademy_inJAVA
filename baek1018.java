import java.util.*;
import java.io.*;

public class baek1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판은 검은색과 흰색이 번갈아 칠해져 있어야함
        // 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져야함
        // 즉, 첫 칸이 흰색이냐 검은색이냐에 따른 두가지 종류 발생

        // 주어지는 입력값은 번갈아 칠해져있지 않을 수도 있다
        // 일단 주어진 체스판을 자르고
        // 몇 개의 정사각형은 다시 칠하는 방법을 택한다
        // 구할 것: 8x8을 잘랐을 때, 다시 칠할 정사각형의 최소 개수

        // NxM사이즈의 체스판 생성
        char[][] map = new char[N][M];


        //각 만들어질 체스판에서 색칠해야할 정사각 갯수를 담을 배열
        int[] counts = new int[(N-8+1)*(M-8+1)];
        for  (int i =0; i<(N-8+1)*(M-8+1); i++){
            counts[i] = 0;
        }

        char [] ex1 = {'W','B','W','B','W','B','W','B'};
        char [] ex2 = {'B','W','B','W','B','W','B','w'};



        StringBuilder sb;
        // char map에 입력받자
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = sb.charAt(j);
            }
        }


        for (int i = 0; i < N - 8; i++) {
            for (int j = 0; j < 8; j++){
                if
                counts[i] ++;
            }

            }
        }

    static int equal (char [] ex1, char [][] map){
            fo


        }

}
