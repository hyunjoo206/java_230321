package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	private static final String Iterator = null;

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용 
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 배열 대신 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지 않음 (index)번지가 없음
		 * - 중복x
		 * 
		 * Map
		 * - 값을 두개 저장, key/value 쌍으로 저장
		 * - key는 중복 불가, value는 중복가능
		 * - key가 중복되면 덮어쓰기 됨
		 * - 아이디/패스워드 처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * int arr[]; : 기본 자료형 사용가능
		 * collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함
		 * 
		 * int -> Integer, String, 나머지 자료형들은 첫글자만 대문자로 변환 Byte, Boolean ...
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 * 
		 * */
		
//		List list1 = new List(); //error 
		List list1 = new ArrayList(); // Object클래스가 자동 지정된 케이스
		ArrayList list2 = new ArrayList(); // Object 클래스가 자동 지정된 케이스 (숫자, 문자 같이 들어가는 경우 이걸로)
		
//		숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		문자열만 가능한 ArrayList 생성
		ArrayList<String> list3 = new ArrayList<String>();
		
//		add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); //기본적으로 to String이 있어서 출력시 [1,2,3]으로 나옴
		
//		size(): list의 총 개수
		System.out.println(list.size());
		
//		string 요소 추가 / list3에 문자 5개 지정 후 출력, 총 개수 출력
//		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("apple");
		list3.add("mango");
		list3.add("orange");
		list3.add("grape");
		list3.add("banana");
		System.out.println(list3);
		
//		리스트 생성 후, 1~10까지 저장한 후 출력
		List<Integer> list4 = new ArrayList<>(); //뒤에<> 생략해도 가능, 앞에 Array 생략해도 가능
//		int size=10; //사이즈를 지정해도 됨
		for(int i=1; i<=10; i++) {
			list4.add(i);
		}
		System.out.println(list4);
	
//		리스트는 있던 값에 또 추가됨 (인덱스가 없으므로)-> 배열과 다름 (덮어쓰기 안됨)
		for(int i=1; i<=10; i++) {
			list4.add(i);
		}
		System.out.println(list4);
		
//		0번지에 있는 값만 찍기
//		get(index) : index 번지의 값을 가져와라
		System.out.println(list4.get(0));
	
//		set(index,값) : index번지의 내용을 값으로 변경해라
		list4.set(2, 30); // 2번지의 값을 30으로 변경해라
		System.out.println(list4);
		
//		remove(index) : index 번지값 삭제
//		remove(Object) : object 값으로 넣으면 값으로 삭제
		list4.remove(2);
		System.out.println(list4);
		
		Integer a = 10;
		list4.remove(a);
		System.out.println(list4); //첫번째 10이 지워짐
		list4.remove(a);
		System.out.println(list4); //두번째 10이 지워짐
		
//		contains(Object) : list에 값이 있는지 검사 - 있으면t 없으면f
		System.out.println(list4.contains(a));
		
//		clear() : list 삭제(비용)
		list4.clear();
		System.out.println(list4);
		
//		isEmpty() : list가 비어있는지 체크 비어있으면t 아니면f
		System.out.println(list4.isEmpty());
		
//		list4에 for문으로 1~5까지만 입력
		for(int i=5; i>=1; i--) {
			list4.add(i);
		}
		System.out.println(list4);			

//		list4 요소(element) 출력 : list에서만 가능
		for(int i=0; i<list4.size(); i++) {
			System.out.print(list4.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
//		향상된 for문 사용 : 요즘 자주 사용함 (Set도 가능)
		for(int tmp : list4) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println("--"
				+ "-------------------");

//		Iterator : 컬렉션을 출력하기 위해 사용
//		list는 순서를 보장하기 때문에 get(i)를 이용해서 원하는 번지에 접근이 가능
//		하지만 Set은 순서를 보장하지 않기 때문에 for문을 이용할 수 없다.
//		따라서 Set은 향상된 for, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능
		
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list4.iterator();
		while(it.hasNext()) { // hasNext() 다음 요소가 있는지 체크 - t/f로 나타냄
			Integer tmp = it.next(); // next() 다음 요소 가져오기
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		
		System.out.println("> IndexOf 출력");
//		indextOf(값) : 해당 값이 list의 list index 번지를 반환 / 없다면 -1 리턴
		Integer b = 5;
		System.out.println(list4.indexOf(b));
		System.out.println("---------------------");
		
		//Collections.sort(list4); //오름차순 정렬만 가능
		System.out.println(list4);
		
		//sort(객체)
		// - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함(익명클래스를 사용)
		// - 비교(compare) 메서드를 사용하여 객체를 정렬
		
		//내림차순 / 오름차순 => 내림차순 필요할 때만 Comparator 쓰시길
		list4.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순, o2-o1: 내림차순
				return o1-o2;
			}
		});
		System.out.println(list4);
		
		
	}
	

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
