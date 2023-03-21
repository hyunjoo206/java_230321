package day10;

import java.util.Scanner;

public class EzenComputer {

	/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
	 * - 학원정보 : 학원이름 = "EZEN"(final) , 지점
	 * - 수강정보 : 수강과목, 기간
	 * - 한명의 학생은 여러과목을 수강할 수 있음
	 * - 과목, 기간 = 배열로 처리 / 길이=5
	 * 
	 * 홍길동, 990101, 20, 010-1111-1111
	 * EZEN, 인천
	 * 자바(6개월), DB(1개월), html(2개월)
	 * 
	 * 기능
	 * -학생의 기본정보 출력
	 * -학생의 학원정보 출력
	 * -학생의 수강정보 출력
	 * -학생의 수강정보를 추가하는 기능
	 * 
	 * */
	
	// 멤버변수
	private String name;
	private String birth;
	private int age;
	private String phone;
	
	private static final String academy = "EZEN";
	private String local;
	
	private String[] course = new String [5];
	private String[] period = new String [5];
	private int cnt; //수강과목, 수강기간의 index를 처리
	
	//기본생성자
	public EzenComputer() {}
	
	
	public EzenComputer(String name, String birth, int age, 
			String phone, String local) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.local=local;
	}
	
	public EzenComputer(String name, String phone, String local) {
		this.name = name;
		this.phone = phone;
		this.local = local;
	}
	
	
	
	//Method
	//학생 기본정보 출력
	public void printInfo() {
		System.out.println("---기본정보---");
		System.out.println(name +","+ birth+ "," + age+ "," + phone);
	}
	
	//학생 학원정보 출력
	public void printConpany() {
		System.out.println("---학원정보---");
		System.out.println(academy + ","+ local);
	}
	
	//수강정보 출력
	public void printCourse() {	//배열 => for 반복하여 출력
		if(course.length == 0 || cnt == 0) {
			System.out.println("수강이력이 없습니다.");
			return; // return은 값을 돌려주기도 하지만, 메서드의 종료를 의미하기도 함
		}
		
		for (int i=0; i<cnt; i++) { //추가되지 않은 값은 출력X
			System.out.print("과정:"+ course[i]+"("+period[i]+") ");
		}
	}
	
	//수강정보 등록
	public void insertCourse(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] =period;
		cnt++; // index 증가.
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String[] getCourse() {
		return course;
	}


	public void setCourse(String[] course) {
		this.course = course;
	}


	public String[] getPeriod() {
		return period;
	}


	public void setPeriod(String[] period) {
		this.period = period;
	}


	public int getCnt() {
		return cnt;
	}


	public static String getAcademy() {
		return academy;
	}



	//getter&setter -  수강정보 추가할 수 있는 setter
	
	
	
	
}
