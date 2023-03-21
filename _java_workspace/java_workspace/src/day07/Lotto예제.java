package day07;

import java.util.Arrays;

public class Lotto예제 {

	public static void main(String[] args) {
		/* 로또번호 생성 (1~45까지 랜덤으로 번호를 생성)
		 * 로또번호 = 사용자번호 6자리 숫자 (1~45) : 자동번호 / 랜덤으로 생성
		 * 당첨번호 = 당첨번호 6자리 + 1자리(보너스 번호) (1~45) => 7자리 배열 / 마지막에 생성된 번호가 보너스 번호		 * 
		 * 사용자 번호, 당첨번호를 랜덤으로 발생시켜
		 * 로또의 등수를 확인 (번호 10정도로)		 *  
		 *  */
		
		//배열은 main에서 생성 (매개변수로 받아서)
		int lotto [] = new int [7]; //당첨번호
		int user [] = new int[6]; //사용자번호
			
		// 1번
//		System.out.println(getRanNum());
		
		//2번
		inToArr(lotto);
		inToArr(user);
		
		System.out.print("로또번호(7자리): ");
		printArray(lotto);

		System.out.print("사용자번호(6자리): ");
		printArray(user);

		//
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("ㅜ꽝,,일하자,,,");
		}else {
			System.out.println(rank + "등 당첨~~!!");
		}
		
			
	}//메인끝

	/* 1. 번호를 랜덤으로 생성 기능
	 * 1~45 범위의 랜덤번호 생성 후 리턴
	 * 리턴타입 : int
	 * 매개변수 :	
	 * 메서드명 : getRanNum
	 * */
	
	public static int getRanNum() {	
		int num = (int)(Math.random()*45)+1;			
		return num;
	}
	
	/* 2. 랜덤의 값을 배열에 담아주는 기능 (배열을 완성하세요)
	 * 리턴타입 : x (void)
	 * 매개변수 : (넣어야 하는건) 배열 => int arr[]
	 * 메서드명 : inToArr
	 * */
	
	public static void inToArr(int arr[]) {
		//중복 상관없이 배열 채우기
		
//		for(int i=0; i<arr.length; i++) {
//			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면 채우기
//			arr[i] = getRanNum();
//		}
		
		//for문으로 할 경우
//		for(int i=0; i< arr.length; i++) {
//			int r = getRanNum();
//			if(!removeNum(arr,r)) {
//				arr[i] = r;
//			}else {
//				i--;
//			}
//			
//		}
		
		//while 문으로 변경
		int i =0;
		while(i<arr.length) {
			int r = getRanNum();
			if(!removeNum(arr, r)) {
				arr[i]=r;
				i++;
			}
		}		
		
	}
	
		
	/* 3. 정수 배열을 콘솔에 출력하는 메서드 
	 * 리턴타입 : x (void)
	 * 매개변수 : int[]arr
	 * 메서드명 :printArray
	 * */
	
	public static void printArray(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}


	/* 4. 중복되는 숫자 제거(같은 값이 들어가지 않게 체크)
	 * 리턴타입 : boolean
	 * 매개변수 : int [] arr, random
	 * 메서드명 : removeNum
	 * */
	
	public static boolean removeNum(int[]arr, int random) {
		//중복 상관없이 배열 채우기
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
		
		// 향상된 for문 대신에
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==random) {
//				return true;
//			}
//		return false;	
//		}
			
	}
	
			
	/* 5. 등수 체크하는 기능
	 * 배열에 생성한 랜덤값이 있는지 체크(있으면 T 없으면 F)
	 * 리턴타입 : int 등수 리턴 
	 * 매개변수 : 로또번호, 사용자번호 =>2가지 필요 int lotto[], int user[]
	 * 메서드명 : lottoRank
	 * */
	/* ---당첨기준
	 * 6개 일치 : 1등
	 * 5개 + 보너스 : 2등
	 * 5개 : 3등
	 * 4개 : 4등
	 * 3개 : 5등
	 * 나머지 꽝~(-1리턴)
	 * */
	
	public static int lottoRank(int lotto[], int user[]) {
		//lotto배열(7개)과 user배열(6개)은 갯수가 달라.
		//만약 배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우 에러체크
		if(lotto.length <= user.length) {
			return -1;
		}
		
		int cnt = 0; //당첨번호의 개수 카운트 (몇개 맞는지 체크)
		for(int i=0; i<user.length; i++) {
			/* user번호가 1,2,3,4,5,6
 			 * lotto 번호가 1,2,7,8,5,4,   9
			 *  
			 */
			if(removeNum(user, lotto[i])) {
				cnt++; //보너스번호 제외
			}
		}
		
		//cnt의 갯수로 switch로 등수판별
		
		switch(cnt) {
			case 6: return 1;
			case 5:	
	//			if(removeNum(user, lotto[lotto.length-1])) {
	//				return 2;
	//			}else {
	//				return 3;
	//			}
				//삼항연산자로
				return removeNum(user, lotto[lotto.length-1])? 2:3;
				
			case 4:	return 4;
			case 3: return 5;
			default : return-1;
		}
	}

	 



	
	
	
	
}//클래스끝
