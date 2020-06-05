import java.util.ArrayList;
import java.util.Collections;

class H인덱스 {
    public int solution(int[] cit) {
        int answer = 0;
        int maxcnt = 0;
        int mincnt = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        int length = cit[0];
        for (int i = 0; i < cit.length; i++) {
            if (cit[i] > length) {
                length = cit[i];
            }
        }
        for (int i = 0; i <= length; i++) {
        	maxcnt = 0;
            mincnt = 0;
        	for (int j = 0; j < cit.length; j++) {
        		if(cit[j] >= i) {
        			maxcnt++;
        		}
        		if(cit[j] <= i) {
        			mincnt++;
        		}
        	}
        	if(maxcnt >= i && mincnt <= i) {
        		list.add(i);
        	}
        }
        answer = Collections.max(list);
        return answer;
    }
}