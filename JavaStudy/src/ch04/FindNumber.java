package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		// 병뚜껑 숫자 생성 랜덤
		//                 0.0 ~  < 1.0 
		//                           0.99999
		//         * 100   0.0  ~  99.9999999999
		int random = (int) (Math.random() * 100) + 1;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt(); // 사용자 입력값
			if(random == num) {
				System.out.println("맞췄음");
				break;
			} else if(random > num) {
				System.out.println("더 큰수를 입력하세요.");
			} else {
				System.out.println("더 적은수를 입력하세요.");
			}
		}
	}
}










