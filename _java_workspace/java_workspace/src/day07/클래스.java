package day07;

public class 클래스 {
		//멤버변수 자리 (클래스 안 메서드 밖)
	public static void main(String[] args) {
		/* 클래스 - 설계도
		 * 객체를 생성하기 위한 설계도
		 * 메서드 - 기능
		 * 
		 * 
		 * 클래스의 구성정보 
		 * - 속성 : 멤버변수 (공통적으로 사용할 ex)0207 과제 스캐너 올려서 받은 위치)
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스 
		 * - 속성(정보): 크기, 색상, 제조사, 이름, 구동방식 등
		 * - 기능 : 인쇄, 스캔, 팩스, 복사 등
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖에 작성(line4) 작성
		 * 멤버변수는 클래스 안에서 사용할 수 있다. (모든 메서드를 포함)
		 * 
		 * 접근제한자 class 클래스명 {
		 * 	//클래스명은 반드시 대문자로 시작 (규칙)
		 * }
		 * 
		 * - 객체 선언 
		 * 클래스명 객체명;
		 * 
		 * - 객체 선언 & 초기화(생성)
		 * 클래스명 객체명 = new 클래스();
		 * 
		 * -멤버 메서드 사용하는 법
		 * 객체명.메서드명();
		 * 
		 * 같은 클래스 안에서 메서드를 호출할 때는 메서드명으로 호출가능 => 메서드명();
		 * 다른 클래스에서는 메서드를 호출할 때 객체를 이용하여 => 객체명.메서드명();
		 * 
		 * */ 
		
		/* 접근제한자(제어자)
		 * - public : 모두 사용가능
		 * - protected : 나 + 패키지 + 자식
		 * - (default) : 나 + 패키지 
		 * - private : 나
		 * 
		 * 클래스에서 public을 붙일 수 있는 건 파일명과 클래스명이 같을 때만 가능.
		 * 멤버변수나 메서드는 public을 붙이는 것에 제한이 없음.
		 * 
		 * private : 멤버변수나 메서드를 다른 클래스에서 사용할 수 없게 함.
		 * - 일반적으로 멤버변수는 private으로 하고, 메서드는 public으로 선언 (개인정보 보호하고 싶을때)
		 * - 일반적으로 private으로 선언된 멤버변수는 getter/setter를 통해 변수에 접근할 수 있음.
		 *  
		 * */
		
		Point p = new Point();
		p.print(); // (0,0)
		p.move(5, 3);
		p.print(); // (5,3)
		
//		p.x =7;
		p.print(); //(7,3)
		
//		p.y =10;
		p.print(); //(10,3)
		
		System.out.println(p.getX());
		System.out.println(p.getY());
//		System.out.println(p.x);
//		System.out.println(p.y);
		
		p.setX(100);
		System.out.println(p.getX());
		
		p.setY(50);
		System.out.println(p.getY());
		
		p.print();
	
		System.out.println("--------------------");
		//////////////////x,y,z 찍어보기 //////////////////////
		
		Point1 q = new Point1();
		q.print(); // (0,0,0)
		
		q.move(1,2,3);
		System.out.println(q.getX()); // x의 값을 가져오고 싶음

		
		// x의 값을 2으로 바꾸고 싶음
		q.setX(2);
		System.out.println(q.getX());
		
		// y의 값을 6으로 바꾸고 싶음
		q.setY(6);
		System.out.println(q.getY());
		
		// z의 값을 12로 바꾸고 싶음
		q.setZ(12);
		System.out.println(q.getZ());
		
		q.print();
		
		
	}//메인 끝
	

} //클래스 끝

/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명 {
 * 클래스명은 대문자로 시작
 * }
 */

class Point {
	// 멤버변수는 초기화하지 않아도 기본0 또는 null로 초기화 됨.
	private int x;
	private int y;
	
	// x,y 좌표를 프린트하는 메서드
	public void print() {
		// (0,0)
		System.out.println("("+x+","+y+")");
	}	
	
	// x,y 좌표를 변경하는 메서드
	// 매개변수 : x,y의 값을 주고 멤버변수의 x,y를 변경

	public void move(int x1, int y1) {
		x = x1;
		y = y1; 
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x; //멤버변수 파랑
	}
	
	public void setY(int y) {
		this.y = y;
	}
}

class Point1{
	// x,y,z를 멤버변수로 선언(pirvate)
	
	private int x;
	private int y;
	private int z;
	
	// 멤버변수로 (x,y,z)를 찍는 print 메서드 생성
	
	public void print(){
		System.out.printf("(%d,%d,%d)%n", x,y,z);
	}
	
	// x,y,z의 값을 변경하는 move 메서드 생성
	
	public void move(int x1, int y1, int z1){
		x = x1;
		y = y1;
		z = z1;
	}
	
	// 각각의 값을 getter/setter 생성
	
	//getter&Setter 만들기 : 오마클 - source - generate Getter Setter 누르면 자동으로 만들어줌
	
	//getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	// setter
	public void setX(int x) {
		this.x = x; //멤버변수 파랑
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
}


