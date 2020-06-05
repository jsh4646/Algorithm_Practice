import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기구탄 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num *2 -1; j++) {
                if(j < i) bw.write(" ");
                else if(num*2 -1 -i == j) break;
                else bw.write("*");
            }
            bw.newLine();
        }

        for(int i = num-2; i >= 0; i--) {
            for (int j = 0; j < num*2 -1; j++) {
                if(j < i) bw.write(" ");
                else if(num*2 -1 -i == j) break;
                else bw.write("*");
            }
            bw.newLine();
        }


        br.close();
        bw.flush();
        bw.close();
    }
}