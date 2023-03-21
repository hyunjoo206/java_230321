package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	private static HashMap<String,Integer>map = new HashMap<>();
	Scanner scan = new Scanner(System.in); //공용변수
	int sum = 0;
	
	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고, 출력
		// 총 지불가격 출력
		// 입력 -> 메서드로, 출력 -> 메서드로 구현
		
		MapEx02 ex02 = new MapEx02();
	
		//선생님꺼 참고해서 수정하기
		ex02.make(map);
		ex02.print(map);
		
	
	}
	
	//입력메서드
	public void make(HashMap<String,Integer>map) {		
		int size=3;
		
		while(map.size()<size) {		
			System.out.println("상품명:");
			String name = scan.next();
			System.out.println("가격");
			int price = scan.nextInt();
			
			map.put(name, price);					
		}		
	}
	
	
	//출력메서드
	public void print(HashMap<String,Integer>map) {
		
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			sum += value;
			System.out.println(key+":"+value);
		}
		System.out.println("합계:"+ sum);
		
		
	}
	


}
