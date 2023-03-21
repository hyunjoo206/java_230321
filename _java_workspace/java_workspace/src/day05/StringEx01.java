package day05;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
//		5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 
//		입력한 단어가 있는 파일들을 출력하도록 코드를 작성
		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg", "String 메서드.txt",
				"String 함수.jpg","java의 정석 표시.jpg"};
		
		//ex) java 라고 검색하면 => java가 포함된 파일명 출력
		//ex) jpg 검색하면 => jpg가 포함된 파일명 출력
		//ex) String을 검색하면 => String이 포함된 파일명 출력
		
		int cnt =0;
		System.out.println("검색할 단어를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println("---검색 값 :"+ input +"---");
		
		for(String tmp : fileName) {
			if(tmp.contains(input)) {
				System.out.println(tmp);
				cnt ++;
			}
			
		}
		//검색값이 없다면...
		if(cnt == 0) {
			System.out.println("검색값이 없습니다.");
		}
		

		
		
		}

	}
