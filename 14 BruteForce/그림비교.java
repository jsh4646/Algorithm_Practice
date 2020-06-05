import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 그림비교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        ArrayList<StringBuilder> img = new ArrayList<StringBuilder>();
        int[][] compare = new int[amount][amount];
        StringBuilder answer = new StringBuilder("");
        //입력받기
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 ) {
                    img.add(new StringBuilder(br.readLine()));
                } else {
                    img.get(i).append(br.readLine());
                }
            }
        }
        int min = 0;
        for (int i = 0; i < amount; i++) {
            for (int j = i+1; j < amount; j++) {
                for (int k = 0; k < 35; k++) {
                    if (img.get(i).charAt(k) != img.get(j).charAt(k)) {
                        compare[i][j]++;
                    }
                }
                //최초 비교시 min값 저장
                if(i == 0 & j == 1) {
                    min = compare[i][j];
                    answer.delete(0, 6);
                    answer.append((i+1) + " " + (j+1));
                }
                //min보다 작은 값 발견시 저장
                if (min > compare[i][j]) {
                    min = compare[i][j];
                    answer.delete(0, 6);
                    answer.append((i+1) + " " + (j+1));
                }
            }
        }
        System.out.println(answer);
    }
}