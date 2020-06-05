import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A플B사탄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ab = "";
        StringTokenizer st;
    
        while(( ab = br.readLine() ) != null && ab.length() > 0) {
            st = new StringTokenizer(ab);
            bw.write( (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}