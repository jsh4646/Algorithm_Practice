import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 네번째점2 {
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;;

        int[] list = new int[6];
        int a = 0, b = 0;

        for(int i =0; i < 6; i++) {
            if(i % 2 ==0) st = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st.nextToken());
        }

        if(list[0] == list[2]) {
            a = list[4];
        } else if(list[0] == list[4]) {
            a = list[2];
        } else {
            a = list[0];
        }

        if(list[1] == list[3]) {
            b = list[5];
        } else if(list[1] == list[5]) {
            b = list[3];
        } else {
            b = list[1];
        }

        br.close();
        bw.write(a + " " + b);
        bw.flush();
        bw.close();
    }
}