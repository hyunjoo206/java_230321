package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
//		5명의 점수를 입력받아서 배열에 저장하고,
//		점수의 합계와 평균을 출력
//		합계 :
//		평균 :
//		배열 갯수 5개, 안에 값 입력받고, 합계와 평균
		
		//배열 선언
		int score[] = new int[5]; 
		
		//합계와 평균 계산 위해서 변수 선언
		int sum = 0;
		double avg = 0;
		int max=0, min = 101;
		
		//스캐너 점수 받아오기
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 5개 입력하세요");
		
		//점수 받아서 총합 계산
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
			sum += score[i]; //sum= sum+score[i]와 같은 것
			//sum은 누적해서 담기. 누적이 되려면 나 자신을 한 번 더 더해야 한다. 
			
			//최대 최소
			if (score[i] > max) {
				max = score[i];
			}
			min = score[0];
			if (score[i] < min) {
				min = score[i];
			} //max=Math.max(max,arr[i]); <- 이렇게 해도 됨
		} 
		
		//평균 계산
		avg = sum / (double)score.length; //(double)은 sum앞이나 score.length 앞 아무데나 붙여도 됨
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("최고점수 :" + max);
		System.out.println("최소점수 :" + min);
		
		scan.close();
		
	}

}
