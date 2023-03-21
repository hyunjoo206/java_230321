package day11;

public class Customer {
	/* 일반고객  / Gold고객 / VIP고객
	 * 
	 * 고객ID : customerID (int)
	 * 고객이름 : customerName
	 * 고객등급 : customerGrade
	 * 보너스포인트 : bonusPoint
	 * 보너스포인트 적립비율 : bonusRatio
	 * 
	 * - Customer 객체생성시
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - Gold 등급 
	 * - 제품을 살때 10%를 할인 / 보너스 포인트 2% 적립
	 * 
	 * - VIP 등급
	 * - 제품을 살때 10%를 할인 / 보너스 5% 적립
	 * - 전담 상담사를 갖는다.
	 * 
	 * - 메서드
	 * 
	 * - 보너스를 적립하는 계산 메서드 (메서드명 : calcPrice)
	 * 	=>보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
	 * - 구매금액 주고, 적립보너스를 계산 (bonusPoint에 누적) 
	 * 
	 * - 출력 메서드 (메서드명 : customerInfo())
	 * - 홍길동 님의 등급은 VIP이며, 보너스 포인트는 1000원입니다.
	 * 
	 * */
	
	//멤버변수 선언
	protected int customerID; //고객ID
	protected String customerName; //고객명
	protected String customerGrade; //고객등급
	int bonusPoint; //포인트
	double bonusRatio; //적립률
	
	
	//기본생성자 - 비어있는 걸 상속받기 위해 (상속하지 않아도 늘 써놓기~!)
	public Customer() {}
	
	//채워진 생성자 -2가지만 바뀌니까
	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		initCustomer(); //그냥 넣어도 되는데 나한테만 초기화되게 => 그냥 써도 됨
	}
	
	private void initCustomer() {
		customerGrade = "Silver";
		bonusRatio=0.01;		
	}
	
	
	//calcPrice 메서드
	public int calcPrice(int price) {
		//가격을 매개변수로 받아 포인트를 적립
		bonusPoint += (int)(price*bonusRatio);
		return price;			
	}
	
	//출력 메서드
//	public void customerInfo() {
//		System.out.printf("%s님의 등급은 %s이며, 보너스 포인트는 %d원입니다.%n", 
//				customerName, customerGrade, bonusPoint);
//	}
	
	public String customerInfo() {
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"+
	bonusPoint+"입니다.";
	}

	
	// getter setter
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
	
}








