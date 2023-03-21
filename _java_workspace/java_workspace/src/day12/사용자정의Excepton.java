package day12;

public class 사용자정의Excepton {

	public static void main(String[] args) {
	/* PasswordException
	 * 
	 * - 비밀번호는 null일 수 없다.
	 * - 비밀번호의 길이는 5자 이상.
	 * - 문자로만 이루어지면 안됨(문자 + 숫자나 특수문자 포함)
	 * 
	 * */
	PasswordTest pt = new PasswordTest();
	String password = "aksdfj%";
	//String password = "abcdef"; //특수문자 x
	//String password = "abcd"; //길이 x
	//String password = "null"; //null x
	
	try {
		pt.setPassword(password);
		System.out.println(pt.getPassword());
	}catch(PasswordException e) {
		System.out.println(e.getMessage());
	}
		
	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다..");			
		}else if(password.matches("[a-zA-Z]")){// 대소문자 상관없이 문자로만 이루어져있다.
			throw new PasswordException("비밀번호는 숫자나 특수문자 3자리를 포함해야 합니다.");					
		} 
		this.password = password;
	}
	
}
