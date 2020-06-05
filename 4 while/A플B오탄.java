import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A플B오탄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            answer = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if(answer == 0) {
                break;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}