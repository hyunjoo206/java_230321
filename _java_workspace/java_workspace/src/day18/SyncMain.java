package day18;

class Bank {
	// 계좌의 돈
	private int money = 10000;
	// 입금
	public synchronized void deposit(int amount) {
		int m = this.money; //현재 내 돈을 m에 담음
		
		try {
			Thread.sleep(3000); //3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //기다리기
		
		setMoney(m + amount);
		
	}
	
	// 출금
	public synchronized void withdraw(int amount) {
		int m = this.money;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m-amount);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
//---------------------------------------------------
class Hong extends Thread{
	public void run() { //입금
		System.out.println("입금시작");
		SyncMain.myBank.deposit(3000);
		System.out.println("3천원 입금 후 :" + SyncMain.myBank.getMoney());
	}
}

class HongWife extends Thread{
	public void run() { //출금
		System.out.println("출금시작");
		SyncMain.myBank.withdraw(1000);
		System.out.println("천원 출금 후 :" + SyncMain.myBank.getMoney());
	}
}

//------------------------------------------------------
public class SyncMain {

	public static Bank myBank = new Bank(); //공유영역 설정
	
	public static void main(String[] args) {
		Hong h = new Hong();
		h.start();
		
		HongWife hw = new HongWife();
		hw.start();
		
		try {
			h.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			hw.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
