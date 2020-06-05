import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FlyMeToTheAlphaCentauri {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b, n, cnt=0;
        long square, dif;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            n = 1;
            cnt = 1;
            dif = b - a;
            while (true) {
                square = (long)n * (long)n;
                if (dif < square) {
                    n -= 1;
                    break;
                }
                n++;
            }
            dif = dif - n * n;
            cnt = n * 2 - 1;
            if(dif != 0) {
                while (true) {
                    if (dif > n) {
                        dif -= n;
                        cnt++;
                    }
                    else {
                        cnt++;
                        break;
                    }
                }
            }
            bw.write(cnt + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}