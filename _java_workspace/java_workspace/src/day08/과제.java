package day08;

import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int comNum[] = new int[3]; // 컴퓨터 배열
		int myNum[] = new int[3]; // 내 배열

		System.out.println();
		
		

	}//main 끝
	
	// 랜덤번호 생성
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	
	// 배열에 저장 및 중복제거
	
	public static void randomArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=random();
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break; // for(j의 구문을 빠져나감)
				}
			}
		}
	}
	
	//정수 배열 콘솔 출력
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	//사용자에게 숫자 입력받고 문자를 숫자로 변환

	public static void userArray(int[]userNum) {

		System.out.println("숫자 3개를 입력하세요 >");
		String myStr = scan.next(); //String으로 받음
		String[]myNumstrArr = myStr.split("");// **중요
		for(int i=0; i<userNum.length; i++) {
			userNum[i]=Integer.parseInt(myNumstrArr[i]);
			}
		}	

	//숫자비교

	public static void result(int comNum[], int myNum[]) {

	int s=0; int b=0; int cnt=0;		

	while(true) {
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i] == myNum[j] && i == j) { //스트라이크 기준 조건 (값&자리수도 같을 경우)
					s++;
				}else if(comNum[i] == myNum[j] && i!=j){//볼조건 (값은 같고 자리수는 다를 경우)
					b++;
				}
			}
		}
		cnt++;		

		if(s==0 && b==0) { 
			System.out.println("out!");
		}else{
			System.out.println("> "+s+"S "+b+"B");
			System.out.println("시도횟수 :"+ cnt);
		}
		if(s==3) {
			System.out.println("축 ~ 정답!");
			break;
		}
		userArray(myNum);		

		}	

	}//while문 끝


}//class 끝