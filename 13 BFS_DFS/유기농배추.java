import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {
    static int cnt = 0;
    public static void main(String[] args) {
        int t = 0;
        int m = 0;
        int n = 0;
        int k = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //테스트케이스의 갯수(t)
            t = Integer.parseInt(br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
        //정답을 담을 배열
        int answer[] = new int[t];
        for (int i = 0; i < t; i++) {
            //배추벌레 마리수 초기화
            cnt = 0;

            try {
                //밭 가로길이(m), 세로길이(n), 배추갯수(k) 입력
                String mnk = br.readLine();
                StringTokenizer st = new StringTokenizer(mnk, " ");
                m = Integer.parseInt(st.nextToken());
                n = Integer.parseInt(st.nextToken());
                k = Integer.parseInt(st.nextToken());
            } catch(IOException e) {
                e.printStackTrace();
            }

            //밭 크기 설정
            int cab[][] = new int[m][n];

            //배추 위치 입력
            for(int j = 0; j < k; j++) {
                try {
                    String xy = br.readLine();
                    StringTokenizer st = new StringTokenizer(xy, " ");
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    cab[x][y] = 1;
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            
            for(int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    if (cab[a][b] == 1 ) {
                        search(a, b, m, n, cab, 0);
                    }
                }
            }


            //현 테스트케이스에 정답 입력
            answer[i] = cnt;
        }

        for(int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }

    //x좌표, y좌표, 가로길이, 세로길이, 배열, 최초여부
    public static void search(int x, int y, int m, int n, int cab[][], int check) {
        if (check == 0) {
            cnt++;
            search(x, y, m, n, cab, 1);
        } else {
            //가로+1 검사
            if(x + 1 < m && cab[x+1][y] == 1) {
                cab[x+1][y] = 0;
                search(x+1, y, m, n, cab, 1);
            }
            //가로-1 검사
            if(x - 1 >= 0 && cab[x-1][y] == 1) {
                cab[x-1][y] = 0;
                search(x-1, y, m, n, cab, 1);
            }

            //세로+1 검사
            if(y + 1 < n && cab[x][y+1] == 1) {
                cab[x][y+1] = 0;
                search(x, y+1, m, n, cab, 1);
            }

            //세로-1 검사
            if(y - 1 >= 0 && cab[x][y-1] == 1) {
                cab[x][y-1] = 0;
                search(x, y-1, m, n, cab, 1);
            }
        }
    }
}