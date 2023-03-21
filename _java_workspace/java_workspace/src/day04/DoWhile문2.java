package day04;

import java.util.Scanner;

public class DoWhile문2 {

	public static void main(String[] args) {
//		----------menu--------
//		1. 저장 | 2.출력 | 3.종료
//		----------------------
//		입력 : 1
//		저장되었습니다.
//		----------menu--------
//		1. 저장 | 2.출력 | 3.종료
//		----------------------
//		입력 : 2
//		출력되었습니다.
//		----------menu--------
//		1. 저장 | 2.출력 | 3.종료
//		----------------------
//		입력 : 3
//		종료되었습니다. 반복문종료
//		
		
		Scanner scan = new Scanner(System.in);
		int menu =0;
		
		do {
			System.out.println("------menu-------" + '\n' 
					+  "1.저장|2.출력|3.종료" + '\n' + "-----------------");
			menu=scan.nextInt();			
			switch(menu){
				case 1 :
					System.out.println("입력 : "+ menu + '\n'+ "저장되었습니다");
					break;
				case 2 :
					System.out.println("입력 : "+ menu + '\n'+ "출력되었습니다");
					break;
				case 3 :
					System.out.println("입력 :"+ menu );
					break;
				default:
					System.out.println("1~3사이의 번호를 입력해주세요.");
					break;
				}
		}while(menu!=3);
		System.out.println("종료되었습니다.");
		
		scan.close(); // 자동import됨
			
			
				
	}

}
