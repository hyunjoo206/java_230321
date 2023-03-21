package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer [] customerList = new Customer[10];
		//업캐스팅 => 묵시적 형변환이 가능
		Customer cHong = new Customer(10001,"홍길동");
		Customer gHong = new GoldCustomer(10002, "홍길순");
		Customer vLee = new VIPcustomer(10003, "이현주", 1111);
		
		//다운캐스팅 => 반드시 명시적으로 형변환 해야함
		//instanceof : 원래 인스턴스형이 맞는지 확인하는 명령어 t/f
		
		System.out.println(vLee instanceof GoldCustomer);
		
		if(vLee instanceof VIPcustomer) {
			VIPcustomer vCustomer = (VIPcustomer)vLee;
			vCustomer.getAgentID();
		}else if(vLee instanceof GoldCustomer) {
			GoldCustomer vCustomer = (GoldCustomer)vLee;
			vCustomer.getSaleRatio(); //GoldCustomer class에서 saleRatio getter 추가
		}else {
			System.out.println("error");
		}
		
		
		
		int cnt = 0;
		customerList[cnt]=cHong;
		cnt++;
		customerList[cnt]=gHong;
		cnt++;
		customerList[cnt]=vLee;
		cnt++;
		
		System.out.println("-----고객정보출력-----");
		//for문을 활용해서 고객정보 출력
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].customerInfo());
		}
		
		System.out.println("-----할인율과 포인트 계산-----");
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			System.out.print(customerList[i].getCustomerName()+ "님의 지불금액:"+ customerList[i].calcPrice(price)+"원, ");
			System.out.println("적립포인트:"+ customerList[i].bonusPoint+"원");
		}
		
//		Customer cHong = new Customer(10001,"홍길동");
//		cHong.calcPrice(1000000);
//		System.out.println(cHong.customerInfo());
//		cHong.calcPrice(10000);
//		System.out.println(cHong.customerInfo());
//		System.out.println(cHong.customerInfo())//cHong.getAgentID하면 안 나옴 직접접근 불가
//		System.out.println(vCustomer.getAgentID()); //이렇게는 사용 가능
//		
//		Customer gHong = new GoldCustomer(10002, "홍길순");
//		System.out.println(gHong.customerInfo());
//		
//		Customer vLee = new VIPcustomer(10003, "이현주", 1111);
//		System.out.println(vLee.customerInfo());
//				
//		System.out.println("====할인율과 포인트 계산====");
//		int price = 100000;
//		int cost = cHong.calcPrice(price);
//		System.out.println(cHong.getCustomerName()+"님이 지불하실 금액은 "+cost+"원입니다.");
//		System.out.println(cHong.getCustomerName()+"님의 현재 포인트는 "+ cHong.bonusPoint+"원입니다.");
//		
//		System.out.println("====할인율과 포인트 계산====");
//		int cost1 = gHong.calcPrice(price);
//		System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은 "+cost1+"원입니다.");
//		System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+ gHong.bonusPoint+"원입니다.");
//	
//		System.out.println("====할인율과 포인트 계산====");
//		int cost2 = vLee.calcPrice(price);
//		System.out.println(vLee.getCustomerName()+"님이 지불하실 금액은 "+cost2+"원입니다.");
//		System.out.println(vLee.getCustomerName()+"님의 현재 포인트는 "+ vLee.bonusPoint+"원입니다.");
	
		
		
		
		
		
		
	}

}