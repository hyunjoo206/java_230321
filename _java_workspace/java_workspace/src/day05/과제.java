package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
//		<가위바위보게임 만들기>
//		컴퓨터가 가위, 바위, 보 중 랜덤으로 선택을 함 (0= 가위, 1=바위, 2=보)
//		내가 가위, 바위, 보 중 선택해서 입력
//		승 패 무의 결과 출력
//		삼항연산자 (조건식)? true : false;
		
//		int num = 3;
//		System.out.println((num %2 == 0)? "짝수":"홀수");
		

		System.out.println("가위,바위,보 게임 시작");
		
		//컴퓨터가 랜덤값 생성
		int comNum = (int)(Math.random()*3) ;
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
				
		Scanner scan = new Scanner(System.in);
		System.out.println("가위,바위,보 중 하나를 입력하세요 >");
		String myChoice = scan.next(); //사용자 입력

		//컴퓨터의 선택을 String으로 변환
		String comChoice = (comNum == 0)? "가위" : (comNum == 1)? "바위" : "보";
		System.out.println("com 선택 >"+ comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "승" : "패");
			}else if (comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "승" : "패");
			}else
				System.out.println(myChoice.equals("가위")? "승" : "패");
		}
		System.out.println("게임종료~!");
		

		scan.close();
	}

}
