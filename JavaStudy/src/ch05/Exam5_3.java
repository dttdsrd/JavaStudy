package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) {
			char random = (char) (Math.random() * nums.length); //length:7
						 // ▲형 변환 랜덤 라이브러리를 쓰기 위해서 (char) 넣기
			char temp = nums[0]; // 문자이기 때문에 char 변수 써야함
			nums[0] = nums[random];
			nums[random] = temp;

		}

		System.out.println(nums);
	}
}
