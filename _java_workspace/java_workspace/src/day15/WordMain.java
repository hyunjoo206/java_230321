package day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		WordManager w = new WordManager();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		
		do {		
//			System.out.println();
//			System.out.println("----메뉴----");
//			System.out.println("1.단어추가");
//			System.out.println("2.단어출력");
//			System.out.println("3.단어검색");
//			System.out.println("4.단어수정");
//			System.out.println("5.단어삭제");
//			System.out.println("6.파일로 출력");
//			System.out.println("7.종료");
//			System.out.println("-----------");
			
			w.printMenu();

			menu =scan.nextInt();
			w.addWord();
			switch(menu) {
			case 1 : 
				w.add(scan);
				break;
			case 2 : 
				w.printWord();
				break;
			case 3 : 
				w.searchWord(scan);
				break;
			case 4 : 
				w.updateWord(scan); 
				break;
			case 5 : 
				w.deleteWord(scan); 
				break;
			case 6 : 
				w.printFile();
				break;
			case 7 : 
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}			
			
		}while(menu!=7);
		
		System.out.println("프로그램 종료");
	}

}
