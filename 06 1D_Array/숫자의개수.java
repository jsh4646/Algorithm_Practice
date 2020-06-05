import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String num = Integer.toString(a * b * c);

        for(int i = 0; i < num.length(); i++) {
            score.cal(num.charAt(i) - '0');
        }
        score.result();
    }

    static class score {
        static int a0;
        static int a1;
        static int a2;
        static int a3;
        static int a4;
        static int a5;
        static int a6;
        static int a7;
        static int a8;
        static int a9;

        static void cal(int i) {
            if (i == 0) {
                a0++;
            } else if(i == 1) {
                a1++;
            } else if(i == 2) {
                a2++;
            } else if(i == 3) {
                a3++;
            } else if(i == 4) {
                a4++;
            } else if(i == 5) {
                a5++;
            } else if(i == 6) {
                a6++;
            } else if(i == 7) {
                a7++;
            } else if(i == 8) {
                a8++;
            } else if(i == 9) {
                a9++;
            }
        }

        static void result() {
            System.out.println(a0 + " " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7 + " " + a8 + " " + a9);
        }
    }
}