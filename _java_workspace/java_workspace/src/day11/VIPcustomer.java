package day11;

public class VIPcustomer extends Customer {
	
	private int agentID;	
	
	//할인율 saleRatio
	double saleRatio;
	
	//기본생성자
	public VIPcustomer(){}
	
	//채워진 생성자
	public VIPcustomer(int id, String name, int agentid) {
		super(id,name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentid; //전문상담사 
	}
	
	@Override //수정할 것만 override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price-(int)(price*saleRatio);
	}

	@Override
	public String customerInfo() {
		return super.customerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";		
	}

	public int getAgentID() {
		return agentID;
	}


	
}
