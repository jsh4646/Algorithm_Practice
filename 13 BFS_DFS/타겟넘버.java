import java.util.Stack;

class 타겟넘버 {
    public int solution(int[] numbers, int target) {
		Stack<Integer> answerList = new Stack<Integer>();
		king(0, target, numbers.length, 0, numbers, answerList);
		return answerList.size();
	}
	
	public static void king(int index, int target, int size, int sum, int[] numbers, Stack<Integer> answerList) {
		if (index != size) {
			int sumplus = sum + numbers[index];
			int summinus = sum - numbers[index];
			king(index+1, target, size, sumplus, numbers, answerList);
			king(index+1, target, size, summinus, numbers, answerList);
		} else {
			if (sum == target) {
				answerList.add(1);
			}
		}
	}
}