package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤수 하나를 생성 후 맞추는 게임.
		 * 예) 컴퓨터가 랜덤수를 생성했습니다. : 45
		 * 사용자 입력 : 20 
		 * up!
		 * 사용자 입력 : 30
		 * up!
		 * 사용자 입력 : 49
		 * down!
		 * 사용자 입력 : 45
		 * 정답!
		 * 
		 * */
	

		//스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		//랜덤수 결정하기
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");	
		int num =0, count=0;	
		
		//반복문 열기
		while(num!= random) {
			System.out.println("숫자를 입력하세요 : ");
			num = scan.nextInt();
			count++; //사용자가 입력했을 때 1 증가
			
			//비교
			
			if(count ==5) {
				System.out.println("게임횟수 초과");
			break;
			}
			
			if(num<1 || num>50) {
				System.out.println("범위를 벗어났습니다 (1~50)");
			}else {
				if(num>random) {
					System.out.println("down");
				}else if(num<random) {
					System.out.println("up");
				}else {
					System.out.println("정답~~");
					System.out.println(count + "번 만에 정답");
				}
			}
			
			
			System.out.println("게임횟수 : "+ count);
			
		}
		
	
		scan.close();
	
	}
}
