package ch06;

import java.util.Scanner;

public class Exam6_3_2 {
	// 두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는 getBetweenSum 메소드 만들기
	public static int getBetweenSum(int n1, int n2) {
		int sum = 0;
		if (n1 > n2) {
			int temp = 0;
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = getBetweenSum(3, 5);
		System.out.println(sum);

	}
}

//삼항연산자 이용방법
//	int start = n1 > n2 ? n2 : n1;
//	int end =n1 < n2 ? n1 : n2;
