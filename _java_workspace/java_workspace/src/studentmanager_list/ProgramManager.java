package studentmanager_list;

import java.util.ArrayList;
import java.util.Scanner;
import studentmanager.Student;
import studentmanager.Subject;

public class ProgramManager implements Program{
	private ArrayList<Student> std = new ArrayList<>();
	
	@Override
	public void printstudent() {
		System.out.println("---전체 학생정보---");
		for(int i=0; i<std.size(); i++) {
			std.get(i).stdPrint();
			System.out.println("--------------");
		}
	}
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("--학생정보 입력--");
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("학번>");
		String sNum = scan.next();
		System.out.println("주민번호>");
		String rNum = scan.next();
		System.out.println("학부>");
		String faculty = scan.next();
		System.out.println("학과>");
		String major = scan.next();
		System.out.println("-------------");
		
		Student s = new Student(sNum, name, rNum, faculty, major);
		std.add(s);
		
	}
	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stdPrint();
		System.out.println("--수강정보--");
		s.subPrint();
	}
	
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 이름 입력>");
		String searchName = scan.next();
		for(int i=0; i<std.size();i++) {
			if(std.get(i).getStdName().equals(searchName)) {
				printStudentOne(std.get(i));
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");	
	}
	@Override
	public void registerSubject(Scanner scan) {
		int index = -1;
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		for(int i=0; i<std.size();i++) {
			if(std.get(i).getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		
		
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			System.out.println("수강신청 과목번호>");
			String sNum = scan.next();
			System.out.println("수강신청 과목명>");
			String sName = scan.next();
			System.out.println("수강신청 학점>");
			double sPoint = scan.nextDouble();
			
			Subject sb = new Subject(sNum, sName, sPoint);
			std.get(index).insertSubject(sb);
		}
		
		
	}
	@Override
	public void deleteSubject(Scanner scan) {
		int index=-1;
		System.out.println("수강철회 학생명>");
		String name = scan.next();
		for(int i=0; i<std.size();i++) {
			if(name.equals(std.get(i).getStdName())) {
				index=i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			System.out.println("수강철회 과목>");
			String sName = scan.next();
			std.get(index).deleteSubject(sName);
		}
	}
}


