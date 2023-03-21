package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기 자신의 수만 가지는 수 
		 * ex) 1,3,5,7,11,13,17 ...
		 * 소수는 약수가 2개인 수 (1, 나자신)
		 * num를 입력받아서 입력받은 num가 소수인지 아닌지 판별
		 * 
		 * 누적합계 : sum = sum + i
		 * 개수 : count = count +1 
		 **/
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
			
		int count = 0; //+1+1+1+1
			for(int i=1;i<=num ; i++) {  // 1,2,3
				if( num % i == 0) {  //약수의 조건
				//System.out.println(i);
				count = count+1; //개수
			}
		}
			System.out.println(count);
		if(count == 2) {
			System.out.println(num + ": 소수");
		}else {
			System.out.println(num + ": 소수X");
		}
		
		System.out.println("----------------------------");
		scan.close();
		/* 2~100까지의 소수를 출력
		 * 
		 * */
		
		int cnt = 0;
		for(int num1=2; num1<=100; num1++) {
			cnt = 0;
			for(int i=1; i<=num1; i++) {
				if(num1 % i == 0) {
					cnt=cnt+1;
				}
			}
			//System.out.println(num1 + "---" + cnt);
			if(cnt ==2 ) {
				System.out.print(num1 + " ");
			}
		}
		
		
	
		
	}

}
