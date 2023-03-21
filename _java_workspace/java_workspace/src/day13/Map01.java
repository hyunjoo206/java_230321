package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map   => 많이 쓰임
		 * - 값을 2개 저장, key/value 값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer>map = new HashMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 사용할 수 없음
		 * Map => Set으로 변경 후 출력
		 * 
		 * list, set => .add()   //추가  .get(index);            //추출
		 * map => .put()         //추가   getKey(), getValue();  //추출 
		 * 
		 * 
		 * */
		
//		HashMap<String, Integer>map = new HashMap<String, Integer>();
		HashMap<String, Integer>map = new HashMap();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		map.put("과자", 2000);
		map.put("사탕", 500);
		map.put("사탕", 700);
	
		System.out.println(map);//순서없이 나옴, key가 중복되면 앞쪽 것이 사라진다.
		System.out.println(map.keySet()); // key값
		System.out.println(map.values()); // value값
		
		//key = 햄버거인 값을 출력
		System.out.println(map.get("햄버거")); //map.get(key값) => value가 나옴
		
		//set으로 변환 후 요소 출력
		//key를 기준으로 set을 구성하여 값을 줌
		System.out.println("--------Iterator 출력--------");
		Iterator<String> it = map.keySet().iterator(); //keyset으로 key값만 빼서 iterator를 돌림
		while(it.hasNext()) {//다음 값이 있는지 체크해줘
			String key = it.next();// 읽기
			System.out.println(key+": "+map.get(key)); 
		}
		
		//향상된for문 이용
		System.out.println("----------향상된for문이용----------");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+": "+map.get(tmp));
		}
		
		//Map은 값으로 가져와야 함! 
		System.out.println(map); // {}중괄호 : 과자 따로 2000 따로
		System.out.println(map.entrySet()); // []대괄호 : 과자=2000 이 한 묶음
		
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		                                  
		//가격합계
		int sum =0 ;
		for(String tmp : map.keySet()) {
			int value = map.get(tmp);
			sum += value;
		}System.out.println("합계: "+ sum);
		
		//
		
	}

}
