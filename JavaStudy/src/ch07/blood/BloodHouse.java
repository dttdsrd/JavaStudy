package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.age; //���� ��

		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if (16 <= age && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����

		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		// BloodHouse b = new BloodHouse();
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		if (isPossible(human) == true) {
			result = "������ �Ϸ�Ǿ����ϴ�." + human.name + "�� �����մϴ�.";
			/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		} else {
			result = "������ �Ұ����մϴ�.";
		}
		return result;
	}

}
