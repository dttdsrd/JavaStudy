package ch05;

public class Exam5_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		int sum = 0;
		int count = 0;
		float avg = 0f;

		/* 인덱스가 2의 배수인 경우에만 값 입력 */
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (i % 2 == 0) {
					arr[i] = i + 10; // 10 12 14 16 18
					sum = sum + arr[i];
					count++;
				}
			}
		}

		avg = sum / count;

		// 코드작성

		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
