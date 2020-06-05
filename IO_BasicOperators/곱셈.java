import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
              
        int b3 = b % 10;
        int b2 = b/10 % 10;
        int b1 = b/100;

        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);
        System.out.println(a * b);
    }
}