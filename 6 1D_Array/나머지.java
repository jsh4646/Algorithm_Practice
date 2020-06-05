import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 나머지 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[42];
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            list[Integer.parseInt(br.readLine()) % 42] = 1;
        }

        for(int chk : list) {
            if(chk == 1) cnt++;
        }
        br.close();
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}