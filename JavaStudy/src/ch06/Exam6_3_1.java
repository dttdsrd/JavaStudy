package ch06;

import java.util.Scanner;

public class Exam6_3_1 {
	// ������ ���԰� 10kg�� ������ 1���, 7kg�� ������ 2���, 4kg�� ������ 3���,
	// �������� 4kg����� �ο��ϴ� checkGrade �޼ҵ� �����

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a = checkGrade(num);
		System.out.println(a + "���");
	}

	public static int checkGrade(int num) {
		int a = 0;

		for (int i = 1; i < num; i++) {
			if (num > 10) {
				a = 1;
				return a;
			} else if (num > 7) {
				a = 2;
				return a;
			} else if (num > 4) {
				a = 3;
				return a;
			} else {
				a = 4;
				return a;
			}

		}

		return 0;

	}
}