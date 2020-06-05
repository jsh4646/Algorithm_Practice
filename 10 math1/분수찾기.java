import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        search(Integer.parseInt(br.readLine()), 1, true);
    }

    static void search(int num, int cnt, boolean direction) {
        if (num - cnt <= 0) {
            if (direction) {
                System.out.println( (cnt - (num - 1)) + "/" + (1 + (num - 1)) );
            } else {
                System.out.println( (1 + (num - 1)) + "/" + (cnt - (num - 1)) );
            }
        } else {
            direction = direction ? false : true;
            search(num - cnt, cnt+1, direction);
        }
    }
}