import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A플B삼탄 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        int[] tCase = new int[amount];
        for (int i = 0; i < amount; i++) {
            String[] temp = br.readLine().split(" ");
            tCase[i] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
        }
        for (int answer : tCase) {
            System.out.println(answer);
        }
    }
}