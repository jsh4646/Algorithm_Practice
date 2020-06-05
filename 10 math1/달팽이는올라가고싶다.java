import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        //2 1 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arg[] = new int[3];
        for(int i = 0; i < 3; i++) {
            arg[i] = Integer.parseInt(st.nextToken());
        }
        if ((arg[2] - arg[0]) % (arg[0] - arg[1]) == 0) System.out.println( (arg[2] - arg[0]) / (arg[0] - arg[1]) + 1);
        else System.out.println( (arg[2] - arg[0]) / (arg[0] - arg[1]) + 2);
    }
}