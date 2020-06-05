import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 별찍기10 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i;

        char[][] answer = new char[n][n];
        for(i = 0; i < answer.length; i++) {
            Arrays.fill(answer[i], '*');
        }
        answer = star(n, answer);

        for(i = 0; i < answer.length; i++) {
            bw.write(answer + "");
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }


    static char[][] star(int n, char[][] answer) {
        if(n != 1) {
            for(int i = 0; i < answer.length; i++) {
                for(int j = 0; j < answer.length; j++) {
                    if(i % n >= n/3 && i % n < n/3 + n/3) {
                        if(j % n >= n/3 && j % n < n/3 + n/3) {
                            answer[i][j] = ' ';
                        }
                    }
                }
            }
            return star(n/3, answer);
        } else {
            return answer;
        }
    }
}