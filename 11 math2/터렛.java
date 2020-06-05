import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] turret = new int[6];
        int d1, d2, d3;

        int t = Integer.parseInt(br.readLine());
        for(int r = 0; r < t; r++) {
            st = new StringTokenizer(br.readLine());
            
            for(int i = 0; i < 6; i++) {
                turret[i] = Integer.parseInt(st.nextToken());
            }
            if(turret[0] == turret[3] && turret[1] == turret[4] && turret[2] == turret[5]) {
                bw.write(-1 + "\n");
                continue;
            }
            //반지름의 합
            //d1 = (turret[2] + turret[5]) * 10;
            d1 = (turret[2] + turret[5]);
            d1 = d1 * d1;

            //반지름의 차
            //d2 = (Math.abs(turret[2] - turret[5])) * 10;
            d2 = (Math.abs(turret[2] - turret[5]));
            d2 = d2 * d2;
            
            //두 지점 사이의 거리
            //d3 = (int)Math.round( (Math.sqrt( Math.pow(turret[0] - turret[3], 2) + Math.pow(turret[1] - turret[4], 2) ) ) * 10);
            d3 = (int) (Math.pow(turret[0] - turret[3], 2) + Math.pow(turret[1] - turret[4], 2));

            if(d2 < d3 && d3 < d1) bw.write(2 + "\n");
            else if(d1 == d3 || d2 == d3) bw.write(1 + "\n");
            else if(d1 < d3 || d3 < d2) bw.write(0 + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}