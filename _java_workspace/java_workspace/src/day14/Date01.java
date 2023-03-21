package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		/* 날짜시간 클래스
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성할 수 없음
		 * new 연산자를 통해 객체 구현x
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어옴
		 * 
		 * month : (0월~ 11월) +1
		 * week : 1 = 일요일, 2 = 월요일, ... 
		 * am_pm : am=0, pm=1
		 * */
		
//		Date d = new Date();
//		d.getDate();
//		System.out.println(d.ge);
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH)+1;//0월부터 시작
		System.out.println(month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//1일 2월 3화 4수 5목 6금
		
		System.out.println(year+"-"+month+"-"+day);
				
		//hour, minute, second
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		
		int am_pm = now.get(Calendar.AM_PM);
		
		System.out.println(hour+"시"+minute+"분"+second+"초");
		
		// 2023-02-17(금) 
		// 오후 2:42
		System.out.println("-----------------------");
		
		
		String weekString = null;
		switch(week) {
		case 1 : weekString="일"; break;
		case 2 : weekString="월"; break;
		case 3 : weekString="화"; break;
		case 4 : weekString="수"; break;
		case 5 : weekString="목"; break;
		case 6 : weekString="금"; break;
		case 7 : weekString="토"; break;
		default:
			break;
		}
		
		System.out.print(year+"-"+month+"-"+day+"("+weekString+")");
		System.out.println();

//		if(am_pm==1) {
//			System.out.print("오후 ");
//		}else System.out.print("오전 ");
		
		System.out.println((am_pm==0?"오전":"오후")+" "+hour+":"+minute);
	
		
	}
	
	
}
