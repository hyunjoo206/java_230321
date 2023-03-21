package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1~10까지 담고있는 배열 arr를 생성 후 출력
		
		int [] arr =new int[10];
		
		for(int i=0; i<arr.length; i++) { //0 1 2 3 4 5 6 7 8 9 인덱스
			arr[i] =i+1 ; // 0번지에 0+1을 담음 , 반복
			System.out.print(arr[i]+" ");		
		}
		System.out.println(); //줄바꿈
		
		//배열을 섞는 코드 => index에 random을 활용하여 숫자를 바꿈 
		
		//교환 개념
//		int a = 10;
//		int b = 20;
//		int c = a; //a,b 맞교환이 불가하므로, 임시로 하나의 변수(c) 생성하여 넣어주어 바꿈
//		a = b;
//		b =c;
//		System.out.println(a+", "+b);

		//방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
//		(int)(Math.random()*개수);+시작값
		int min = 0 ; //시작번지
		int max = arr.length; //개수
		
		//배열섞기
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min; //0~9까지 10개
			//arr[0], a[random]번지 교환
			int tmp = arr[i]; //0번지의 값이 tmp에 담김
			arr[i] = arr[random]; //arr[0]에 random값(7)이 담김
			arr[random] =tmp; // tmp의 값이 arr[random(7)]인덱스에 담김
		}
		
		System.out.println("----------- 섞은 후 -----------");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();//줄바꿈
		
		//오름차순 정렬 : 작은 수부터 큰 수 순서로 정렬
		//내림차순 정렬 : 큰 수부터 작은 수 순서로 정렬
		
		//8 1 2 10 5 9 4 7 3 6 
		//1 8 2 10 5 9 4 7 3 6 -> 첫 번째 수와 비교 pass1
		//1 2 8 10 5 9 4 7 3 6  -> 두 번째 번지부터 비교 
		//1 2 8 10 5 9 4 7 3 6  ->  
		//1 2 5 10 8 9 4 7 3 6  -> 
		//1 2 4 10 8 9 5 7 3 6  -> 
		//1 2 3 10 8 9 5 7 4 6  -> pass2
		
		
		for(int i=0; i<arr.length-1; i++) { //인덱스8번 까지만 다음 거랑 비교하면 되니까 arr.length-1을 해줌
			for(int j=i+1; j<arr.length; j++) { //j는 인덱스i번째보다 하나 더 큰 인덱스 i+1번째랑 비교하는 거니까
				if(arr[i] > arr[j]) { //오름차순, 부등호 반대로 하면 내림차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
							
				}				
			}
		} System.out.println("--------오름차순 정렬 후 -------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//내림차순 정렬
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}System.out.println("--------내림차순 정렬 후-----------");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
