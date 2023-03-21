package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		// 각 자리수 합계 출력
		// ex) 11456 => 65411 => 6+5+4+1+1 
		// ex) 19874 => 47891 => 4+7+8+9+1
		// 배열을 이용해서 해보기
	
		                        
		Scanner scan = new Scanner(System.in); // 1.스캐너 오픈
		
		System.out.println("5자리 숫자를 입력하세요");// 2.입력받기 11456
		int num = scan.nextInt();
		
		int [] arr = new int[5];// 3.배열 선언 및 변수 선언
		int sum =0;
		int i =0;
		
		//4. 반복문 이용하여 마지막 자리가 없어질 때까지 배열에 저장, 합계
		//   /와%를 이용하여 각 자리 숫자 얻기. while문 이용 (몇 번 반복할지 모를 경우)
		
		while (num > 0) { //num값이 0 되기 전까지 반복
			int b = num % 10; // 마지막 자리 6을 변수 b에 담음
			arr[i] = b; // 6을 arr[i]에 담음
			sum += b; // 나온 숫자 합계 구하기 
			num = num / 10; //몫만 저장 -> 소수점은 버려짐 1145 저장 
			System.out.print(arr[i]+" "); // 11456을 각각 나눈 숫자 배열
			i ++; // i는 늘어나서 다음 숫자 구하기
		} 
		System.out.println();
		System.out.println("sum : " + sum);

		
		
		
		
		

		scan.close();
	
	}
	
}
