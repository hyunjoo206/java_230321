package product_self;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		/*- 메뉴구성
			1. 학생등록
			2. 학생확인(학생리스트)
			3. 학생검색(한 학생의 정보가 출력 - 학생정보, 수강정보 같이 출력)
			4. 수강신청
			5. 수강철회
			6. 종료
		*/
		StudentManager sm = new StudentManager();
		Scanner scan = new Scanner(System.in);	
		int menu = 0;
		
		do {
			//메뉴넣기
			System.out.println();
			System.out.println("-----메뉴-----");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생확인");
			System.out.println("3. 학생검색");
			System.out.println("4. 수강신청");
			System.out.println("5. 수강철회");
			System.out.println("6. 종료");
			System.out.println("-------------");
			System.out.println("메뉴선택 > ");
			
			//메뉴 값 입력받기
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : {sm.insertStudent(scan);} break;
			case 2 : {sm.printStudent();} break;
			case 3 : {sm.searchStudent(scan);} break;
			case 4 : {sm.registerSubject(scan);;} break;
			case 5 : {sm.deleteSubject(scan);} break;
			case 6 : break;
			default : System.out.println("잘못된 메뉴입니다.");
			}

		}while(menu!=6);
		System.out.println("프로그램종료");
		
		sm.printStudent();
		
		scan.close();
		
	}
}
