import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 하노이 {
    static int[][] list;
    static int cnt;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(counting(n, 1, 1));
        list = new int[(int)Math.pow(2, n) - 1][2];
        hanoi(n, 1, 2, 3);
        
        br.close();
        bw.flush();
        bw.close();
    }

    static void hanoi(int n, int start, int mid, int arv) throws IOException {
        if (n == 0) return;
       
        hanoi(n - 1, start, arv, mid);
        list[cnt][0] = start;
        list[cnt][1] = arv;
        bw.write(start + " " + arv + "\n");
        if(cnt % 8000 == 0) bw.flush();
        cnt++;
        hanoi(n - 1, mid, start, arv);
    }

    static int counting(int i, int num, int count) {
        if(i == 1) return 1;
     
        if(i != count) {
        num = num * 2 + 1;
        return counting(i, num, count+1);

        } else return num;
    }
}