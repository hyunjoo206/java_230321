package day08;

public class 클래스03 {

	public static void main(String[] args) {

		Card c = new Card();
		c.print();
		c.setShape('♣');
		c.setNum(5);
		c.print();
		//카드에 있지 않은 모양, 숫자가 들어오면무조건 => 1♥
		c.setShape('@');
		c.setNum(15);
		c.print();
	}

} 


/* Card 클래스 생성 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : ♥ ♣ ♠ ◆
 * 숫자 : 1~10 J Q K 
 *
 * 클래스의 구성
 * - 멤버변수 : char shape, int num(j,q,k는 11,12,13)
 * - 메서드  	: print (1♥)
 * - getter/setter :
 * - 생성자  	: 카드 초기값은 하트1
 * 
 * 생성자 선언방법
 * public 클래스명(){//매개변수는(필요하면 생성) 없을 수도 있음
 * 초기값;
 * }
 * 
 * */

class Card{
	//멤버변수 선언
	private char shape; 
	private int num;
	
	//생성자 : 객체의 초기값을 결정
	public Card() {
		num=1;
		shape='♥';
	}
	

	//print 메서드
	//shape, num 출력하는 메서드
	
	public void print() {

		switch(num) {
		case 11 : 
			System.out.println("J");
			break;
		case 12 : 
			System.out.println("Q");
			break;
		case 13 : 
			System.out.println("K");
			break;
		default : 
			System.out.print(num);
		}
		
		System.out.println(shape); //11♥ => J♥
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
//		if(!(shape == '♥' ||shape == '♣'|| shape =='♠' ||shape =='◆')) {
//			this.shape='♥'; //sysout 하는 거 아님..!!! 위에서 print하기 때문에 **주의주의**
//		}else
//		this.shape = shape;
		switch(shape) {
		case '♥': case'♣':case '♠':case '◆':
			this.shape = shape;
			break;
		default : this.shape = '♥';
		}	
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(!(1<=num && num<=11)) {
			this.num=1;	
		}else
		this.num = num;
	}
	

}