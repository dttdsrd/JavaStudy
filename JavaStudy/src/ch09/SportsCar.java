package ch09;

public class SportsCar extends Car {
	char color = 'R'; 
	
	SportsCar() {
		System.out.println("SportsCar ��ü ����");
	}
	
	@Override //����
	void move() {
		System.out.println("������ī �̵� �ü� 300");
	}

	void openSunloof() {
		System.out.println("����� ����");
	}
}
