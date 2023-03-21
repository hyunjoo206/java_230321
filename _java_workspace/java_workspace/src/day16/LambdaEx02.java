package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		// Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		/* 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨.
		 * 재사용 불가 - 다른 연산을 하려면 스트림을 다시 생성해야 됨.
		 * 
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 최종연산 : sum(), forEach(), reduce(계산)0
		 * 
		 * */
		
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		 
		int[] arr = {1,2,3,4,5};
		long cnt= Arrays.stream(arr).count();
		System.out.println(cnt);

		int sum= Arrays.stream(arr).sum();
		System.out.println(sum);
//		위에 두 문장을 하나로
//		System.out.println(Arrays.stream(arr).sum());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		//성적배열 a에서 70점 이상인 점수만 합계
		int[] a = {50,78,89,68,54,94,81};
		int sum1 =0;
		for(int i=0; i<a.length; i++) {
			if(a[i] >= 70) {
				sum1 += a[i]; 
			}
		}System.out.println("java로 구현한 sum: "+sum1);
		
		//a배열을 Stream으로
		int sum2 = Arrays.stream(a).filter(b-> b>=70).sum();
		System.out.println("stream으로 구현한 sum: " + sum2);
		
		
		//성적리스트 생성, 스트림 생성 후 70 이상인 점수만 합계
		ArrayList<Integer> score = new ArrayList<>();
		score.add(70);
		score.add(58);
		score.add(95);
		score.add(78);
		score.add(65);
		
		int scoreSum = score.stream().filter(b-> b>=70)
				.mapToInt(n-> n.intValue()).sum();
		System.out.println("list 합계 : "+ scoreSum);
		
		Stream<Integer> s = score.stream();
		s.filter(i-> i>=70).forEach(System.out::println);
		
		Stream<Integer> s1 = score.stream();
		int s1Sum = s1.mapToInt(n->n.intValue()).filter(b->b>=70).sum();
		System.out.println(s1Sum);
		
		
		
	}

}
