package day05;

public class ArrayCopy {

	public static void main(String[] args) {
//		3개의 값을 담을 수 있는 String 배열 생성 후 
//		국어, 영어, 수학이라는 글자를 담은 후 출력
//		배열은 길이를 가지고 있음
//		한번 정해진 길이는 이후 추가/삭제가 불가능
//		배열의 길이를 늘리거나 줄이고 싶을 경우 배열복사 ArrayCopy를 이용
		
		
		//int[]arr = new int[3] 대신 int를 String으로 바꿔주면 됨
		String [] arr = new String[3];
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
		//향상된 for문
		for(String tmp : arr)
		System.out.print(tmp+" ");
		
		System.out.println();//줄바꿈
		
		// 사회, 과학 추가 
		String []arr2 = new String[6];
		
		for(String tmp : arr2)
			System.out.print(tmp+" ");
		
		System.out.println();
		System.out.println(arr);
		System.out.println(arr2);
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		for(String tmp : arr2)
			System.out.print(tmp+" ");
		System.out.println();//줄바꿈
		
		//arrayCopy를 이용한 방법
		String arr3[] = new String[arr.length*2];//기존 arr배열보다 2배 큰 크기
		//System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수)
		System.arraycopy(arr, 0, arr3, 1, arr.length);
		//arr 배열을 인덱스1 부터 arr3번을 0부터 다 찍어주셈
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}

		
		
		
	}

}
