package day01;

public class 변수 {

	public static void main(String[] args) {
		// 변수명, 클래스명 한글사용 가능.
		System.out.println("method 내부");
		System.out.println(12345);		
		
		// 변수: 리터럴 값을 담는 메모리 공간
		// 주석 - 한 줄 주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해서 사용
		/*여러줄
		 * 주석입니다. 
		 * 엔터치면 자동으로 늘어남.*/
		// 변수 선언 방법
		// 변수타입 변수명;
		
		int num, num2, num3, num4 ; //선언만 (같은 자료형일 경우 여러 변수를 동시에 선언)
		num = 123; //값 지정
		
		int num1 = 123; //두 줄을 한 번에
		byte num5;
		char ch1;
		float fl1;
		double dou1;
		boolean bool;
		//노란밑줄 : 경고, 한 번도 사용되지 않은 경우
		//빨간밑줄 : error
		
		int appleCount; //변수명은 의미있게 지정
		int apllecount; //대소문자 구분함. 다른 변수
		
		// int num; // 중복선언 불가능
		System.out.println("num1의 값 : "+num1);
		
		
		//a라는 int 변수를 선언 후 값을 지정하고, a 변수의 값을 출력하시오.
		int a = 206;
		System.out.println("a 변수의 값 : "+a);
		
		//num1과 a변수의 값을 하나의 구문으로 출력
		System.out.println("num1의 값 : "+ num1 +", "+ "a 변수의 값" + a);
		
		//문자 1글자만 입력가능
		char ch = '\''; // 문자열은 ""(큰따옴표) , 1글자의 문자는 ''(작은따옴표)
		// 역슬레시 하고 \'
		// char ch2 = 'abc'; -> 오류 발생
		System.out.println("ch : "+ ch);
		
		//일반적인 class는 객체를 만들어서 객체로 사용. 
		//String은 자주 사용하다보니, 자료형처럼 사용 가능
		String str = "abc" ; //문자열
		System.out.println("str : "+str);
		
		int b = 10; // 10진수의 수 10을 저장
		int c = 010; // 8진수의 수 10을 저장 0~7까지만 사용 8=10
		int d = 0x10; // 16진수의 수 10을 저장 O~ABCDEF 16=10
		
		// int e = 123456789012 ; // int 영역의 메모리 범위 초과 error
		//long형으로 변수 선언
		//long형은 접미사 L을 필수로 써야 함. 대소문자 구분없음.
		long e = 123456789012L;
		
		//기본 실수형은 double로 인식
		//float형의 실수값은 접미사 f(F)를 반드시 써야함
		float f = 3.14f;
		
		bool = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor1 = kor;
		// = : 대입 -> 오른쪽의 값(값을 가지고 있는 값, 변수)을 왼쪽(변수)에 담아라
		
		int g = 10, h = 20, y = 50;
		int k, z = 10; //k는 값이 없고 z는 10
		
		
	
	}
}
