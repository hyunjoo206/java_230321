package day11;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지파일을 검색하여 출력하는 코드를 작성 //스캐너 입력
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"}
		 *  
		 * --이미지 파일--
		 * String.jpg
		 * method.png
		 * 
		 *  StringEx01 contains 참고해서 하기
		 * 
		 * */
		
		String[] fileName = new String[5];
		String[]img = {"jpg","png","gif","jpeg"};
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("5개의 파일명을 입력하세요(ex:java.txt).>");
		for(int i=0; i<fileName.length; i++) {
			String input = scan.next();
			fileName[i] = input;
		}
		
		int cnt = 0;

			for(String tmp : fileName) {
				for(String tmp1 : img ) {
					if(tmp.contains(tmp1)) {
						System.out.println("---이미지 파일---");
						System.out.println(tmp);
						cnt++;
					}
				}
			}
		

		if(cnt == 0) {
			System.out.println("이미지 파일이 없습니다.");
		}
		
	}//메인끝


}


