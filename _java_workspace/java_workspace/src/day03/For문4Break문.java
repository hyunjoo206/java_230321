package day03;

import java.util.Scanner;

public class For문4Break문 {

	public static void main(String[] args) {
		// Break문 : 반복문을 빠져나오는 역할을 하는 키워드
		// 반복문에서 조건(if)문을 동반한다.
		
		//1~100까지 합계
		
		int i =1, sum=0;
		for(;;) {
			System.out.print(i + " ");
			sum= sum+i;
			if(i == 10) { //조건문
				break;
			}		
			i++; //순서 매우 중요 - 실행문
		}
		System.out.println();
		System.out.println("1~10까지의 합: " + sum);
		
		
	/* 한글자를 입력받아 그대로 입력받은 글자를 출력
	 * y를 입력 받으면 종료
	 * a->a , b->b , c->c, y-> 종료*/
		
	Scanner scan = new Scanner(System.in);
	System.out.println("------------------------------");
	
	for(;;) {
		System.out.println("한 글자를 입력해주세요.(y : 종료)");
		//chatAt : 지정한 문자의 위치를 추출 0부터 시작
		char ch = scan.next().charAt(0);	
		// break조건
		if(ch == 'y' || ch == 'Y') {
			System.out.println("종료");
			break;
		}
		
	}
	
		
		
	}

}
