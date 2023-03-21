package day12;

public class 과제 {

	public static void main(String[] args) {
		/* TV의 채널은 0~10까지 있음
		 * vol 0 ~ 20 까지 있음. 0이되면 '음소거'라고 출력
		 * vol은 0 이하로 내려가지 않음. 20이상 올라가지 않음.
		 * 
		 * 
		 * */
		TV t = new TV();
		t.powerOn();
		t.volUp();
		t.channelUp();
		t.channelUp();
		t.ch =9;
		t.channelUp();
		t.channelUp();
		t.ch =0;
		t.channelDown();
		t.vol = 0;
		t.volDown();
		t.volDown();
		t.vol = 0;
		t.volUp();
		t.volUp();
		t.vol=19;
		t.volUp();
		t.volUp();
		t.powerOff();
		t.volUp();
		t.channelUp();
		t.channelDown();
		t.powerOn();
		t.volUp();
	}

}

interface Remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
	
}

class TV implements Remocon {
	boolean power;
	int ch;
	int vol;
	
	
	@Override
	public void powerOn() {
		System.out.println("TV가 켜졌습니다.");
		power = true;
	}

	@Override
	public void powerOff() {
		System.out.println("TV가 꺼졌습니다.");
		power = false;		
	}

	@Override
	public void channelUp() {
		if(power) {
			if(ch == 10) {
				ch =0;
				System.out.println("채널 "+ ch);
			}else {
				ch++;
				System.out.println("채널 "+ ch);
			}			
		} else System.out.println("전원이 꺼져있습니다.");
		
		
	}

	@Override
	public void channelDown() {
		if(power) {
			if(ch == 0) {
				ch =10;
				System.out.println("채널 "+ch);
			}else {
				ch--;
				System.out.println("채널 "+ch);
			}
		} else System.out.println("전원이 꺼져있습니다.");		
	}
	
//	 * vol 0 ~ 20 까지 있음. 0이되면 '음소거'라고 출력
//	 * vol은 0 이하로 내려가지 않음. 20이상 올라가지 않음.
	
	@Override
	public void volUp() {
		if(power) {
			if(vol == 20) {
				System.out.println("볼륨 "+vol);
			}else {
				vol++;
				System.out.println("볼륨 "+vol);
			}
		} else System.out.println("전원이 꺼져있습니다.");		
	}

	@Override
	public void volDown() {
		if(power) {
			if(vol == 0) {
				System.out.println("음소거");
			}else if(vol ==20){
				vol--;			
				System.out.println("볼륨 "+vol);
			}else {
				vol ++;
				System.out.println("볼륨 "+vol);
			}
		} else System.out.println("전원이 꺼져있습니다.");		
	}
}
