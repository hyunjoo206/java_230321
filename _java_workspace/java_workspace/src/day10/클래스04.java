package day10;

public class 클래스04 {

	public static void main(String[] args) {
		//생성자를 이용하여 객체 생성
		Car c = new Car(); //기본생성자
		c.setColor("yellow");
		c.setDoor(2);
		c.setAirback(true);
		c.print();
		System.out.println(c);//c.toString 하지 않아도 알아서 찾음
				
		Car c2 = new Car("black", 4, false);
		c2.print();
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.setAirback(true);
		System.out.println(c2.toString());
		
		
	}//메인끝

}//클래스 끝

class Car{
	
	//멤버변수 : color, door, airback, power, speed
	
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed;
	
	//생성자 : 빈 생성자, color, (color, door), (color, door, airback), 전체 생성자
	
	public Car() {} // 기본생성자 (빈 생성자)
	
	public Car(String color) {
		// this 멤버변수를 의미
		// 멤버변수와 매개변수의 이름이 같을 경우 멤버변수라는 것을 표시하기 위해 사용
		this.color=color;
	}
	
	public Car(String color, int door) {
		this.color=color;
		this.door= door;
	}
	
	public Car(String color, int door, boolean airback) {
		//위에서 만든 생성자 호출	
		this(color,door); 
		this.airback=airback;
	}
	
	//생성자 자동생성 - 오마클-source-Generate constructor and using field
	
	public Car(String color, int door, boolean airback, boolean power, int speed) {
//		super(); //부모의 생성자 호출
		this.color=color;
		this.door=door;
		this.airback=airback;
		this.power=power;
		this.speed=speed;
	}
	
	
	//method : print


	public void print() {
		//멤버변수는 내 클래스에서 모든 메서드에서 공유되는 변수
		//멤버변수를 매개변수로 받을 필요가 없다
		System.out.println("------MyCar-----");
		System.out.println("color: " + color);
		System.out.println("door : " + door);
		System.out.println("airback유무: " + airback);
		System.out.println("-----------------");
	}
	
	//toString : 멤버변수들을 출력해주는 메서드
	// 스트링 형태로 전부 출력해주는 기능
	
	@Override
	public String toString() {
		return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}
	
	
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	

	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	
	public void speedUp() {
		if(power) {
			speed += 10;
			System.out.println(color+" Car "+ "speed: "+speed);
		}else {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요");
		}
	}
	
	public void speedDown() {
		if(speed<=0) {
			speed=0;
		}else {
			speed-=10;
		}
		System.out.println("speed: "+ speed);
	}
	

	//getter/setter
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean getAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		if(airback=true) {
			this.airback = airback;
			System.out.println("에어백이 장착되었습니다.");
		}else {
			System.out.println("에어백이 장착되지 않았습니다.");
		}
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
