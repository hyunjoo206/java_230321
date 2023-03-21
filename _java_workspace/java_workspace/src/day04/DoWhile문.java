package day04;

import java.util.Scanner;

public class DoWhile문 {

	public static void main(String[] args) {
//		 for, while문은 조건식이 한 번도 실행 안될 수도 있음.
//		 do{
//		  실행문;
//		 }while(조건문);//조건식 필수
		
		
//		1~10까지 do~while문 이용하여 출력
		int i=1;
		do {
			System.out.println(i+" ");
			i++;
		}while(i<=10);
		
		
//		 예제) 값을 입력하면 그대로 출력하는 구문
//		 (단, y/Y가 입력되면 종료)		
						
	Scanner scan = new Scanner(System.in);
	char ch;
	do {
		System.out.println("한 글자를 입력해주세요.(y/Y : 종료)");
		ch= scan.next().charAt(0); //실행문
	}while(!(ch == 'y' || ch == 'Y')); //조건식
	
	scan.close();
		
		
		
	}

}
