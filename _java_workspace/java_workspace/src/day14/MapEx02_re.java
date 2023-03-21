package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02_re {
	HashMap<String, Integer>map = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		

	}

	//입력메서드
	public void make(HashMap<String, Integer>map) {
		int size=3;
		while(map.size()<size) {
			System.out.println("상품명 입력하세요");
			String name = scan.next();
			System.out.println("가격을 입력하세요");
			int price = scan.nextInt();
			
			map.put(name, price);
		}
	}
	
	int sum =0;
	//출력메서드
	public void print(HashMap<String, Integer>map) {
		
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			sum += value;
			System.out.println(key+":"+value);
		}System.out.println("합계: "+sum);
		
		
	}
	
	
	
}
