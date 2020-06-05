import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치5 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if(num == 0) bw.write(0 + "");
        else bw.write(fib(0, 1, num, 1) + "");
        br.close();
        bw.flush();
        bw.close();
    }
    static int fib(int a, int b, int num, int cnt) {
        if(num != cnt) {
            return fib(b, a+b, num, cnt+1);
        } else {
            return b;
        }
    }
}