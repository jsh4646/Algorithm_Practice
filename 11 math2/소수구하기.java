import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i;
        boolean[] list = new boolean[b];
        list[0] = true;
        
        for (i = 2; i <= (int)Math.sqrt((double)b); i++) {
            for (int j = i * i ; j <= b; j += i) {
                list[j - 1] = true;
            }
        }

        for(i = a - 1; i < b; i++) {
            if(!list[i]) bw.write(i+1 +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}