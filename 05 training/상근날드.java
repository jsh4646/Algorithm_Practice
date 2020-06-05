import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 상근날드 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int burger = 2000;
        int juice = 2000;
        int temp = 0;

        for (int i = 0; i < 3; i++) {
            burger = (temp = Integer.parseInt(br.readLine()) ) < burger ? temp : burger;
        }
        for (int i = 0; i < 2; i++) {
            juice = (temp = Integer.parseInt(br.readLine()) ) < juice ? temp : juice;
        }

        br.close();
        bw.write( (burger + juice) - 50 + "");
        bw.flush();
        bw.close();
    }
}