package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제2선생님 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		
		int exit = 1; // exit = 0 이면 종료
		
		while(exit != 0) { //exit가 0이 아닌동안 반복
			System.out.println("과목과 점수를 입력하세요");
			String sub = scan.next();
			int score = scan.nextInt();
			
			map.put(sub, score);
			System.out.println("계속:1, 종료:0");
			exit = scan.nextInt();
		}
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String sub = it.next();
			sum += map.get(sub);
			System.out.println(sub+":"+map.get(sub));
		}
		System.out.println("sum:"+sum);
		System.out.printf("avg:%.2f",(double)sum/map.size());
	}

}
