package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) - 배열로 생성
		 * 유저가 3자리의 숫자를 맞추는 게임 - 배열로 생성 (유저 내가 입력)
		 * 몇 번째만에 맞췄는지 - count
		 * 숫자를 맞출 때까지 반복해서 출력
		 * 
		 * strike : 자리와 숫자가 일치할 경우 
		 * ball : 숫자만 일치하면
		 * out : 아무것도 안 맞으면 
		 * 
		 * 컴 3 5 7
		 * 유 3 4 6
		 * 1s 
		 * 
		 * 컴 3 5 7
		 * 유 3 7 8
		 * 1s b1
		 * 
		 * 컴 3 5 7
		 * 유 6 8 1
		 * 3out
		 * 
		 * 컴 3 5 7
		 * 유 3 5 6
		 * 2s
		 * 
		 * ------야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해주세요. (1~9, 3자리) >
		 * 3 5 6
		 * 2s
		 * 3s 다 맞으면 종료 (게임횟수출력)
		 * */

		
		System.out.println("-----야구게임 시작-----");
		
		//컴퓨터가 랜덤 숫자 생성 => 배열
		
		int [] arr = new int[3]; //컴퓨터 값
		int [] arrUser = new int[3]; // 사용자 입력값
		
		// 랜덤숫자 생성
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*9)+1;
		}
		
		// 랜덤 중복제거

		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j] = (int)(Math.random()*9)+1;
					j--;
				}
			}
	
		}
		
//		System.out.println(arr[i]); // 랜덤 배열 출력..?
		
		// 랜덤숫자 확인
		
		for(int i=0 ;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		// 사용자 숫자 입력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. (1~9, 3자리)");
		
		
		// 사용자 입력 숫자 배열 형태로
		// 숫자가 1~9가 아닌 경우...?? 에러표시...
		
		for(int i=0; i<arrUser.length; i++) {
			arrUser[i] = scan.nextInt();
			if (arrUser[i]>=10 || arrUser[i]<1) {
				System.out.println("입력값이 잘못되었습니다.");
				System.out.println("다시 실행해 주세요.");
				break;
			}
		}
		
		
		// 컴 랜덤숫자랑 사용자 숫자랑 비교 - 배열
		
		
		int cnt = 0;
		int s = 0, b = 0, o =0;
		
		while(true) {
			cnt ++;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0;j<arrUser.length;j++) {
					if(arr[i]==arrUser[j]) {		
						if(i==j) s++;
						else b++;
					}
				}
			}
			
			if(s==0 && b==0) {
				System.out.println("out!!");
			}
			
			if(s==3) {
				System.out.printf("정답 !! 시도횟수 %d번%n", cnt);
				break;
			}
			
			System.out.printf("게임결과 strike: %d번, ball: %d번" , s, b);
			
			
		}
		
		
		
		
		
		
		
	}

}
