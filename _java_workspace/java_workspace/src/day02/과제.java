package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 1~100까지 2의 배수(짝수)를 출력
		 * 2 4 6 8 10 
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ...
		 * 
		 * */ 
		
//		 0+2 0+4 0+6 0+8 0+10
//		 10+2 10+4 10+6 ...
		
//		for(int i=0; i<100; i+=10) {
//			for(int j=2; j<=10; j+=2) {
//				int num = i+j;
//				System.out.print(num + " ");
//			}System.out.println();
//		}

//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i+ " ");
//				//줄바꿈
//				if(i % 10 == 0) {
//					System.out.println(" ");
//				}
//			}
//		}
		
		//복습
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.print(i+ " ");
				if(i%10 == 0) {
					System.out.println();
				}
			}
		}
		
		
		
	}

}
