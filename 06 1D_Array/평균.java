import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());
        double[] list = new double[amount];
        int max = -1;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < amount; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            if (list[i] > max) max = (int)list[i];
        }

        for (int i = 0; i < amount; i++) {
            list[i] = list[i] == 0 ? 0 : list[i] / max * 100;
            sum += list[i];
        }
        
        br.close();
        bw.write(sum/amount + "");
        bw.flush();
        bw.close();
    }
}