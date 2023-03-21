package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// 로또번호 출력 : Set 이용
		// random으로 생성 1~45까지 총 6개
		
		//Math 클래스에서 제공하는 random메서드 사용
//		int a = (int)(Math.random()*45)+1;
		
		//Random클래스 사용하는 방법
		int b = new Random().nextInt(45)+1;
		
		TreeSet<Integer>set = new TreeSet<>(); //TreeSet은 정렬이 되어서 나옴
		int size = 6;
		
		//for문은 그냥 6번 생성하라는 뜻. 중복이 될 수 있으니까 비어있을 수 있어서 while문 사용해야 함
		//set은 중복허용 x니까 
		
		while(set.size()<6) {
			int a = (int)(Math.random()*45)+1; //중복값이 들어가면 사라지므로 size가 5가 될 때까지 채움
			set.add(a);
		}	
		System.out.println(set);
		System.out.println(set.pollFirst()); //첫번째꺼 꺼내고 값을 지움
		System.out.println(set);
//		System.out.println(set.first()); //맨앞
		
		System.out.println(set.last()); //맨뒤

		
	}

}
