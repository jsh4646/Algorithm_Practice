import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 소수찾기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());
        int num, cnt = 0, cntTemp = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < amount; i++) {
            num = Integer.parseInt(st.nextToken());
            cntTemp = 0;
            //2일때
            if (num == 2) {
                cnt++;
                
                //1이 아닐 때
            } else if (num == 1) {
                
                //짝수가 아닐 때
            } else if (num % 2 != 0) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) cntTemp++;
                }
                if(cntTemp == 2) cnt++;
            }
        }
        br.close();
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}