package day11;

public class GoldCustomer extends Customer {

	//할인율 saleRatio
	double saleRatio;
	
	//기본생성자
	public GoldCustomer(){}
	
	//채워진생성자
	public GoldCustomer(int id, String name) {
		super(id,name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override //수정할 것만 override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price-(int)(price*saleRatio);
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}		
	
	
	
}
