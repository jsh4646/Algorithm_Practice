import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단 {
    public static void main(String[] args) throws IOException {
        //2 * 1 = 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = "  + (a*i) );
        }
    }
}