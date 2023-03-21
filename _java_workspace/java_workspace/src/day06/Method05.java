package day06;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 메서드를 이용하여 판단
		 * 2~100까지 for문 돌려서 isPrime 호출 후 true이면 출력 
		 * */
		
		int sum = 0;
		for(int i=2;i<=100;i++) { //2~100까지 for문 돌리기
			if(isPrime(i)) { //if(ture)이면 i출력
				System.out.print(i+" ");
				sum += i;
			}
			
		}
		System.out.println();
		System.out.println("-----소수의 합계-----");
		
		System.out.println(sum);
		
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별
	 * 소수 : 1과 자기 자신(num)만을 약수로 가지는 수
	 * 리턴타입 : boolean 
	 * 매개변수 : int num
	 * 메서드명 : isPrime 
	 * */
	
	public static boolean isPrime(int num) {
		
		int cnt = 0;
		for(int i=1; i<=num; i++) { //만약 num1 이 4라면,
			if(num % i == 0) { // 4%1=0 4%2=0 4%3=1 4%4=0
				cnt += 1; //약수의 갯수 = 3
				}
		}
		if(cnt ==2) { //약수의 갯수가 2개여야 소수니까, 약수의 갯수가 2면 
			return true; // true 반환
		}
		return false;//아니면 false
		
		
	} //isPrime메소드 끝
	

	
} //클래스 끝
