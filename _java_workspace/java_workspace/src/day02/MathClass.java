package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * 수학적인 기능을 하기위한 클래스
		 * 반올림, 올림, 버림, max, min, random(많이 씀)
		 * */

		double num1 = 5.623456;
		
		//Math.round : 반올림
		System.out.println(Math.round(num1)); //반올림만 정수형으로
		
		//Math.ceil : 올림, Math.floor : 버림
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		
		
		//Math.max : 최대값, Math.min : 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5,3));
		
		//Math.abs : 절대값
		System.out.println(Math.abs(num1));
		
		//Math.pow : 제곱, Math.sqrt : 루트, Math.random :0~1 사이의 랜덤값
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());
		
		//1~10까지의 랜덤값 추출
		//(int)(Math.random()*n) + start
		//(int)(Math.random()*10)+1 // 1~10까지의 랜덤값 추출
		int random = (int)(Math.random()*10)+1; //1~10까지의 정수
		System.out.println(random);
		
		//Int num = (int) (Math.random() * n(n까지의 수)) + start(시작하는 수);

	}


}
