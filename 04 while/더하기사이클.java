import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 더하기사이클 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = 0;
        int answer = 100;
        int num = Integer.parseInt(br.readLine());
        int temp = num;
        while (num != answer) {
            answer = temp%10 * 10 + (temp/10 + temp%10) % 10;
            temp = answer;
            cnt++;
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}