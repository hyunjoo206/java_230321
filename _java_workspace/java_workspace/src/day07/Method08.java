package day07;

public class Method08 {

	public static void main(String[] args) {
		/* 배열이 주어졌을 때
		 * 
		 * 
		 * */ 
		
		
		int [] arr1 = new int[] {1,8,5,7,33,11,22,88,17,9,21,4,25,77,45};
		
		System.out.println("정렬전");
		printArray(arr1);
		sortArray(arr1);
		System.out.println();
		System.out.println("정렬후");
		printArray(arr1);
		
		//랜덤수 채워 리턴하는 메서드 불러오기

		System.out.println();
		System.out.println("------random 배열출력------");
		
		int arr2[] = randomArray(5); 
		System.out.println(arr2); //객체주소값만 나옴
		printArray(arr2);
		
		System.out.println();
		System.out.println("------random 배열정렬------");
		
		sortArray(arr2);
		printArray(arr2);
		
		
	} // 메인 끝
	
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 정수 배열 => int[]arr
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한 줄에 나열
	 *  
	 * */
	
	
	public static void printArray(int[]arr) {
		
			for(int i=0; i<arr.length; i++) {
				if(i%5==0 && i!=0) {
					System.out.println();
				}
				System.out.printf("%3d", arr[i]);
			}
	}
	
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 정수배열 -> int arr[]
	 * 리턴타입 :	void (줄 거 없음)
	 * 메서드명 : sortArray
	 * 
	 * */
	
	public static void sortArray (int[]arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) { //j는 i 다음 것부터니까
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]= tmp; //변수 값 바꾸려고 tmp 사용
				}
			}
		}
		
		 
		
	}//메서드 sortArray 끝
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 사이즈를 매개변수로 받아서 랜덤수를 채우기 => int size
	 * 리턴타입 : 배열타입 => int[]
	 * 메서드명 : randomArray 
	 * */
	
	public static int[] randomArray(int size) {
	
		int [] arr2 = new int[size]; // 1. size만큼 인덱스를 가지는 새로운 배열 arr2 생성 , 
									// 사이즈 2라면 int[]arr2 = new int[2]
	
		for(int i=0; i<arr2.length;i++) {  // arr2의 인덱스 0,1,2까지 arr2[0],arr[1],arr[2] 생성.
			arr2[i] = (int)(Math.random()*100)+1; // 랜덤값을 arr2[0],arr[1],arr[2]에 넣기
		} 
		return arr2; //arr2를 리턴
		
		
	}
	
	
	
} //클래스 끝
