package product;

public class Product {
	//멤버변수 - 메뉴, 가격 구성
	private String menu;
	private int price;
	
	//기본생성자
	public Product() {}
	
	//매개변수로 menu(메뉴)와 price(가격)를 받는 생성자
	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	//getter, setter, toString(출력)
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return menu + "	:" + price;
	}
	
	
}

