package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = { 10, 98, 55, 79, 51, 63, 1, 21, 77, 65, 97 };

		//int temp = Integer.MAX_VALUE; int의 최대값 라이브러리
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (temp > nums[i]) {
				temp = nums[i];
			}
		}
		System.out.println(temp);
	}
}
