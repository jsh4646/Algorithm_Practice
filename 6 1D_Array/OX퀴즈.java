import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX퀴즈 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String temp = "";
        int score = 1;
        int sum;
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            temp = br.readLine();
            sum = 0;
            score = 1;
            for(int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'O') {
                    sum += score++;
                } else {
                    score = 1;
                }
            }
            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}