package ch06;

import java.util.Scanner;

public class Exam6_3_2 {
	// �� ���� ���� a, b�� �ԷµǾ��� �� a �� b ���̿� ���� ��� ������ ���� ��ȯ�ϴ� getBetweenSum �޼ҵ� �����
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

//���׿����� �̿���
//	int start = n1 > n2 ? n2 : n1;
//	int end =n1 < n2 ? n1 : n2;
