import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 평균점수 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int input = 0;

        for(int i = 0; i < 5; i++) {
            sum = ( (input = Integer.parseInt(br.readLine()) ) < 40) ? sum + 40 : sum + input;
        }

        br.close();
        bw.write(sum/5 + "");
        bw.flush();
        bw.close();
    }
}