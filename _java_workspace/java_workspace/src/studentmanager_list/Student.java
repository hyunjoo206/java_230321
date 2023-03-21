package studentmanager_list;

import java.util.ArrayList;

public class Student {
	private String stdNum;
	private String stdName;
	private String registerNum;
	private String faculty;
	private String major;
	
	private ArrayList<Subject> subjectList = new ArrayList<>();
	private int subCount;
	
	public Student() {}
	
	public Student(String stdNum, String stdName, String registerNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;
	}
	
	//학생정보출력
	public void stdPrint() {
		System.out.println("학생명(학번):"+stdNum+"("+stdName+")");
		System.out.println("학부(학과)"+ faculty+"("+major+")");
	}
	
	//수강정보출력
	public void subPrint() {
		if(subCount==0) {
			System.out.println("수강중인 과목이 없습니다");
		}
		for(int i=0; i<subCount; i++) {
			System.out.println(subjectList);
		}
	}
	
	//수강과목추가
	public void insertSubject(Subject subName) {
		subjectList.add(subName);
	}
	
	//수강과목삭제
	public void deleteSubject(String subName) {
		int index = -1;
		if(subName == null) {
			return;
		}
		
		for(int i=0; i<subCount; i++) {
			if(subjectList.get(i).getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		
		for(int i=0; i<subCount; i++) {
			subjectList.remove(index);
			System.out.println("삭제되었습니다.");
		}
		
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getRegisterNum() {
		return registerNum;
	}
	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public int getSubCount() {
		return subCount;
	}
	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}
}