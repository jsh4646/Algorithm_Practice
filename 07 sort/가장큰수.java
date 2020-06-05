class 가장큰수 {
    public String solution(int[] numbers) {
        int size = numbers.length;
		String[] nString = new String[size]; 
		for(int i = 0; i < size; i++) {
			nString[i] = Integer.toString(numbers[i]);
		}
		String tempstr;
		for (int i = 0; i < size-1; i++) {
			for (int j = 0; j < size-1-i; j++) {
				//앞자리 수끼리 비교하여 내림차순으로 정렬
				if (Integer.parseInt(nString[j].substring(0, 1)) < Integer.parseInt(nString[j + 1].substring(0, 1))) {
					tempstr = nString[j];
					nString[j] = nString[j + 1];
					nString[j + 1] = tempstr;
				}
				//앞자리 수가 같을 때
				if (Integer.parseInt(nString[j].substring(0, 1)) == Integer.parseInt(nString[j + 1].substring(0, 1))) {
					//전자가 1자리수, 후자가 2자리수 이상
					if (nString[j].length() == 1 && nString[j + 1].length() >= 2) {
						//후자의 2번째 자리수가 전자보다 클 경우 내림차순
						if( Integer.parseInt(nString[j].substring(0, 1)) < Integer.parseInt(nString[j + 1].substring(1, 2)) ) {
							tempstr = nString[j];
							nString[j] = nString[j + 1];
							nString[j + 1] = tempstr;
						}
					}
					if (nString[j].length() == 2 && nString[j + 1].length() >= 2) {
						//후자의 2번째 자리수가 전자 2번째 자리수보다 클 경우 내림차순
						if( Integer.parseInt(nString[j].substring(1, 2)) < Integer.parseInt(nString[j + 1].substring(1, 2)) ) {
							tempstr = nString[j];
							nString[j] = nString[j + 1];
							nString[j + 1] = tempstr;
						}
					}
					
					//전자가 2자리수, 후자가 2자리수 이상, 앞 두자리 수가 같을 때
					if (nString[j].length() == 2 && nString[j + 1].length() >= 2
							&& Integer.parseInt(nString[j].substring(0, 2)) == Integer.parseInt(nString[j + 1].substring(0, 2))) {
						
						//후자의 3번째 자리수가 전자 1번째 자리수보다 클 경우 내림차순
						if( Integer.parseInt(nString[j].substring(0, 1)) < Integer.parseInt(nString[j + 1].substring(2, 3)) ) {
							tempstr = nString[j];
							nString[j] = nString[j + 1];
							nString[j + 1] = tempstr;
						}
					}
					
					//전자가 3자리수, 후자가 3자리수 이상, 앞 세자리 수가 같을 때
					if (nString[j].length() == 3 && nString[j + 1].length() >= 3
							&& Integer.parseInt(nString[j].substring(0, 3)) == Integer.parseInt(nString[j + 1].substring(0, 3))) {
						//후자의 4번째 자리수가 전자 1번째 자리수보다 클 경우 내림차순
						if( Integer.parseInt(nString[j].substring(0, 1)) < Integer.parseInt(nString[j + 1].substring(3, 4)) ) {
							tempstr = nString[j];
							nString[j] = nString[j + 1];
							nString[j + 1] = tempstr;
						}
					}
					//전자가 4자리수, 후자가 4자리수, 앞 세자리 수가 같을 때
					if (nString[j].length() == 4 && nString[j + 1].length() == 4
							&& Integer.parseInt(nString[j].substring(0, 3)) == Integer.parseInt(nString[j + 1].substring(0, 3))) {
						//후자의 4번째 자리수가 전자 4번째 자리수보다 클 경우 내림차순
						if( Integer.parseInt(nString[j].substring(3, 4)) < Integer.parseInt(nString[j + 1].substring(3, 4)) ) {
							tempstr = nString[j];
							nString[j] = nString[j + 1];
							nString[j + 1] = tempstr;
						}
					}
				}
			}
//			System.out.print(i + " : ");
//			for (int kj = 0; kj < size; kj++) {
//				System.out.print(nString[kj] + " ");
//			}
//			System.out.println();
		}
		String answer = "";
		for (int i = 0; i < size; i++) {
			answer += nString[i];
		}
		
		return answer;
    }
}