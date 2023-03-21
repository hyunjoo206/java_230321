package day02;

public class For문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4, 2*3=6 ... 2*9=18
		 * 	
		 * 초기화 : 1부터 i=1
		 * 조건식 : 9까지 i <10
		 * 증감식 : i+=1
		 * 실행문 : 2 * i = (cal=2*i)
		 * 
		 * */
		
		int num =2;
		for(int j =2; j<10; j++) { 
			for(int i=1; i<10; i++) { 
				System.out.println(j +"*"+ i + "=" + (j*i)); 
			} 

			
		}
		
		/*1~10까지의 홀수의 합, 짝수의 합을 출력
		 * 
		 * 초기화 : i=1
		 * 조건식 : i<=10
		 * 증감식 : i++
		 * 실행문 : 누적 (sum)

		 * */
		
		int evenSum = 0, oddSum=0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { //짝수의 조건
				//짝수의 합계 
				evenSum = evenSum + i;
			}else {
				//홀수의 합계
				oddSum = oddSum + i;
			}
			
		} 
		
		System.out.println("짝수의 합 :" + evenSum);
		System.out.println("짝수의 합 :" + oddSum);
		
		// 2중 for문
		// 2단, 3단, 4단, 5단, ... 9단
		// 2*1, 2*2, 2*3 .. *9
		// 2단 1~9, 3단 1~9단
		
		
		System.out.println("----------------- ");
		
		int num1 =2;
		for(int i =1; i<10; i++) { 
			for(int j=2; j<10; j++) { 
				System.out.print(j +"*"+ i + "=" + (i*j)+ " "); 
			} 
			System.out.println(); //줄바꿈
		}
		
		

	}

}
