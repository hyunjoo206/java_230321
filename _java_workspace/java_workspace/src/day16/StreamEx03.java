package day16;

import java.util.ArrayList;
import java.util.List;

public class StreamEx03 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",90));
		list.add(new Student("강감찬",87));
		list.add(new Student("홍길순",76));
		list.add(new Student("강길동",46));
		list.add(new Student("강길순",67));
		
		//class에 toString이 존재하면
		//list.stream().forEach(System.out::printin);
		
		//class에 toString이 없다면 -한줄로 간단히 가능
//		list.stream().forEach(a->System.out.println(a.getName()+":"+a.getScore()));
		
		//중괄호{} 사용해서 해보기 - 위에 한 줄을 풀어서
		list.stream().forEach(s->{ // s=> new Student("홍길동",90)
			String name = s.getName(); //홍길동
			int score = s.getScore(); //90
			System.out.println(name+":"+score);
		});
		
		// 합계 => intStream
		// getScore() => Integer => int로 변환 
		// 추출 => map, int 변환 => mapToInt
		int scoreSum = list.stream().mapToInt(a->a.getScore()).sum();
		System.out.println("합계:"+scoreSum);
		
		// 개수
		long c = (long)list.stream().count();
		System.out.println("총 인원수:"+c);
		
		//점수가 70점 이상인 친구들의 합계
		int sum = list.stream()
					.filter(a-> a.getScore()>=70)
					.mapToInt(s->s.getScore())
					.sum();
		System.out.println("70점 이상인 학생의 점수 합계:" + sum);
	}

}
