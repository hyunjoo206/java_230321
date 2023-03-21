package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/*정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력.
		 * */
		
		Scanner scan = new Scanner(System.in);
		//Scanner(클래스) scan(변수-스캐너라는 뜻을 알 수 있게) = new Scanner(System.in);
		// 단축키 ctrl + shift + o (import 단축키)
		
		System.out.println("숫자를 입력해주세요(정수형)");	
		
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}		
		
		scan.close();
		
	}

}
