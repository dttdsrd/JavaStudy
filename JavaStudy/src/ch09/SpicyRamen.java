package ch09;

public class SpicyRamen extends Ramen {
	// ��� �ڵ�
	public SpicyRamen(String name) {
		super.name = name;
	}
	// �������̵� �ڵ�
	public String getTaste() {
		return name + " �ſ��";
	}

}
