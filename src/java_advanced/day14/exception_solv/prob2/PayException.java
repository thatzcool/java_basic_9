package java_advanced.day14.exception_solv.prob2;

import java.lang.Exception;

// 사용자 정의 Exception : 수정하지 말고 그대로 사용하세요.
public class PayException extends Exception {
	
	public PayException(String message){
	    super(message);
	}
}