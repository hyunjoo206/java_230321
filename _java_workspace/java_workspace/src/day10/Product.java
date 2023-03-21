package day10;

public class Product {
	
	/* Product 클래스 : 상품을 등록하는 클래스
	 * 상품명, 가격
	 * 상품등록 메서드 = insertProduct
	 * 출력 메서드 (toString으로)
	 * */
	
	private String name;
	private int price;
	
	
	public Product() {} //기본생성자
	
	//생성자 만들어봄 (2가지 방법으로 불러와보려고)
	public Product(String name, int price) {
		this.name = name;	
		this.price = price;
	}
	
	//상품등록 메서드
	public void insertProduct(String name, int price) {
		this.name = name;	
		this.price = price;
	}
	
	//상품출력 메서드

	@Override
	public String toString() {
		return "상품list [상품명 : " + name + ", 가격 : " + price + "]";
	}

	// getter&setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	
	
	
}

