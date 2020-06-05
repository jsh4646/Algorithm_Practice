import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팩토리얼 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(fac(Integer.parseInt(br.readLine()), 1) + "");
        br.close();
        bw.flush();
        bw.close();
    }

    static int fac(int i, int sum) throws IOException {
        if (i > 1) {
            sum *= i;
            return fac(i-1, sum);
        } else {
            return sum;
        }
    }
}