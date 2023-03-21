package day01;

public class IF문2 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80 이상이면 합격, 아니면 불합격
		 * 출력 : 합계, 평균, 평가
		 * */
		
		int kor = 80;
		int eng = 80;
		int math = 70;
		int sum;
		double avg ;
		
		sum = (kor + eng + math);
		avg = sum /3.0;
			
		System.out.println("sum: "+ sum + ", avg: " + avg );
		
		if (avg >= 80){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 평가 A(평균>=90),B(평균>=80),C(평균>=70),D(평균>=60),F(평균<60)
		
		if (avg >= 90) {
			System.out.println("A");
		}else if (avg >= 80) {
			System.out.println("B");
		}else if (avg >= 70) {
			System.out.println("C");
		}else if (avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
			

	}

}
