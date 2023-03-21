	
package day06;
import java.util.Arrays;

public class Method04_my {
public static void main(String[] args) {

		/* 1. random(1~100) 정수 5개를 배열에 담는 메서드 (정수배열 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균: double형 을 리턴) 
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * main에서는 연산식이 있으면 안됨.
		 * main에는 메서드 간의 데이터 전달 및 호출만 있어야 함.
		 * 
		 * */

		int a = sum();
		System.out.println("합계 : " +a);
		double b = avg();
		System.out.println("평균 : " +b);		

	}

	//랜덤정수 5개 담는 메서드 만들기 (매개변수 없고 기능만 하는 타입)	
	public static int sum(){		

			int [] arr =new int[5];
			int sum = 0;
			for(int i=0; i<arr.length; i++) { 
				arr[i] =((int)(Math.random()*100)+1);		
				sum += arr[i];
			}	
			System.out.println(Arrays.toString(arr));
			return sum;			

		}
	public static double avg(){		

			int [] arr =new int[5];
			int sum = 0;
			double avg = 0;
			for(int i=0; i<arr.length; i++) { 
				arr[i] =((int)(Math.random()*100)+1);		
				sum += arr[i];
				avg = (double)sum/arr.length;
			}	
			return avg;			

		}

				

}
