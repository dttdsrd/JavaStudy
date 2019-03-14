package ch04;

public class For2 {
	
	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y++) {
			for(int x = 2; x <= 5; x++) {
				System.out.print(x + "*" + y + "=" + (x*y) + "\t");
				break;
			}
			System.out.println();
		}
		
//		for(int x = 2; x <= 5; x++) {
//			
//			for(int y = 1; y <= 9; y++) {
//				System.out.print(
//					x + " * " + y + " = " + (x * y) + "\t");
//			}
////			System.out.println(); // ÁÙ¹Ù²Þ
//			System.out.print("\n");
//			
//		}
		
	}
}
