import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bee(Integer.parseInt(br.readLine()), 1, 1);
    }

    static void bee(int num, int dif, int cnt) {
        if (dif - num >= 0) {
            System.out.println(cnt);
            return;
        } else {
            bee(num, dif+6*cnt, cnt+1);
        }
    }
}