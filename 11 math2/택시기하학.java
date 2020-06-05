import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 택시기하학 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());

        br.close();
        bw.write(Math.PI * r * r + "\n");
        bw.write(r * r * 2 + "");
        bw.close();
    }
}