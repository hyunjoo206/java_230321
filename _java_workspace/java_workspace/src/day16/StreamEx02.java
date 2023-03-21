package day16;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복되는 값은 삭제 
		 * */
		
		int[] arr = {5,6,1,3,5,1,7,8,6,4,2,8,4};
		Arrays.stream(arr)
			.distinct()
			.filter(a-> a%2==0)
			.sorted()
			.forEach(System.out::println);
		
		// distinct : 중복값 제거
		// filter(조건)
		// sorted : 정렬
		
		System.out.println("------짝수배열 생성-------");
		//짝수배열 생성
		int res[] = Arrays.stream(arr)
						.filter(a-> a%2==0)
						.distinct()
						.sorted()
						.toArray();
		for(int tmp : res) {
			System.out.print(tmp+" ");
		}
		
		
		
	}

}
