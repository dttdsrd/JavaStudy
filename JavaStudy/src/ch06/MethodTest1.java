package ch06;

// <�޼ҵ� ���� ��Ģ>
// ��ݵ�� Ŭ���� ���� ǥ���Ǿ�� �Ѵ�.
// ��޼ҵ� ���� ǥ�� �� �� ����.
// ����ġ ��� ����.

public class MethodTest1 {
	public static int firstMethod() {
		//2��, 4��
		int a = 100;
		return a;
	}

	public static void main(String[] args) {
		//1�� 
		System.out.println(firstMethod());
		//3��
		int num = firstMethod();
		//5��
		System.out.println(num * 6);
	}
}