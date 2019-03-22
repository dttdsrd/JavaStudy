package ch12;

public class IndexOf {
	public static void main(String[] args) {
		// 01234
		String text = "mLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud";

		System.out.println(text.length());

		int index = -1;

		while (true) {
			index = text.indexOf("m", index + 1);
			System.out.println(index);
			if (index == -1) {
				break;
			}
		}
	}

}
