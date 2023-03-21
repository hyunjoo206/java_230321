package day09;

public class CardPack {
	/*	CardPack클래스
	 * 	카드팩 : 52장의 카드를 갖고 있음
	 * 
	 *  - 카드를 섞는 기능
	 *  - 한 장을 선택하는 기능
	 *  - 카드 초기화 기능
	 *  - 출력 기능 - card 클래스에서 가져오기
	 *  - 생성자 - 52장의 카드를 모두 생성 (배열을 만들 예정)
	 *  
	 *  */
		
	//멤버변수 (모든 메서드에서 동일하게 사용)
	//카드를 담을 수 있는 배열 52장
	
	private Card[] pack = new Card[52]; // 카드 팩 배열
	private int cnt = 0;//카드가 남아있는 개수
	
	//<카드를 섞는 기능>
	// 메서드명 : shuffle
	// 매개변수, 리턴타입
	// Card tmp
	
	public void shuffle() {
		
		int min=0;
		int max= pack.length-1; //51
		for(int i=0; i<pack.length; i++) {
			int index = (int)(Math.random()*(max-min+1))+min;
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
			}
	}
	
	//<카드를 한 장 빼내는 기능>
	// 메서드명 : pick
	// 리턴타입 : 카드 한 장 (Card 클래스)
	// cnt = 52 가정
	
	public Card pick() {
		if(cnt == 0) {
			return null; //카드 객체기 때문에 0이 아니라 null 리턴
		}
		cnt--;
		return pack[cnt];		
	}
	
	//<초기화>
	public void init() {
		cnt = 52;		
	}
	
	
	
	//<생성자> => 52장의 카드를 생성
	public CardPack() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1 :shape='♥'; break;
			case 2 :shape='♣'; break;
			case 3 :shape='♠'; break;
			case 4 :shape='◆'; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card(); // 카드 한 장 생성
				c.setShape(shape); //현재 shape ♥
				c.setNum(j); //1부터 13까지
				pack[cnt] = c; //shape = ♥1, 
				cnt++ ;
			}
		}
	}
}
	
	
	

