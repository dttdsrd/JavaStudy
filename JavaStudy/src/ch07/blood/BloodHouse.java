package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // 헌혈자의 나이를 확인하여 저장
		boolean isPossible = false; // 헌혈 가능 여부
		
		/* 넘겨받은 Human 클래스로부터 age 정보 확인 age = ? */
		age = human.age; //나이 값

		/* age가 16세 이상 69세 이하 일때만 헌혈 가능하도록 조건문 작성 */
		if (16 <= age && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // 헌혈 결과 저장

		/* isPossible() 메소드를 활용하여 헌혈 가능 여부를 확인하는 조건문 작성 */
		// BloodHouse b = new BloodHouse();
		/* 헌혈 가능 시 result = "헌혈이 완료되었습니다. XX님 감사합니다. */
		if (isPossible(human) == true) {
			result = "헌혈이 완료되었습니다." + human.name + "님 감사합니다.";
			/* 헌혈 불가 시 result = "헌혈이 불가능합니다. */
		} else {
			result = "헌혈이 불가능합니다.";
		}
		return result;
	}

}
