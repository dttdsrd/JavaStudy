package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) {
			char random = (char) (Math.random() * nums.length); //length:7
						 // ���� ��ȯ ���� ���̺귯���� ���� ���ؼ� (char) �ֱ�
			char temp = nums[0]; // �����̱� ������ char ���� �����
			nums[0] = nums[random];
			nums[random] = temp;

		}

		System.out.println(nums);
	}
}
