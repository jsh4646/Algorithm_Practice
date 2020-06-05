import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
        //c= c- dz= d- lj nj s= z=

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arg = br.readLine();
        
        br.close();
        bw.write(replace(arg).length() + "");
        bw.flush();
        bw.close();
    }

    static String replace(String str) {
        str = str.replace("c=", "*");
        str = str.replace("c-", "*");
        str = str.replace("dz=", "*");
        str = str.replace("d-", "*");
        str = str.replace("lj", "*");
        str = str.replace("nj", "*");
        str = str.replace("s=", "*");
        str = str.replace("z=", "*");
        return str;
    }
}