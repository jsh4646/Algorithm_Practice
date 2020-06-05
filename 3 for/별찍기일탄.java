import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기일탄 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( i >= j) {
                    bw.write("*");
                } else {
                    bw.write("\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}