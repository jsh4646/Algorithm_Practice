import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 셀프넘버 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] full = new int[10000];

        for(int i = 1; i <= 10000; i++) {
            if (i < 10) {
                full[i + i - 1] = 1;
            }
            if (i >= 10 && i < 100) {
                full[i + (i / 10) + (i % 10) - 1] = 1;
            }
            if (i >= 100 && i < 1000) {
                full[i + (i / 100) + ((i % 100) / 10) + (i % 10) - 1] = 1;
            }
            if (i >= 1000 && i < 10000) {
                if ( (i + (i / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + ((i % 10)) - 1) < 10000 ) {
                    full[i + (i / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + ((i % 10)) - 1] = 1;
                }
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (full[i] == 0) bw.write(( i + 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}