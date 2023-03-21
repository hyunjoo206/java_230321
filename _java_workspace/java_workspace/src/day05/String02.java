package day05;

public class String02 {

	public static void main(String[] args) {
		
		// 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력
		// 파일명 : 이것이자바다
		// 확장자 : txt
		// substring 이용하여 문자열 추출
		
		String str ="이것이자바다.txt";
		System.out.println("파일명 : " + str.substring(0,str.indexOf(".")));
		System.out.println("확장자 : " + str.substring(str.indexOf(".")+1));
		System.out.println("확장자 : " + str.substring(7));
		
		//contains(str)는 해당 글자가 포함되어 있는지를 쳌쳌 -> 결과값 boolean (T/F)로 나타내줌
		System.out.println(str.contains("자바"));
		System.out.println(str.contains("java"));
		

	
		
	}

}
