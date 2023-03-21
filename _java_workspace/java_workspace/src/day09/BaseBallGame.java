package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		/*야구게임 메서드로 변경
		 * */
		
		/* 메서드 : 매개변수의 개수는 정해진 것이 없음
		 * 리턴타입 => 하나
		 * */
//		int comNum[]; => null
		int com[] = new int[3];
		int user[] = new int[3];
		//랜덤수 범위
		int max = 9, min =1;
		int s =0 ; int b =0;
		int cnt =0;
		Scanner scan = new Scanner(System.in);
		//컴넘버 만들기
		randomArray(com,max,min);
		System.out.println("-------야구게임 시작-------");
		System.out.println("컴퓨터가 숫자를 결정하였습니다");
		
		while(s!=3) {
			//사용자번호 입력받기
			System.out.println("1~9까지 숫자 3개 입력 >>");
			for(int i=0; i<user.length; i++) {
				user[i]=scan.nextInt();
			}
			cnt ++;
		
		
			//결과판정 - strike,ball 판정하려면 각각 호출
			s = strike(com, user);
			b = ball(com, user);
			//System.out.println(s+"S "+ b+"B ");
			//0일때 표현하지 않게 처리
			if(s!=0) {
				System.out.print(s+"S ");
			}
			
			if(b!=0) {
				System.out.print(b+"B ");
			}
			
			System.out.println("게임횟수: "+cnt);
			
			if(s==0 && b==0) {
				System.out.println("OUT!!!!");
			}
			
			
		}//while문 끝 
		
		System.out.println("정답~종료");
		System.out.println("");
		scan.close();
		
	}
	

	// 랜덤번호 생성(범위가 달라도 쓸 수 있도록) : 매개변수로 범위를 설정 20~30 => cnt:10, start:20
	// 범위 => min, max 20~30 cnt = max-min+1
	//(int)(Math.random()*max-min+1)+min ;
	// 매개변수 => 개수, 시작값 (int)(Math.random()*개수)+시작 ;
	
//	public static int random(int start, int cnt) { //start 시작값 cnt 개수
//		return (int)(Math.random()*cnt)+start ;
//	}
	
	public static int random(int max, int min) {
		if(max < min) { //max와 min의 숫자값이 바뀌어서 들어올 때 처리
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	
	// 중복확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	//배열생성 메서드 (중복제거)
	//true가 리턴되면 정상적으로 배열이 생성됨을 알려주는 역할
	public static boolean randomArray(int arr[], int max, int min) {
		if(arr == null) {
			return false;
		}
		if((max-min+1)<arr.length) { //랜덤수의 개수가 배열의 length보다 작다면 만들 수가 없음(무조건 중복 발생하기 때문)
			return false;
		}
		int i = 0;
		while(i<arr.length) {
			int r = random(max, min);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	// 출력 메서드
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();//줄바꿈
	}
	
	// 스트라이크 메서드
	//기능 : 컴퓨터의 배열(com[])과 사용자의 배열(user[])을 받아서 위치와 값이 일치하면 count 반환
	//메서드명 : strike
	public static int strike(int com[], int user[]) {
		int cnt =0;
		for(int i=0; i<com.length;i++) {//com.length 이든 user든 상관없음
			if(com[i] == user[i]) {
				cnt++;
			}	
		}
		return cnt;
	}
	
	// 볼 메서드
	// 기능 : com[], user[] 위치상관 없이 일치하면 카운트 증가 반환기능
	// 메서드명 : ball
	public static int ball(int com[], int user[]) {
		int cnt=0;
		for(int i =0; i<com.length; i++) {
			if(isContain(user, com[i])) {
				cnt++; //자리상관없이 일치하면 카운트 증가
			}
		}
		//스트라이크의 개수만큼 차감
		return cnt - strike(com, user);
	}
	


}
