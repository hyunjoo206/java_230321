package day03;

import java.util.Scanner;

public class 혼자_복습 {

	public static void main(String[] args) {
		// 1부터 100까지 합계
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum = i+sum;					
		}System.out.println(sum);

		// 사용자 인풋 숫자의 약수 구하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println(); //줄바꿈
		
		//
		
		
		
	}

}
