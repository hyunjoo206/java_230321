package day12;

public class 복습 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car=fe;
//		car.water;
		fe2= (FireEngine)car;
		fe2.water();
		

	}

}

class Car{
	String color;
	int door;
	
	//운전하는 기능
	void dirve() {
		System.out.println("drive, Brrr~~~");
	}
	
	//멈추는 기능
	void stop() {
		System.out.println("stop!!");
	}
	
}

class FireEngine extends Car{ //Car를 상속받는 소방차
	void water() { //물뿌리는 기능
		System.out.println("water!!!");
	}
}