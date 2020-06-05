import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A플B팔탄 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //Case #1: 1 + 1 = 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 0;
        int b = 0;

        int amount = Integer.parseInt(br.readLine());
        for(int i = 1; i <= amount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}