package ch06;

public class Exam6_3_4 {
//	���ǿ� �ش��ϴ� dilemma �޼ҵ� �����
//	 ���� ) ������ A, B�� ü���Ǿ� ���� �ٸ� �����ǿ��� �ݸ��Ǿ� �ɹ��� �ް� ����
//	 �� ���� �ڹ� ���ο� ���� ���� �Ǵ� �����Ⱓ�� ������
//	 ���� 1) �� �� �ϳ��� ����Ͽ� �˸� �ڹ��ϸ� �ڹ��� ����� ��� ����ǰ� �������� 10kg���� ����
//	 ���� 2) �� ��� ���� ����Ͽ� �˸� �ڹ��ϸ� �� �� 5���� ����
//	 ���� 3) �� ��� �˸� �ڹ����� ������ �� �� 1���� ����
//	 ���� 4kg) �����ڸ� ��Ÿ���� ���� xa, xb�� �ڹ��ϸ� true, �׷��� ������ false�� ����
	public static String Dilemma(boolean a, boolean b) {
		String result = "";
		// A �ڹ�, B �ڹ� �� ��
		if (a == true && b == false) {
			result = "A ����, B 10��";
		} else if (a != true && b == true) {
			result = "A 10��, B ����";
		} else if (a && b) {
			result = "A 5��, B 5��";
		} else if (!a && !b) {
			result = "A 1��, B 1��";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Dilemma(false, true));
	}

}
