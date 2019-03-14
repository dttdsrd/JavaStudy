package ch04;

public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 24;
		// ÄÚµå ÀÛ¼º
		if(score % 2 == 0 && score % 3 == 0) { // ÄôÂ¦
			System.out.println("ÄôÂ¦");
		} else if(score % 2 == 0) { // Â¦
			System.out.println("Â¦");
		} else if(score % 3 == 0) {
			System.out.println("Äô");
		}
	}
}
