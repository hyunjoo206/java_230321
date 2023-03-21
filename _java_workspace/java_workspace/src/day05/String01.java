package day05;

public class String01 {

	public static void main(String[] args) {
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
		
		//
	}

}
