package ch06;

import java.util.Scanner;

public class Exam6_3_1 {
	// ������ ���԰� 10kg�� ������ 1���, 7kg�� ������ 2���, 4kg�� ������ 3���,
	// �������� 4kg����� �ο��ϴ� checkGrade �޼ҵ� �����
	public static int checkGrade(int weight) {
		int grade = 0;
		if (weight > 10) {
			grade = 1;
		} else if (weight > 7) {
			grade = 2;
		} else if (weight > 4) {
			grade = 3;
		} else {
			grade = 4;
		}
		return grade;
	}

	public static void main(String[] args) {
		int result = checkGrade(3);
		System.out.println(result);
	}
}

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		int a = checkGrade(num);
//		System.out.println(a + "���");
//	}
//
//	public static int checkGrade(int num) {
//		int a = 0;
//
//		for (int i = 1; i < num; i++) {
//			if (num > 10) {
//				a = 1;
//				return a;
//			} else if (num > 7) {
//				a = 2;
//				return a;
//			} else if (num > 4) {
//				a = 3;
//				return a;
//			} else {
//				a = 4;
//				return a;
//			}
//
//		}
//
//		return 0;
//
//	}
//}