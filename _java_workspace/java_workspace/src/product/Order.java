package product;

public class Order extends Product{
	//상속받았으니 Product의 멤버변수(menu, price)도 있다고 생각하면 됨
	
	private int count;
	private int total; 
		
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void print() { //주문 하나 출력
		System.out.println(super.getMenu()+":"+super.getPrice());
		//
		System.out.println(count+"개 주문 => 금액:"+total);
	}
	
	
	
}
