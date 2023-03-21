package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		//Scanner 클래스 사용
		//값을 입력받을 때 사용하는 클래스
		
		//Scanner scan(객체명) = new (클래스 객체를 생성하는 명령어) Scanner(System.in - 입력 받는);
		Scanner scan = new Scanner(System.in);
		
		/* 국어, 영어, 수학의 값을 입력받아
		 * 합계, 평균을 구하고 A,B,C,D,F 등급을 구하시오 */
		
		
		
		
		//입력유도 안내문자
		System.out.println("점수를 입력해주세요.(0~100) : 국어, 영어, 수학 순으로");
		
		int kor  = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor < 0 || kor > 100) {
			System.out.println("국어 점수 오류");
		} 
		if(eng < 0 || eng >100) {
			System.out.println("영어 점수 오류");
		}
		if(math < 0 || math > 100) {
			System.out.println("수학 점수 오류");
		}
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n " , avg);

		char ch = 'F'; //char는 한 글자만 담을 수 있음 - 등급이 한 글자니까 char로
				// 만약 if문을 못 타고 나오면 ch는 값이 없음. 따라서 ch는 초기값을 줘야(initialized) 함.
				// 이 초기값('F')를 지역변수라고 함. 
				// int의 경우 기본값은 보통 0을 넣음
				// char의 경우 기본값은 '' 비어있는 공백이라도 넣어놓음 
				// ***** 지역변수는 무조건 초기화가 되어야 함*****
		if(avg > 100 || avg <0) {
			System.out.println("평균 계산 오류");
		}else if(avg >= 90) {
			ch = 'A';
		}else if(avg >= 80) {
			ch = 'B';
		}else if(avg >= 70) {
			ch = 'C';
		}else if(avg >= 60) {
			ch = 'D';
		}else {
			ch = 'F';
		}
		
		System.out.println("등급 : " + ch);
		scan.close(); //1회성이기 때문에 닫기 전에 전부 처리해야 함
	}
	
}








