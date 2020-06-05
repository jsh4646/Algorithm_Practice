import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 베르트랑공준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, i, cnt = 0;
        while (true) {
            a = Integer.parseInt(br.readLine());
            if(a==0)break;
            boolean[] list = new boolean[2 * a];
            list[0] = true;
            
            for (i = 2; i <= (int)Math.sqrt((double)(2 * a)); i++) {
                for (int j = i * i ; j <= 2 * a; j += i) {
                    list[j - 1] = true;
                }
            }

            cnt = 0;
            for(i = a; i < 2 * a; i++) {
                if(!list[i]) cnt++;
            }
            bw.write(cnt +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}