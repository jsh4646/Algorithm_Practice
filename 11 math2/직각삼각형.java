import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int i;
        int[] tri = new int[3];
        int[] max = new int[2];

        exit :
        while (true) {
            max[0] = 0;
            max[1] = 3;
            st = new StringTokenizer(br.readLine());
            for(i = 0; i < 3; i++) {
                tri[i] = Integer.parseInt(st.nextToken());
                if(tri[i] == 0) break exit;
                if(tri[i] > max[0]) {
                    max[0] = tri[i];
                    max[1] = i;
                }
            }
            tri[max[1]] = 0;
            if(max[0] * max[0] == tri[0] * tri[0] + tri[1] * tri[1] + tri[2] * tri[2]) bw.write("right\n");
            else bw.write("wrong\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}