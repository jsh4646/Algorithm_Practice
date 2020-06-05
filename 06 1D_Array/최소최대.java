import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int temp = 0;
        boolean big = false, small = false;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = (temp = Integer.parseInt(st.nextToken()) );
            if (temp == 1000000) {
                big = true;
            } 
            if (temp == -1000000) {
                small = true;
            }
            if (big && small) {
                bw.write(-1000000 + " " + 1000000);
                bw.flush();
                bw.close();
                return;
            }
        }
        Arrays.sort(list);
        br.close();
        bw.write(list[0] + " " + list[size-1]);
        bw.flush();
        bw.close();
    }
}