package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {
	
	public static void main(String[] args) {
		/* 단어장   (단어:의미 => hello : 안녕)
		 * 5개의 단어를 입력하고, 단어장을 출력하세요
		 * 
		 * */
		
		//선생님이 한거
		
			Scanner scan = new Scanner(System.in);
			HashMap<String, String> map = new HashMap<>();
			System.out.println("5개의 단어와 의미를 입력해주세요");
			int size = 5; // 넣는만큼 다 들어가고,몇 개 들어갈지 모르니까 size를 정해주기
			
			
			//while 이용해서 단어와 뜻 입력받고 map에 저장
			while(map.size() < size) {
				//입력
				System.out.println("단어:");
				String word = scan.next();
				System.out.println("뜻:");
				String value = scan.next();
				
				map.put(word, value); //map.size() 증가
			}
			
			//출력
			Iterator it = map.keySet().iterator();
			System.out.println("=======단어장=======");
			while(it.hasNext()) {
				String word = (String)it.next(); //key값 반환
				String value = map.get(word); //value값 반환
				System.out.println("단어:"+word+" 의미:"+value);
			}
			
			
			
//			내가 한거~
			
//			Scanner scan = new Scanner(System.in);
//			HashMap<String, String> word = new HashMap<>();
//			System.out.println("5개의 단어와 의미를 입력해주세요");
//			int size = 5; // 넣는만큼 다 들어가고,몇 개 들어갈지 모르니까 size를 정해주기
			
//			for(int i=0; i<size; i++) {
//				System.out.println("단어를 입력해주세요");
//				String inputWord = scan.next();
//				System.out.println("의미를 입력해주세요");
//				String inputValue = scan.next();
//				word.put(inputWord, inputValue);	
//			}
			
//			System.out.println("=======단어장=======");
//			for(String tmp : word.keySet()) {
//				System.out.print(tmp+ ":"+word.get(tmp)+" ");
//				System.out.println();
//			}
//			System.out.println("===================");
//			
		
	
	}
}	

