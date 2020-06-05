import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int up = w - x > h - y ? h - y : w - x;
        int down = x > y ? y : x;

        int answer = up > down ? down : up;

        bw.write(answer + "");
        
        br.close();
        bw.flush();
        bw.close();
    }
}