package day09;

public class Card {
	/*Card class
	 * 숫자 1~10,J,Q,K
	 * 모양 하트 다이아 클로버 스페이드
	 * 한 장의 카드정보를 출력하는 기능
	 * 
	 * 생성자 : 클래스의 멤버변수들을 초기화 하는 기능 메서드
	 * 생성자가 하나도 없으면 기본생성자를 자동으로 생성
	 * 생성자가 하나라도 있으면 기본생성자는 생성x
	 * 생성자의 이름은 클래스명과 동일, 리턴 자리는 없음, 매개변수는 가질 수 있음
	 * 
	 * 멤버변수는 private 선언, 메서드는 public 선언
	 * 멤버변수에 접근하기 위해 getter/setter 메서드 사용
	 * */
	
	//멤버변수 선언
	private char shape;
	private int num;
	
	//기본 생성자 생성
	public Card() {
		num = 1;
		shape = '♥';
	}

	//print 메서드  ♥ ♣ ♠ ◆
	//shape, num 출력하는 메서드
	public void print() {
		
		switch(num) {
		case 11 : 
			System.out.print("J");
			break;
		case 12 : 
			System.out.print("Q");
			break;
		case 13 : 
			System.out.print("K");
			break;
		default:
			System.out.print(num);
		}
		
		System.out.print(shape+" ");
	}

	public char getShape() { //get은 필수 => 값이 뭔지 확인하기 위해
		return shape;
	}

	public void setShape(char shape) { //변경하지 말아야 할 건 set을 만들지 않음 
		switch(shape) {
		case'♥' : case'♣': case'♠' : case'◆':
			this.shape = shape;
			break;
		default : this.shape = '♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(!(1<=num && num<=13)) { //1~13사이 값이 아니면 1출
			this.num = 1;		
		}else
			this.num =num;
	}

	
}// 클래스 끝


