import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 골드바흐의추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num, a, b, i;
        boolean[] list = new boolean[10000];
        list[0] = true;

        for (i = 2; i <= 100; i++) {
            for (int j = i * i; j < 10000; j += i) {
                list[j - 1] = true;
            }
        }

        int amount = Integer.parseInt(br.readLine());
        for(i = 0; i < amount; i++) {
            num = Integer.parseInt(br.readLine());
            
            a = num / 2;
            if(!list[a-1]) {
                bw.write(a + " " + a + "\n");
                continue;
            }
            b = a;
            while(true) {
                a--;
                b++;
                if(!list[a-1] && !list[b-1]) {
                    bw.write(a + " " + b + "\n");
                    break;
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}