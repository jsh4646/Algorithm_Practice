import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        
        for (int i = 97; i < 97 + 26; i++) {
            bw.write(str.indexOf((char)i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}