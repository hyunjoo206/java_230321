package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * out.txt 파일을 읽어들여 map에 저장 후 
		 * 이름 : 점수 <- 형태로 출력 
		 * 총 합계, 총 인원 출력
		 */

		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		Map<String, Integer> map = new HashMap<>();

		int sum = 0;
		
		while(true) {
			
			String line = br.readLine(); //홍길동 79
			if(line == null) {break;} //마지막 라인일 경우 null 입력되면 반복문 빠져나감
			
			String[] data = line.split(" ");
			
			//홍길동 79 substring(startindex=포함, endindex=미포함)
			String name = line.substring(0,line.indexOf(" "));
			//endindex를 적지 않으면 끝까지 라는 의미
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
		}
//		System.out.println(map);
		
		for(String n : map.keySet()) { //m(맵)에 저장된 이름들의 set을 반환
			System.out.println(n +" : "+map.get(n));
			sum += map.get(n);
		}
		System.out.println("총 합계 : "+ sum+ ", 총 인원수: "+ map.size());
		
		br.close();
		
		
	}

}
