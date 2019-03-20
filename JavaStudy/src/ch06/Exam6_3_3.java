package ch06;

import java.util.Calendar;

public class Exam6_3_3 {
	// 1 / 3 / 5 / 7kg / 8 / 10kg / 12���� 31��, 4kg / 6 / 9 / 11���� 30kg��, 2���� 28�ϱ��� ����
	// Ư�� ���� �Է��ϸ� �ش��ϴ� ���� ��¥ ���� ��ȯ�ϴ� getLastYear �޼ҵ� �����
	public static int getLastYear(int month) {
		int date = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			date = 31;
		} else if (month == 2) {
			date = 28;
		} else {
			date = 30;
		}
		return date;
	}

	public static int getLastYear2(int month) {
		Calendar cal = Calendar.getInstance();
		// ������ ��¥�� �޷� ����
		cal.set(2019, month - 1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		return lastDate;
	}

	public static void main(String[] args) {
		int lastDate = getLastYear2(2);
		System.out.println(lastDate);
	}

}
