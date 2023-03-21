package product;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		pm.addMenu(); //객체 만들고 미리 메뉴 추가함
		
		do {
			System.out.println();
			System.out.println(">> 버튼 선택");
			System.out.println("1.제품추가");
			System.out.println("2.제품리스트보기");
			System.out.println("3.제품주문");
			System.out.println("4.주문내역");
			System.out.println("5.제품가격수정");
			System.out.println("6.메뉴삭제");			
			System.out.println("7.프로그램 종료");
			System.out.println(">> 선택:");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pm.add(scan);
				break;
			case 2: 
				pm.printProduct();  
				break;
			case 3:
				System.out.println("주문할 제품명:");
				String pick = scan.next();
				System.out.println("수량:");
				int count = scan.nextInt();
				pm.orderPick(pick, count);  
				break;
			case 4: 
				pm.printOrder();
				break;
			case 5: 
				pm.update(scan);
				break;
			case 6:
				pm.delete(scan);
				break;
			case 7: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=7);
		System.out.println("프로그램 종료!");
		scan.close();
	}

}