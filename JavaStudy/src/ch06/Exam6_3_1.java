package ch06;

import java.util.Scanner;

public class Exam6_3_1 {
	// 수박의 무게가 10kg이 넘으면 1등급, 7kg이 넘으면 2등급, 4kg이 넘으면 3등급,
	// 나머지는 4kg등급을 부여하는 checkGrade 메소드 만들기

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a = checkGrade(num);
		System.out.println(a + "등급");
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