package ch09;

public class SaltyRamen extends Ramen {
	public SaltyRamen(String name) {
		super.name = name;
	}
	// �������̵� �ڵ�
	public String getTaste() {
		return name + " §��";
	}
}
