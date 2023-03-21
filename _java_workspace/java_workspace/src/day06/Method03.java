package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/*  메서드를 활용하여 계산기를 작성
		 * 
		 * 	메서드는  + - * / % 를 작성하여 출력
		 * 	두 수를 입력받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * 	switch문 적당
		 * 
		 * */
		
		
		// 스캐너 열기
		Scanner scan = new Scanner(System.in);
		System.out.println("-------계산기-------");
		
		// 메인에서 값 입력받기		
		System.out.println("첫번째 정수 입력");
		int a = scan.nextInt();
		System.out.println("두번째 정수 입력");
		int b = scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/,%)");
		String op = scan.next(); //char로 받고 싶으면 char c = scan.next().charAt(0);
		
		//다른 클래스에서 만든 메서드 사용법
		Method02 m2 = new Method02();
		System.out.println("Method02 class에서 작성된 Method");
		m2.sumPrint(a,b);
		
		
		int SUM = sum(a,b);
		int MINUS = minus(a,b);
		int MUL = mul(a,b);
		double DIV = div(a,b); 
		double[] REM = rem(a,b);   
		
		
		switch(op) {
		case "+"  : 
			System.out.println(SUM);
			break;
		case "-"  : 
			System.out.println(MINUS);
			break;
		case "*"  : 
			System.out.println(MUL);
			break;
		case "/"  : 
			System.out.println(DIV);
			break;
		case "%"  : 
			//리턴을 배열로 리턴 : 몫, 나머지 double로 리턴
			System.out.println("/의 결과 : "+ REM[0]); // 해당 배열의 0번지
			System.out.println("%의 결과 : "+ REM[1]); // 해당 배열의 1번지
			break;
		default :
			System.out.println("잘못 입력하셨습니다~~ +,-,*,/,% 중에 입력하세요!!");
		}
		
		System.out.println("계산기 종료");
		
		scan.close();
		
		
	}

	// 메서드 정의
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	/* 기능 : 두 정수를 입력받아 두 정수를 나눈 몫과 나머지를 double 배열로 리턴
	 * 리턴타입 : double[] 배열 
	 * 매개변수 : int num1, int num2
	 * 변수명 : rem
	 * */ 
	
	public static double[] rem(int num1, int num2) {
		double[] res = new double [2]; // 배열생성
		res[0]= (double)num1/num2;
		res[1]= num1%num2;		
		return res; // res는 double 배열의 이름
	}
	
	
//	// void로 할 경우
//	public static void addition(String op, int a, int b) {
//		System.out.println(a+" "+op+ b +"=" +(a+b));
//	}
//	
//	public static int substration(int a, int b) {
//		return a-b;
//	}
//	
//	public static void mutipulication(int a, String op, int b) {
//		System.out.println(a+op+b+"="+(a*b));
//	}
//	
//	public static double division(int a, int b, String op) {
//		return (double)a/b;
//	}
//	
//	public static void rem(int a, int b) {
//		System.out.println(a + "% " + b + "=" + (a%b));
//	}
//	
//
//	

}