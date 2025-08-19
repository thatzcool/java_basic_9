package java_advanced.day14.collection;

import java.util.Stack;

//Stack 구조는 데이터를 제한적으로 접근 할 수 있는 구조이다.  (한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조)
//LIFO (Last In First Out)
//구조가 단순해서, 구현이 쉽다. 데이터 저장/읽기 속도가 빠르다
//데이터 최대 갯수를 미리 정해야 한다.  저장공간의 낭비가 발생할 수 있다.
//자바에서 java.util.Stack 제공  push(), pop()
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int.pop());
        System.out.println(stack_int.pop());
        int data = stack_int.pop();
        stack_int.push(data);
    }

}
