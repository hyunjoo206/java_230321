package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
//		5명의 점수를 입력받아 배열에 저장하고,
//		점수의 합계, 평균, 최대, 최소값을 출력하세요
//		
//		1. 스캐너 열기
//		2. 배열 선언, 변수들 선언
//		3. for문을 사용하여 배열 안을 탐색 index 번지에 값을 저장
//		4. 합계, 평균, 최대, 최소의 값을 구하기
//		5. 출력
		
		
		int [] score = new int[5];		 //배열선언
		
		int sum =0; //합계 변수 선언
		double avg = 0; //평균 변수선언 - double형태
		int max=0 , min =100; //최대최소값 변수선언
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요(5개)");
		
		for(int i=0;i<score.length;i++) { 
			score[i] =scan.nextInt();//입력받은 값을 배열 score[0]~score[4]까지 저장
			sum = sum + score[i]; // 합계 구하기
			
//			max = Math.max(max, arr[i]); if문과 같은 식 // max와 arr[i]를 비교해서 큰 값을 변수(max)에 넣어주는 메소드(?)
//			min = Math.min(min, arr[i]); if문과 같은 식
			
			
			if (score[i]>max) { 
				max = score[i];
			}
			
			if (score[i]<min) { //score[1]값 < score[0]값이면 min에 score[i]값 담기
				min = score[i];
			} // 계속 반복해서 최대, 최소값 찾기 
			
			
		}
		avg = sum/(double)score.length;
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
		
		
	}

}
