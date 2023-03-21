package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복(0)
		 * 과목과 점수를 입력해주세요
		 * 국어:89
		 * 수학:97
		 * 0 종료
		 * 
		 * 입력받은 map 출력 후 합계와 평균 구하기
		 * 합계 :  , 평균 :
		 * */
		
		HashMap <String,Integer> calc = new HashMap();	
		
		Scanner scan = new Scanner(System.in);
		
		
		int cnt=0;
		
		while(true) {
			System.out.println("0을 입력하시면 종료합니다");
			System.out.println("과목을 입력해주세요");
			String sb = scan.next();
			if(sb.equals("0")) {
				System.out.println("종료");
				break;
			}
			System.out.println("점수를 입력해주세요");
			Integer sc = scan.nextInt();
			
			if(sc==0) {
				System.out.println("종료");
				break;
			}
			
			calc.put(sb,sc);
			cnt++;
		}

				
				//점수 추출
				for(String tmp : calc.keySet()) {
					System.out.println(calc.get(tmp));
				}
				
				//합계
				
				int sum=0;
				for(String tmp : calc.keySet()) {
					sum += calc.get(tmp);
				}System.out.println("합계:"+sum);
				
				//평균
				
				double avg =0;
				avg=(double)sum/cnt;
				System.out.println("평균:"+ avg);
				
	}

}

