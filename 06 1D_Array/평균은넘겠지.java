import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] list;
        int sum = 0, answerCnt = 0;
        double avg = 0;

        int amount = Integer.parseInt(br.readLine());
        for (int i = 0; i < amount; i++) {
            sum = 0;
            answerCnt = 0;
            avg = 0;

            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            list = new int[count];

            //평균값
            for (int j = 0; j < count; j++) {
                list[j] = Integer.parseInt(st.nextToken());
                sum += list[j];
            }
            avg = (double)sum / count;

            //평균을 넘는 학생 수
            for (int j : list) {
                if (j > avg) {
                    answerCnt++;
                }
            }
            bw.write(String.format("%.3f", (double)answerCnt*100 / count) + "%\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}