import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int i, cnt, temp, sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        //범위 내의 1, 2가 아닌 모든 홀수 저장
        for(i = a; i <= b; i++) {
            switch(i) {
                case 1: break;
                case 2: list.add(2); break;
                default : if(i % 2 != 0) list.add(i);
            }
        }
        
        //소수 검사
        for (i = 4; i <= b; i++) {
            cnt = 0;
            temp = (int)Math.sqrt((double)i);

            for (int j = 2; j <= temp; j++) {
                if(i % j == 0) cnt++;
            }
            if(cnt != 0) {
                list.remove((Object)i);
            }
        }
        
        //소수의 합 구하기
        for(i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        br.close();
        if(sum != 0) bw.write(sum + "\n");
        if(list.size() == 0) bw.write(-1 + "");
        else bw.write(list.get(0) + "");
        bw.flush();
        bw.close();
    }
}