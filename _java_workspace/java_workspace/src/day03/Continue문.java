package day03;

import java.util.Scanner;

public class Continue문 {

	public static void main(String[] args) {
		/* continue : pass, 조건에 맞다면 pass
		 * 1~10까지 출력 5만 빼고 출력
		 * 1 2 3 4 6 7 8 9 10
		 * 
		 * */ 
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println(); //줄바꿈
		
		// 짝수만 출력 (홀수는 pass)		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) { 
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println(); //줄바꿈
		// 한글자 입력받아 입력 받은 글자 출력, h 입력 받으면 종료
		
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("한 글자를 입력해주세요. h입력 시 종료");
			char ch = scan.next().charAt(0);
			System.out.println(ch);
			
			if(ch == 'h') {
				System.out.println("종료!!");
				break;
			}
		}
	
	}

}
