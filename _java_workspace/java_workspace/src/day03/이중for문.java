package day03;

public class 이중for문 {

	public static void main(String[] args) {
		/* for(1초기화; 2,14조건식; 12증감식){ //1 2 3 
		 * 		3,15실행문:
		 * 		for(4초기화;  5,8,11조건식; 7,10증감식){//1~끝까지, 1~끝까지
		 *			6,9실행문; 		
		 * 		}
		 * }
		 * 
		 * */ 
		// 1-> 1 ->1 ~ 끝까지,  1 -> 2-> 1~ 끝까지
	
	
	/* 가로 세로 5*5 별찍기
	 * 
	 *  ***** 줄 = i 별 = j
	 *  *****
	 *  *****
	 *  ***** 
	 *  *****
	 * */
	// 1줄 줄-> i1 , 별->j5
	// 2줄 줄-> i2 , 별->j5
	// 3줄 줄-> i3 , 별->j5
	
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("================================");
	
		/* *         i=1, j=1
		 * **		 i=2, j=2
		 * ***       i=3, j=3
		 * ****	     i=4, j=4
		 * *****     i=5, j=5
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}System.out.println();
		}
		
		System.out.println("================================");
		
		
		/*     *   i=1 공백=4 j=1
		 *    **   i=2 공백=3 j=2
		 *   ***   i=3 공백=2 j=3
		 *  ****   i=4 공백=1 j=4
		 * *****   i=5 공백=0 j=5
		 * */
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//if문 이용
		
		
		for(int i=1; i<=5; i++) { //i는 줄이니까 5줄
			for(int j=1; j<=5; j++) {
				if(j<=5-i) { //j=1, i=1
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
		
	}
}
