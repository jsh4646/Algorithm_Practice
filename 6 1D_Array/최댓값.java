import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 최댓값 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int index = 0;
        int temp = 0;
        for (int i = 1; i <= 9; i++) {
            if(max < (temp = Integer.parseInt(br.readLine())) ) {
                max = temp;
                index = i;
            }
        }
        br.close();
        bw.write(max + "\n" + index);
        bw.flush();
        bw.close();
    }
}