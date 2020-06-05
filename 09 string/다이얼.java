import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += dial(str.charAt(i));
        }

        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }

    static int dial(char ch) {
        int result = 0;
        if (ch < (char)83) result = (ch - 65) / 3 + 3;
        else if (ch > (char)82 && ch < 'Z') result = (ch - 65 - 1) / 3 + 3;
        else result = 10;
        
        return result;
    }
}