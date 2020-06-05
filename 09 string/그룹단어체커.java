import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 그룹단어체커 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int[] alphabet;
        int temp;
        
        int amount = Integer.parseInt(br.readLine());
        int cnt = amount;
        
        //입력받은 횟수만큼 반복
        for (int i = 0; i < amount; i++) {
            alphabet = new int[26];
            temp = 0;
            str = br.readLine();

            //글자를 입력받고 반복
            for (int j = 0; j < str.length(); j++) {
                //2회차 이후
                if (j != 0) {
                    //글자가 달라짐
                    if(temp != str.charAt(j)) {
                        //현재 글자가 등록된 글자인지 체크
                        if (alphabet[str.charAt(j) - 'a'] == 1) {
                            cnt--;
                            break;
                        }

                        //이전 글자를 중복 목록에 추가
                        alphabet[temp - 'a'] = 1;
                    }
                }
                temp = str.charAt(j);
            }
        }
        br.close();
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}