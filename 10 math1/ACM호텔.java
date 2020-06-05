import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ACM호텔 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int h, n, roomNo;
        boolean one = false;

        int amount = Integer.parseInt(br.readLine());
        for (int i = 0; i < amount; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());

            if (n % h == 0) {
                bw.write(h + "");
                one = false;
            }
            else {
                bw.write((n % h) + "");
                one = true;
            }

            roomNo = one ? (n / h + 1) : (n / h);
            if(roomNo < 10) bw.write("0");
            bw.write(roomNo + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}