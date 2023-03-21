package day04;

import java.util.Scanner;

public class 문제_self {

	public static void main(String[] args) {
		int num = (int)(Math.random()*50);

		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		Scanner scan = new Scanner(System.in);
		int i =0;
		System.out.println("1~50 사이의 숫자를 입력하세요");

		do {i = scan.nextInt(); 
					
				if(num<1 || num>50) {
					System.out.println("범위를 벗어났습니다 (1~50)");
					}
				else if(i>num) {
					System.out.println("down");
				}
				else if(i<num){
					System.out.println("up");
				}else
					System.out.println("정답~~");

		}while(i!=num); //조건식

		scan.close();

	

	}

}
