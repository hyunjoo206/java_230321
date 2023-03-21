package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements ProductInterface {
	
	//메뉴등록리스트 - Product class (메뉴, 가격)
	private ArrayList<Product>menu = new ArrayList<>();
	//주문리스트 = Order class (메뉴, 가격 , 개수, 총금액)
	private ArrayList<Order>order = new ArrayList<>();
	
	public void addMenu() {
		menu.add(new Product("햄버거", 6000));
		menu.add(new Product("피자", 15000));
		menu.add(new Product("음료", 2000));
		menu.add(new Product("과자", 1500));
		menu.add(new Product("사탕", 500));
	}
	
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력하세요");
		String menu = scan.next();
		System.out.println("메뉴의 가격을 입력하세요");
		int price = scan.nextInt();
		this.menu.add(new Product(menu, price));
	}
	
	public void printProduct() {
		System.out.println("---menu---");
		for(Product tmp : menu) {
			System.out.println(tmp); //Product 클래스의 toString 호출
			//만약에 print 메서드를 만들어놓은 경우 sysout 하면 안되고 >> p.메서드명() <<으로 호출하면 됨
		}
		System.out.println("---------");
		
	}
	
	public void orderPick(String name, int count) { //메뉴명, 개수
		// 매개변수로 입력받을 경우 scan으로 입력받으면 됨
		
		for(int i=0; i<menu.size(); i++) { //list니까 size
			if(menu.get(i).getMenu().equals(name)) { //list니까 get으로 
				//order 객체생성
				Order o = new Order();
				
				// 매개변수 price에 넣어주려고 가져옴
				int price = menu.get(i).getPrice();
				o.setPrice(price);
				
				o.setMenu(name);
				o.setCount(count);
				
				o.setTotal(price*count);
				
				order.add(o); //만든 o객체를 order(주문리스트)에 넣는다
			}
		}
	}
	

	public void delete(Scanner scan) {
		System.out.println("삭제할 메뉴를 입력하세요");
		String dmenu = scan.next();
		int index = -1;
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(dmenu)) {
				index = i;
				menu.remove(i); 
				//menu.remove(menu.get(i)); -> Object로 삭제
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		if(index ==-1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}
	
	
	public void update(Scanner scan) {
		System.out.println("가격을 수정할 메뉴를 입력해주세요");
		String umenu = scan.next();
		int index = -1;
		
		for(int i=0; i<menu.size();i++) {
			if(menu.get(i).getMenu().equals(umenu)) {
				System.out.println("가격을 새로 입력하세요");
				int uprice = scan.nextInt();
				menu.get(i).setPrice(uprice); 
				//menu리스트에 있는 i번쨰 Product 객체를 get으로 가져와서 set을 이용해서 바꾸기
				
//				Product p = new Product(umenu, uprice);
//				menu.set(i, p); //메뉴명, 가격을 둘 다 수정가능
				
				System.out.println("수정이 완료되었습니다.");
				return;
			}	
		}
		
		if(index == -1) {
			System.out.println("수정할 메뉴를 찾을 수 없습니다.");
		}
	} //메뉴가격수정 
	
	
	public void printOrder() {
		int sum = 0;
		System.out.println("---주문내역---");
		for(int i=0; i<order.size(); i++) {
			order.get(i).print();
			sum+= order.get(i).getTotal();
		}
		System.out.println("-----------");
		System.out.println("지불하실 총 금액 :"+sum);
	}
	
	
}
