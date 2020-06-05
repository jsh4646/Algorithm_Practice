import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count, amount = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        StringBuilder answer;

        for(int i = 0; i < amount; i++) {
            answer = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            count = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for (int k = 0; k < str.length(); k++) {
                for (int j = 0; j < count; j++) {
                    answer.append(str.charAt(k));
                }
            }
            bw.write(answer.toString()+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}