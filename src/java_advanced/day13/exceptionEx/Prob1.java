package java_advanced.day13.exceptionEx;

import java.util.Scanner;


public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;
		//여기를 작성하십시오.
        try {
            result = convert(str);
			System.out.println("변환된 숫자는 " + result + "입니다.");
        } catch (IllegalArgumentException e) {
			System.out.println("“예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
        }
    }
	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) throws IllegalArgumentException {
		if(str.equals(null) || str.length() == 0){
			throw new IllegalArgumentException();
		}
		int result = Integer.parseInt(str);

		return  result;
	}
	
}