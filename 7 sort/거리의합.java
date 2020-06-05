import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumStance {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long dd[] = new long[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < dd.length; i++) {
            dd[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < dd.length; j++) {
                sum = sum + Math.abs(dd[i] - dd[j]);
            }
        }
        System.out.println(sum);
    }
}