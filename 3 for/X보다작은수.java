import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException {
        //10 5
        //1 10 4 9 2 3 8 5 7 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int point = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = Integer.parseInt(st.nextToken());
            if (temp < point) {
                bw.write(temp + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}