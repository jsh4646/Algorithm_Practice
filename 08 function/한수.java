import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 한수 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i <= max; i++) {
            if (check(i)) cnt++;
        }
        br.close();
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }

    static boolean check(int num) {
        boolean result = true;
        String numStr = Integer.toString(num);
        int temp = 0;
        for (int i = 0; num/10 > 0 && i < numStr.length(); i++, num /= 10) {
            if (i == 0) {
                temp = numStr.charAt(i) - numStr.charAt(i+1);
            }
            else result = temp == numStr.charAt(i) - numStr.charAt(i+1) ? true : false;
        }
        return result;
    }
}