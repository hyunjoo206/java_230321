package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
//		5개 값을 가지는 배열을 생성 후
//		1~50 사이의 랜덤값을 저장 후 출력

		//1.배열을 정의
		int [] arr =new int[6];
		int random = 0;
		
		//for 배열의 idex 탐색
		
		for(int i=0; i<arr.length; i++) {
			random = (int)(Math.random()*45)+1; //랜덤값 생성
			arr[i]= random; //랜덤값 배열에 저장, 
							//위에 문장이랑 합쳐서 arr[i]=(int)(Math.random()*50)+1;으로 써도 
			System.out.printf(arr[i]+" ");
		}
		
//		로또번호 생성은 6개 값을 1~45사이로 바꿔주면 됨. 그러나 중복 발생
//		=> 메서드 배우고 다시 할 예정
		
		
//		로또번호 오름차순 정렬
		
		System.out.println();//줄바꿈
		System.out.println("오름차순 정렬 후>>");
		
		for (int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();//줄바꿈
		
		//향상된 for문 => 처음부터 끝까지 무조건 다 탐색해야 함 // 1부터 끝까지 순차탐색할 경우에만 사용
		for(int tmp : arr) { //arr에 있는 값을 tmp에 순차적으로 넣어서 보여줌
			System.out.print(tmp+" ");
		}
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
