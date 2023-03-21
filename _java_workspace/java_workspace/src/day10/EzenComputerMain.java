package day10;

public class EzenComputerMain {

	public static void main(String[] args) {
		EzenComputer ec = new EzenComputer();
		ec.setName("홍길동");
		ec.setAge(20);
		ec.setBirth("2004-01-01");
		ec.setPhone("010-1234-5678");
		ec.setLocal("인천");
		ec.printInfo();
		ec.printConpany();
		ec.insertCourse("java", "6개월");
		ec.insertCourse("html", "1개월");
		ec.insertCourse("DB", "1개월");
		ec.printCourse();
		System.out.println();
		
		EzenComputer ec1 = new EzenComputer("홍길순", "2002-02-02", 22,
				"010-7890-1234", "서울");
		ec1.printInfo();
		ec1.printConpany();
		ec1.insertCourse("java", "5개월");
		ec1.insertCourse("java 주말", "1개월");
		ec1.printCourse();
		
		/* 배열로 5명의 학생을 등록 후 
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색
		 * 
		 * */
		
		EzenComputer[] std= new EzenComputer[7];
		std[0] = new EzenComputer("홍길동", "010-5555-5678", "인천");
		std[1] = new EzenComputer("홍길순", "010-1111-5678", "서울");
		std[2] = new EzenComputer("강감찬", "010-2222-5678", "인천");
		std[3] = new EzenComputer("유관순", "010-3333-5678", "부천");
		std[4] = new EzenComputer("홍길동", "010-5555-5678", "서울");
		std[5] = ec;
		std[6] = ec1;
		
		std[6].printInfo();
		String searchName = "홍길동"; //홍길동이 상담받은 지점정보 출력/개인정보 출력
		
		int cnt = 0;
		System.out.println("=======" + searchName + "이름검색=========");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName()==searchName) { //std[i].getName().equals(searchName)으로 해도 됨 // 
												//searchName.equals(std[i].getNane()) 순서는 상관없.
				std[i].printInfo();
				std[i].printConpany();
			}
		}
			

		String searchLocal = "인천"; //지점정보/개인정보 출력
		
		System.out.println("=======" + searchLocal + "지점검색=========");
//		for(int i=0; i<std.length; i++) {
//			if(std[i].getLocal()==searchLocal) {
//				std[i].printInfo();
//				std[i].printConpany();
//			}
//		}
		
		//향상된 for문 이용
		for(EzenComputer tmp: std) {
			if(tmp.getLocal().equals(searchLocal)) {
				tmp.printInfo();
				tmp.printConpany();
			}
		}
		
		
		
		
		
	}

}
