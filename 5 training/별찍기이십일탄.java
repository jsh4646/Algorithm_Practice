import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기이십일탄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j%2==0) bw.write("*");
                else bw.write(" ");
            }
            if (num != 1) bw.newLine();

            for (int j = 0; j < num; j++) {
                if (j%2==0) bw.write(" ");
                else bw.write("*");
            }
            if (num != 1) bw.newLine();
        }

        // for(int i = 0; i<num*2;i++) {
        //     for(int j = 0; j<num;j++) {
        //         if((i +j )%2 == 0)
        //             bw.write("*");
        //         else
        //             bw.write(" ");
        //     }
        //     bw.write("\n");
        // }

        br.close();
        bw.flush();
        bw.close();
    }
}