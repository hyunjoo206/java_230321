package day04;

public class 배열2 {

	public static void main(String[] args) {
//		5개 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력
//		입력과 출력은 for문을 활용하여
//		출력모양 => 배열이름[번지]=값
		
		int size =5; //안해도 상관무
		int arr1[]= new int[size];
		for(int i=0; i<arr1.length; i++) { //0~4 index 범위
			arr1[i]=i+1;
			System.out.printf("arr1[%d]=%d\n",i,arr1[i]);
		}
		System.out.println();//줄바꿈
		
//		10개 값을 갖는 배열을 생성하고, 짝수만을 저장하고 출력
		
		int arr2[] =new int[10];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=2*(i+1);
			System.out.printf("arr2[%d]=%d\n",i,arr2[i]);
		}
		
		
	}

}
