package day06;

public class 정리 {

	public static void main(String[] args) {
		/* 정리
		 * 
		 * 1. 변수
		 * - 일반변수(지역변수, 기본형변수) : 값을 저장하는 기본 메모리공간
		 * 	- 정수형 : int, byte, short, long(접미사 L(l))
		 * 	- 실수형 : double, float(접미사 f(F))
		 * 	- 문자형 : char(정수형으로 분류하기도 함. 유니코드표에 코드로 저장) : 1글자
		 * 	- 불리언 : boolean (true / false)
		 * - 참조변수 : 객체의 주소를 저장하는 변수(객체명) : new 키워드를 통해 객체 생성
		 * - 자료형 변환 : 변수, 상수, 리터럴 값들을 일시적으로 다른 자료형으로 변환
		 *  - 자동형변환 : 정수 -> 실수, 작은바이트 -> 큰바이트
		 *	- 명시적형변환 : 자동으로 형변환이 되지 않는 경우 (자료형)변수명
		 *	
		 * 2. 연산자
		 * - 대입연산자 (=)
		 * 	- 오른쪽에 있는 값을 왼쪽 변수에 저장
		 * 	- 왼쪽에는 반드시 저장 가능한 변수/객체
		 *  - 왼쪽과 오른쪽의 자료형은 반드시 같아야 함
		 * - 산술연산자 (+ - * / %)
		 *  - 정수 / 정수 = 정수
		 *	- / : 0으로 나누면 에러 발생, 0으로 나눌 수 없음
		 *- 비교연산자 ( >=, <=, >, <, ==, !=)
		 *	- 항상 결과가 true / false로 표현
		 *- 논리연산자 ( &&, ||, !)
		 *	- && : and 여러개의 조건이 모두 맞아야 true ~이고, ~면서
		 *	- || : or 여러개의 조건 중 하나만 맞아도 true ~이거나, ~또는
		 *	- ! : not 현재 조건의 반대
		 *- 증감연산자 (++, --)
		 *	- 1씩 증가 , 1씩 감소 / 위치에 따라 증가되고, 감소되는 순서가 결정됨
		 *	- i++, ++i
		 *- 조건선택연산자 ( 조건식 ? ture : false )
		 *	- 조건식이 참이면 true 아니면 false값을 선택
		 *
		 * 3. 조건문 : 조건식이 참이면 실행문을 실행
		 *	- if, switch
		 *	- if : 조건식이 반드시 true / false
		 *	- switch : 값이 나오는 식, 변수
		 *		- 반드시 하나의 case가 끝나면 break 문을 달아줘야 함
		 *		- break 생략하면 하위 모든 case가 실행됨
		 *
		 * 4. 반복문 : 규칙성 반복
		 *	- for, while, do~while문 : 조건식은 true 조건으로 작성
		 *	- for (초기화 ; 조건식; 증감식){
		 *		실행문;	
		 *	}
		 *	- while(조건식){
		 *		실행문;
		 *		- 샐행문에 반드시 조건식이 false가 될 수 있는 구문을 포함
		 *	}
		 * 	- do{	// 무조건 한 번은 실행되어야 하는 반복문에서 사용
		 * 		실행문;
		 * 	}while(조건식);
		 *
		 * 5. break와 continue문
		 *	- break : 반복문을 빠져나가기 위한 구문 / if문 동반하게 됨
		 *	  switch문에서 case를 빠져나가기 위한 구문
		 *	- continue : pass하는 역할
		 *	  조건이 맞을 때 실행하지 않고 다음 증감으로 이동
		 *	  while문에서는 증감식을 찾을 수 없기 때문에 바로 조건식으로 이동 -> 이때 무한루프에 빠지지 않게 조심!!
		 *	  
		 * 6. 배열
		 * 	- 동일한 자료형을 가진 데이터를 모아놓은 형태
		 * 	- 배열 선언 및 초기화
		 *	 자료형 배열명[] = new 자료형[개수];   // 선언하고 배열 생성
		 *  - 배열의 index는 0부터 시작 ~ 배열.length-1
		 * 	- 배열.length : 배열의 총길이 
		 *  - 배열[index] = 값; // 배열의 index 번지에 값을 저장
		 * 	- 변수 = 배열[index] // 배열의 값을 변수로 추출
		 * 
		 * */

		
		
		// + 앞에서 정리한 String  
		
		
		// String 클래스 = 문자열을 다루는 클래스
		// String str = new String();
		// String str = "가나다"; // 일반 자료형처럼 이용가능
		
		String str = "Hello world~!!";
		System.out.println(str);

		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("--charAt---");
		System.out.println(str.charAt(0));
		
		//****length : 전체 글자의 길이
		System.out.println("--length---");
		System.out.println(str.length());
	
		//compareTo(str) : str문자와 비교해서 같으면 0, 사전 순으로 앞이면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); //a b c d ... 사전 순서에서 b가 a보다 뒤에 있으니 1
		System.out.println("b".compareTo("b")); 
		System.out.println("b".compareTo("g")); 

		//concat(str) : 이어붙이기 (+ 연산자 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def")); //아래와 같은 의미
		System.out.println("abc"+"def");
	
		//*****equals(str) : 두 문자열이 같은지 확인하는 것(대소문자 구분) -> T/F로 나옴
		System.out.println("--equals--");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));

		//*****indexOf(str) : 문자의 위치를 찾아주는 기능
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("b"));
		System.out.println("abc".indexOf("c"));
		System.out.println("abc".indexOf("d")); //찾는 문자가 없으면 -1 반환
		
		String email ="hjstal@naver.co.kr";
		System.out.println(email.indexOf("@")); 
		System.out.println(email.indexOf(".")); //첫발견 위치, 뒤에 .까지 가지 않음
		System.out.println(email.lastIndexOf(".")); //끝에서 부터 찾기
		
		//****substring(str0) : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0)); 
		System.out.println(email.substring(2)); 
		System.out.println(email.substring(0,5)); //마지막 끝번지-1, 0<=index<5
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1)); //@ 다음만 출력
		
		//trim : 불필요한 공백삭제 
		System.out.println("--trim--");
		System.out.println("      Hello     ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello World".replace("W","w"));
		System.out.println("Hello World".replace("l","L"));
		System.out.println("Hello World".replace("World","Java"));
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger" ;
		String[] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.println(tmp+" ");
		}

		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum);

		//********paseInt : 문자를 숫자로 변환
		int num3 =  Integer.parseInt(num1);
		System.out.println(num3);
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		int sum1 = num3 + num4;
		System.out.println(sum1);
		

		
	}

}
