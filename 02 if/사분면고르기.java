import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사분면고르기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        //x양 y양
        if(x > 0 && y > 0) {
            System.out.println(1);
        }
        //x양 y음
        if(x > 0 && y < 0) {
            System.out.println(4);
        }
        //x음 y양
        if(x < 0 && y > 0) {
            System.out.println(2);
        }
        //x음 y음
        if(x < 0 && y < 0) {
            System.out.println(3);
        }
    }   
}