package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 �ε���
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// ��

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 1) {
//				System.out.print(arr[i]);

//		for (int i = 0; i < arr.length; i += 2) {
//			System.out.println(arr[i]);
//		}
		String sep = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(sep + arr[i]);
				sep = ","; //�޸� ���� �� �� ��� �� ��
			}
		}
	}
}
