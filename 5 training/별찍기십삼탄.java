import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기십삼탄 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());

        for (int i = 0; i < amount; i++) {
            for (int j = amount - i; j <= amount; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = amount-1; i > 0; i--) {
            for (int j = amount - i; j < amount; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}