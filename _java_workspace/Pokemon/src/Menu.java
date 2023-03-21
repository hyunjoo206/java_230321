import java.util.Scanner;

public class Menu {

	private Scanner scanner;
	
	Pokedex pokedex = new Pokedex();
	Game game = null;
	
	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}
	
	//메인화면 UI
	public void mainUI() {
		this.clear_scroll();
		System.out.println("=========포켓몬 도감=========");
		System.out.println("1. 포켓몬 키우기 2. 포켓몬 도감 0. 종료");
		System.out.println("입력 : ");
	
		char choice = scanner.next().charAt(0);
		switch(choice) {
		case'1':
			this.gameStartUI();
			break;
		case'2':
			this.pokedexUI();
			break;
		case '0':
			System.out.println("게임을 종료하시겠습니까? (Y/N) : ");
			choice = scanner.next().charAt(0);
			
		}
	}

}
