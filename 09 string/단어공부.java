import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class 단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0, max = -1;
        char answer = 'a';

        //각 글자마다 갯수 계산
        for(int i = 65; i < 65 + 26; i++) {
            cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if((char)i == str.charAt(j)) cnt++;
            }
            //각 알파벳마다 갯수 저장 및 최대 갯수 저장
            map.put((char)i, cnt);
            if (max < cnt) max = cnt;
        }


        //최대 갯수 알파벳 확인
        cnt = 0;
        for (int i = 65; i < 65 + 26; i++) {
            if ( cnt == 0 ) {
                if (max == map.get((char)i) ) {
                    answer = (char)i;
                    cnt++;
                }
            }
            //동일 갯수 알파벳이 2개 이상일 경우
            else {
                if (max == map.get((char)i) ) {
                    answer = '?';
                    break;
                }
            }
        }
        
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}