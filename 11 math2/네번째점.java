import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 네번째점 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, j, a = 0, b = 0;

        Number[] list = new Number[3];

        for(i = 0; i < 3; i++) {
            list[i] = new Number();
            list[i].input(br.readLine());
        }

        
        
        //떨어진 점의 x좌표 저장
        for(i = 0; i < 3; i++) {
            if(!list[i].chkX) a = list[i].x;
        }


        //y좌표가 같은 점 찾기
        for(i = 0; i < 3; i++) {
            for(j = i+1; j < 3; j++) {
                if(list[i].y == list[j].y) {
                    list[i].chkY = true;
                    list[j].chkY = true;
                }
            }
        }
        //y좌표가 다른 점의 y좌표 저장
        for(i = 0; i < 3; i++) {
            if(!list[i].chkY) b = list[i].y;
        }

        bw.write(a + " " + b);

        br.close();
        bw.flush();
        bw.close();
    }
}

class Number{
    int x, y;
    boolean chkX, chkY;

    void input(String s) {
        StringTokenizer st = new StringTokenizer(s);
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y + ", chkX : " + chkX + ", chkY : " + chkY;
    }
}