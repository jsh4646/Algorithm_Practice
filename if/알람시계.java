import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        StringTokenizer st = new StringTokenizer(time);
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        //분단위가 45 초과인가?
        if (min > 45) {
            min = min - 45;
            System.out.println(hour + " " + min);
        }
        //분단위가 45인가?
        else if(min == 45) {
            min = 0;
            System.out.println(hour + " " + min);
        }
        //분단위가 45 미만인가?
        else {
            hour--;
            min = min + 15;
            //-1시 체크
            if(hour < 0) {
                System.out.println(23 + " " + min);    
            } else {
            System.out.println(hour + " " + min);
            }
        }
    }
}