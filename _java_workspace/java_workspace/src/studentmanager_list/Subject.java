package studentmanager_list;

public class Subject {
	private String subCode;
	private String subName;
	private double subCredit;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;
	
	public Subject() {}
	
	public Subject(String subName) {
		this.subName = subName;
	}
	
	public Subject(String subCode, String subName, double subCredit) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredit = subCredit;
	}
	
	public Subject(String subCode, String subName, double subCredit, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredit = subCredit;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getSubCredit() {
		return subCredit;
	}
	public void setSubCredit(double subCredit) {
		this.subCredit = subCredit;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubSemester() {
		return subSemester;
	}
	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredit=" + subCredit + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}
}
