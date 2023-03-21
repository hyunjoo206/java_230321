package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/*
		 * Set 순서보장 x, 중복 x
		 * HashSet
		 * index가 없음
		 * 
		 * */

		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		
		//향상된for문 이용 출력
		System.out.println(set);
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		
		//Iterator 사용 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp + " ");
		}
		
		
		System.out.println();
		System.out.println("===========================");
		
		
		//set 정렬 : 순서가 없기에 정렬 불가. 그래서 중복 체크할때 사용함
		
		// set => list 변환 후 정렬
		List<String> list = new ArrayList<String>(set);
		
		Collections.sort(list);
		System.out.println("Set=> list 변경");
		System.out.println(list);
		
		//
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); //내림차순
			}
		});
		
		System.out.println(list);
		
	}

}
