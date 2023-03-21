package day18;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=200; i++){
			System.out.println(i+"번째"+Thread.currentThread().getName());
		}
	}
	
}

public class ThreadEx02 {
	
	public static void main(String[] args) {
		//Runnable을 구현하는 방법
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		th1.start();
		
		try {
			th1.join();//join 명령어 : th1의 실행이 끝날 때까지 기다림
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main End!");
	}

}
