package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * Iterator 써보기~
		 * */
		
		ArrayList<String> myDay = new ArrayList<String>();
		
		myDay.add("기상");
		myDay.add("양치");
		myDay.add("마리케어");
		myDay.add("샤워");
		myDay.add("외출");
		myDay.add("학원등원");
		myDay.add("학원하원");
		myDay.add("식사");
		myDay.add("공부");
		myDay.add("취침");
		
		for(int i=0; i<myDay.size(); i++) {
			System.out.print(myDay.get(i)+" ");			
		}
		System.out.println();
		System.out.println("----------------------------");
		
		for(String tmp : myDay) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("----------------------------");

		Iterator<String> it = myDay.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		//가나다순 정렬
		Collections.sort(myDay);
		System.out.println(myDay);
		
		myDay.sort(new Test());
		System.out.println(myDay);
		
		
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		return o2.compareTo(o1); //내림차순
	}
	
	
}

