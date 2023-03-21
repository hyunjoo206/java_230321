package day07;

import java.util.Scanner;

public class 과제_선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		// 2.변수들을 선언
		int comNum[] = new int[3]; // 컴퓨터 배열
		int myNum[] = new int[3]; // 내 배열
		int count = 0; // 게임횟수 출력
		
//		// 3.컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출 **********어려움
//		for(int i=0; i<comNum.length; i++) {
//			comNum[i]=(int)(Math.random()*9)+1;
//			for(int j=0; j<i; j++) {
//				if(comNum[j] == comNum[i]) {
//					i--;
//					break; // for(j의 구문을 빠져나감)
//				}
//			}
//		}
		
		lotto예제_선생님.randomArray(comNum); //static이라서 가능
		Point p = new Point(); //Point 클래스의 객체 생성
//		Point.print(); // 에러남 static 메서드가 아니라서
		p.print();
		
		
		//lotto 예제에서 만든 메서드 호출
		lotto예제_선생님 lotto = new lotto예제_선생님();
		lotto.randomArray(comNum);
		System.out.print("컴퓨터가 결정한 숫자 lotto 예제 메서드 이용해서 보여주기 > ");
		lotto.printArray(comNum);
		
		
		
		// 4. 사용자 숫자 입력받기
		

		System.out.println(">>야구게임 시작");
		System.out.println(">>컴퓨터 숫자 결정 완료!");
		
		while(true) {
			int s = 0;
			int b = 0;
			System.out.println(">>당신 차례! (1~9, 숫자 3개 입력) :");
			
			// 숫자로 입력받는 경우
//			for(int i=0; i<myNum.length; i++) {
//				myNum[i] = scan.nextInt();
//			}
			
			// 문자로 입력받는 경우 ************** 중요
			String myStr = scan.next(); //789=> 한자리씩 잘라서 저장
			String[] myNumstrArr = myStr.split(""); //한글자씩 잘라서 배열로 저장 **
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumstrArr[i]); // String => int 변환할 때는 Integer.parseInt
			}
			count++; //카운트 1회 증가
			
			// 숫자비교
			for(int i=0; i<comNum.length; i++) { //컴퓨터넘버 기준으로 탐색
				for(int j=0; j<myNum.length; j++) { //내넘버 기준으로 탐색
					if(comNum[i] == myNum[j] && i == j) { //스트라이크 기준 조건 (값&자리수도 같을 경우)
						s++;
					}else if(comNum[i] == myNum[j] && i!=j) {//볼조건 (값은 같고 자리수는 다를 경우)
						b++;
					}
				}
			}
			
			//출력
			if(s==0 && b==0) { //아웃조건 : 아무것도 안 맞을 경우
				System.out.println("out!");
			}else {
				System.out.println("> "+s+"S "+b+"B");
				System.out.println("시도횟수 :"+  count);
			}
			
			if(s==3) {
				System.out.println("축 ~ 정답!");
//				System.out.println("시도횟수 : "+ count);
				break;
			}
			
		}
		
		scan.close();
	
	} //메인끝
} //클래스끝
