import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tempA, tempB;

        int answer = (tempA = reverse(a) ) > (tempB = reverse(b)) ? tempA : tempB;
        
        br.close();
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static int reverse(int i) {
        i = i/100 + (i/10 % 10 * 10) + (i % 10 * 100);
        return i;
    }
}