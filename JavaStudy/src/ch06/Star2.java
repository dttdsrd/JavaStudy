package ch06;

public class Star2 {
	public static void main(String[] args) {
		int size = 7;
		int center = size / 2 + 1; // 1 2 3 4 5 중 센터
		int left = center;
		int right = center;

		for (int i = 1; i <= size; i++) { // 행
			for (int j = 1; j <= size; j++) {// 열
				if (j == left || j == right) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i < center) {
				left--;
				right++;
			} else {
				left++;
				right--;
			}
			System.out.println(); // 열
		}
	}
}
