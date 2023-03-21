package day09;

public class CardPackMain {

	public static void main(String[] args) {
		/* 카드 생성
		 * 
		 * 
		 * 
		 * */

		Card c = new Card(); // 1♥가 기본 생성자
//		c.print(); 기본 생성자(1♥) 하나 출력
		
		CardPack cp = new CardPack();
//		c = cp.pick();//가장 위에 있는 카드 한 장을 pick c 객체에 저장
		
		
		//모양대로 4열횡대
		//한 모양이 끝나면 줄바꿈
//		Card tmp = cp.pick(); //가장 위에 있는 카드 한 장을 pick Card 객체에 저장
//		tmp.print();
//		tmp = cp.pick(); // 가장 위에 있는 카드 한 장을 pick Card 객체에 저장
//		tmp.print();
//		tmp.print(); 
		
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=13; j++) {
//				cp.pick().print();  //cp.pick 해서 바로 프린트 해도 나옴
//			}
//			System.out.println();
//		}
		
		System.out.println("---------------순서대로 4열횡대--------------");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				Card tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}
		
		System.out.println("--------------섞은거 해보기------------------");
//		cp.init(); //다시 52개 생성 -> 주석 빼면 섞여서 나옴 
		cp.shuffle();

		a: for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				Card tmp = cp.pick();
				if(tmp !=null) {
					tmp.print();					
				}else {
					System.out.println("카드가 없어요. 초기화 하세요.");
					break a;
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------섞은담에 젤 위에있는 카드 뽑아------------");
		cp.init(); //다시 52개 생성
		cp.shuffle();
		cp.pick().print(); //-> 제일 위에 있는 카드 뽑아봐
		
	}

}
