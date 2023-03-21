package day04;

public class While문 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 	실행문; //조건식이 false가 될 수 있는 구문을 포함해야 함
		 * 	증감식:
		 * }
		 * 
		 * 초기화
		 * while(조건식){
		 * 실행문;
		 * 증감식;
		 * }
		 * 
		 */

		// 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		System.out.println(" > while문 활용");
		int i=1; //초기값
		while(i<=10) { //조건식
			//실행문 
			System.out.print(i+ " ");
			i++;
		}
		
		System.out.println();
		System.out.println(">>while문 활용하여 1~10까지 짝수만 출력");
		
		int j=2;
		while(j<=10) { // 조건식 - 반복을 하기 위한 조건
			System.out.print(j+ " ");
			j+=2;
		}
		
		System.out.println();
		System.out.println(">>while문+if활용하여 1~10까지 짝수만 출력");
		
		int k=1;
		while(k<=10) { // 조건식 - 반복을 하기 위한 조건
			if(k%2==0) {
				System.out.print(k+ " "); //짝수만 출력
			}
			k++;
		}
	
		// continue문을 이용한 1~10까지 짝수출력
		System.out.println();
		System.out.println(">>while+continue문을 이용한 1~10까지 짝수출력");
		
		int l=0;
		while(l<=10) {
			l++;
			if(l%2 ==1) {//조건이 맞으면 pass니까 조건식이 홀수여야 pass-> 짝수만 출력 (l%2 !=0)도 가능
				//l++; <= 여기에 넣어도 됨
				continue; 
			}
			System.out.print(l+" ");
		}
		

			
		
	}

}
