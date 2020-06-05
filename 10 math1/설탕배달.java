import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕배달 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp;
        int cnt = num/5;
        int answer = 0;
        boolean able = false;

        for(int i = cnt; i >= 0; i--) {
            answer = 0;
            temp = num;
            answer += i;
            temp = num - 5 * i;
            if(temp % 3 == 0) {
                answer += temp/3;
                able = true;
                break;
            }
        }
        
        if (!able) answer = -1;
        br.close();
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}