import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        
        br.readLine();
        String num = br.readLine();

        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - 48;
        }

        br.close();
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}