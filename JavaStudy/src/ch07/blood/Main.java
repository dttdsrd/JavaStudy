package ch07.blood;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("�Ѱ���");
		human.setType('B');
		human.setAge(26);

		/* BloodHouse ��ü ���� */
		BloodHouse b = new BloodHouse();

		String result = ""; // action() �޼ҵ� ȣ�� ��� ����

		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		result = b.action(human);

		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}

}
