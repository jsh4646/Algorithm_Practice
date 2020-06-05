import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 1; i <= max; i++) {
            answer = answer + i;
        }

        System.out.println(answer);
    }
}