package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음
		 * final : 수정할 수 없다.
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩 불가
		 * final 클래스 : 상속할 수 없다. 부모 클래스가 될 수 없다.
		 * */
		
		
		//기본생성자 출력
		EzenStudent es = new EzenStudent();
		es.print();
		
		//setter을 이용한 객체생성
		es.setLocal("인천");
		es.setName("이현주");
		es.setEzenClass("자바웹개발");
		es.setPhoneNum("010-1234-5678");
		System.out.println(es);
		
		//생성자를 이용한 객체생성
		EzenStudent es2 = new EzenStudent("인천", "홍길동", "전산회계", "010-1111-5678");
		es2.print();
		
	}

}

/* 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭,생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭 : { } 멤버변수 초기화
 * 3. 생성자 ㅣ 객체를 생성할 때 초기화해서 생성
 * 초기값 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자
 * */

//멤버변수 : 지점, 이름, 반, 전화번호
//메서드 : 출력(print 메서드, toString가능) getter/setter

class EzenStudent{
	
	//멤버변수
	private String local="인천";
	private String name;
	private String ezenClass;
	private String phoneNum; // int로 받으면 010=> 8진수로 받음 / 연산에 사용될 값만 int로 받음

	{
		//초기화 블럭 : 멤버변수들을 초기화;
		local = "서울";
		ezenClass = "미정";
	}
	
	//기본생성자
	public EzenStudent() {}
	
	// 생성자
	public EzenStudent(String local, String name, String ezenClass, String phoneNum) {
//		super();
		this.local = local;
		this.name = name;
		this.ezenClass = ezenClass;
		this.phoneNum = phoneNum;
	}
	
	
	// print 메서드
	public void print(){
		System.out.println("-----Ezen student----");
		System.out.println("지점: " + local);
		System.out.println("이름: " + name);
		System.out.println("반: " + ezenClass);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("---------------------");
	}



	//toString
	@Override
	public String toString() {
		return "EzenStudent [local=" + local + ", name=" + name + ", ezenClass=" + ezenClass + ", phoneNum=" + phoneNum
				+ "]";
	}

	// getter&setter
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEzenClass() {
		return ezenClass;
	}

	public void setEzenClass(String ezenClass) {
		this.ezenClass = ezenClass;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
}