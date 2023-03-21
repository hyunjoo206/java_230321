package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 { //사용권장

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); //날짜에 대한 타임
		System.out.println(today.getYear()); //연도만 추출가능
		
		String curr = today.toString(); //날짜를 문자로 변경
		System.out.println(curr);
		
		//substring, indexOf 사용해서 문자 추출하기 ****
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		//T다음부터 .전까지 ( <= , <의 개념이라 "T"+1이고, .까지 해야 .미포함)
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 20); //원하는 날짜 생성
		System.out.println(sDate.format(dtf));
		
	}

}
