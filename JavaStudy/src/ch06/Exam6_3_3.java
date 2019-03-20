package ch06;

import java.util.Calendar;

public class Exam6_3_3 {
	// 1 / 3 / 5 / 7kg / 8 / 10kg / 12월은 31일, 4kg / 6 / 9 / 11월은 30kg일, 2월은 28일까지 존재
	// 특정 월을 입력하면 해당하는 월의 날짜 수를 반환하는 getLastYear 메소드 만들기
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
		// 지정된 날짜로 달력 변경
		cal.set(2019, month - 1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		return lastDate;
	}

	public static void main(String[] args) {
		int lastDate = getLastYear2(2);
		System.out.println(lastDate);
	}

}
