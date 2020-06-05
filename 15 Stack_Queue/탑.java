class 탑 {
    public int[] solution(int[] heights) {
        // 마지막 index
		int last = heights.length - 1;
		// 정답용 배열
		int[] answer = new int[last + 1];
		
		for (int i = last; i > 0; i--) {
			for (int j = i-1; j >= 0; j--) {
				//i탑보다 j탑의 높이가 더 높을 경우
				if (heights[i] < heights[j]) {
					//현재 j+1를 저장 (탑 번호는 1부터 시작)
					answer[i] = j+1;
					break;
				}
			}
		}
        
        return answer;
    }
}