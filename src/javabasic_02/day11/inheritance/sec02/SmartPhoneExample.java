package javabasic_02.day11.inheritance.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
          SmartPhone myPhone1 = new SmartPhone();
		  
		// 모델 갤럭시S24    색상은 화이트
		SmartPhone myPhone2 = new SmartPhone("갤럭시24","화이트");

		//Phone으로부터 상속받은 필드 읽기
		System.out.println(myPhone1.model + " "  +myPhone1.color + " " + myPhone1.wifi);
		System.out.println(myPhone2.model + " "  +myPhone2.color + " " + myPhone2.wifi);

		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 체크 :" + myPhone2.wifi);
		myPhone2.setWifi(true);
		System.out.println("와이파이 상태 체크 :" + myPhone2.wifi);

		//Phone으로부터 상속받은 메소드 호출
          myPhone2.bell();
		  myPhone2.hangUp();
          myPhone2.receiveVoice("안녕하세요 . 동민이 좀 바꿔주세요");
		  myPhone2.sendVoice("어...잠깐만....");
		  myPhone2.hangUp();
		//SmartPhone의 메소드 호출
		  myPhone2.internet();
	}
}