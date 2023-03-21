package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* ===메뉴판===
		 * 1. 햄버거 : 7000
		 * 2. 피자 : 15000
		 * 3. 음료 : 2000
		 * 4. 과자 : 2000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * => 1번메뉴 햄버거 2개 주문
		 * 
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2
		 * => 3번메뉴 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * == 선택한 메뉴
		 * 햄버거 2개, 음료 2
		 * 개 선택했습니다. 총 지불금액 : ?
		 * 
		 * */
		
		FoodManager fm = new FoodManager();
		ArrayList<Integer> order = new ArrayList<>();
		//인덱스0(2번피자) 인덱스1(1개)    인덱스2(3번음료) 인덱스3(2개)
		fm.add();
		

		Scanner scan = new Scanner(System.in);
	
		int menu = -1;
		//do-while 이용하여 조건식인 menu값이 0이 아니면(T) do 안의 실행문을 실행
		
		do {
			fm.printMenu(); //메뉴출력
			menu = scan.nextInt();//메뉴 입력받기
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if(menu !=0) {
				if(menu<6) {
					System.out.println("수량:");
					int count = scan.nextInt(); //수량 입력받기
					fm.sale(menu, count);
					order.add(menu);
					order.add(count);
					System.out.println("주문종료 => 0번");
				}else {
				System.out.println("잘못된 메뉴입니다.");
				}	
			}
		}while(menu!=0);
	
		System.out.println("=====주문확인=====");
		for(int i=0; i<order.size();i+=2) { //order 리스트에는 2개씩(menu숫자, count숫자) 들어가니까 2씩 증가해야 함
			//0(2번피자) 1(1개) 2(3번음료) 3(2)  
			System.out.print(fm.getMlist().get((order.get(i))-1)+" "); //메뉴이름 가져오는거
			System.out.println(order.get(i+1)+"개"); //order에서 개수 가져오는 거
		}
		System.out.println("계산할 금액은"+ fm.getTotSum()+"입니다.");
		
	}

}

class FoodManager{
	//멤버변수 ArrayList 메뉴, ArrayList 가격, 그 외의 멤버변수는 알아서 선언
	
	//메서드 정의
	//void printMenu(), 추가 메서드 void add(), sale(int menu, int count) 메뉴*개수 해서 가격 리스트에
	
	
	private ArrayList<String> mlist = new ArrayList<String>();
	private ArrayList<Integer> plist = new ArrayList<Integer>();
	
	private int sum;
	private int totSum;
	
	public void printMenu() {
		System.out.println("=======메뉴======");
		System.out.println("1. 햄버거 : 7000");
		System.out.println("2. 피자 : 15000");
		System.out.println("3. 음료 : 2000");
		System.out.println("4. 과자 : 2000");
		System.out.println("5. 사탕 : 500");					
		System.out.println("메뉴 선택 :");					
	}
	
	public void add() {
		mlist.add("햄버거");
		mlist.add("피자");
		mlist.add("음료");
		mlist.add("과자");
		mlist.add("사탕");
		
		plist.add(7000);
		plist.add(15000);
		plist.add(2000);
		plist.add(2000);
		plist.add(500);

	}
	
	public void sale(int menu, int count) {
		//list.get(menu-1) : 메뉴에 대한 가격
		sum = plist.get(menu-1) * count;
		totSum+=sum; //전체합계
		System.out.println("----------------------");
		System.out.println("주문하신 메뉴는"+mlist.get(menu-1)+" ");
		System.out.println(count + "개입니다.");
		System.out.println("금액:"+sum); 
		
	}

	public ArrayList<String> getMlist() {
		return mlist;
	}

	public void setMlist(ArrayList<String> mlist) {
		this.mlist = mlist;
	}

	public ArrayList<Integer> getPlist() {
		return plist;
	}

	public void setPlist(ArrayList<Integer> plist) {
		this.plist = plist;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotSum() {
		return totSum;
	}

	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}


	
}
