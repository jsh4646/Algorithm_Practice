import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 부녀회장이될테야 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int f, r;
        int[] apt;
        for (int i = 0; i < t; i ++) {
            f = Integer.parseInt(br.readLine());
            r = Integer.parseInt(br.readLine());
            apt = new int[r];
            for(int j = 0; j < r; j++) {
                if(j==0) {
                    apt[j] = 1;
                }
                else {
                    apt[j] = apt[j-1] + 1;
                }
            }
            apt(f, r, apt, 0, 0);
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static void apt(int f, int r, int[] apt, int cnt, int sum) throws IOException {
        if (cnt < f) {
            sum = 0;
            int sumTemp = 0;
            int temp = 0;
            for (int i = r-1; i >= 0; i--) {
                sum += apt[i];
            }
            sumTemp = sum;

            for (int i = r-1; i >= 0; i--) {
                temp = apt[i];
                apt[i] = sum;
                sum -= temp;
            }
            apt(f, r, apt, cnt+1, sumTemp);
        }
        else {
            if(f!=0) bw.write(sum + "\n");
            else bw.write(r + "\n");
        }
    }
}