
public class Pokemon {

	String number;
	String name;
	String type;
	
	public Pokemon(String number, String name, String type) {
		this.number = number;
		this.name = name;
		this.type =type;
	}
	
	public void print() {
		switch (this.name) {
		case "비버니":
			System.out.println("\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⠤⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣀⠞⠁⠀⠀⠀⠐⠈⢑⡄⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢛⣿⡄⢀⡀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠠⠤⠤⠴⠿⠿⠿⠿⣯⣤⣀⠀⠀⠀⠀⣴⠋⠀⠘⣿⣿⣷⡀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⡠⠐⠀⠒⠄⠀⠀⠀⠀⠀⢀⠤⠒⠛⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠲⢦⣼⡏⠀⠀⢀⣿⣿⣿⣷⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⢠⠊⠀⠀⠀⠀⢈⠀⠀⠀⣠⣖⣧⡁⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠚⠓⠲⣄⠀⠀⠀⠀⠀⠉⢛⣶⣼⣿⣿⣿⣿⡟⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⢰⣀⣀⠀⢀⢤⠼⠒⠂⠉⠉⠉⠁⠈⠉⠓⠲⣤⣀⡀⢠⠟⠁⠀⠀⠀⠀⢘⡆⠀⠀⠀⠀⠀⣿⣯⣿⣿⠿⠟⠋⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠈⠙⣿⠟⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠙⣿⢠⣀⣀⣀⣤⣶⣿⠃⠀⠀⠀⢀⣠⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⡠⠒⠉⠀⠀⠉⠑⠠⡀⠀⠀⠀⠤⠀⠘⠊⠻⣿⢿⣟⣯⣧⣴⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⢀⠏⠀⢀⠤⠤⠴⠁⠀⠀⠀⠀⠀⠀⠀⠈⣦⠴⠿⢥⣄⢀⠀⢶⠈⢷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀\r\n" + 
					"⠀⠀⢀⠀⢤⠆⠀⡰⠁⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡛⠛⠛⢳⢖⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀\r\n" + 
					"⢀⠀⠁⠀⠀⠀⢠⡇⠀⣶⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣾⠀⠀⣧⣴⣀⡾⠉⠋⠉⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄\r\n" + 
					"⢸⠀⠀⠀⠀⠀⠈⡇⠀⠀⣠⣤⣶⣾⣿⣿⣿⣿⣷⣶⣦⣄⡉⠁⠀⢠⣻⣿⣿⣧⡀⠀⠀⠀⠀⡼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇\r\n" + 
					"⠀⠑⣄⣴⣄⠀⠺⣾⣶⣿⣿⣿⣯⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⢶⣌⢹⣿⣿⣿⣿⠶⠿⢟⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
					"⢠⡮⡝⠃⣰⣌⢳⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠘⠛⠛⠁⠈⠀⢈⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿\r\n" + 
					"⢧⠏⠰⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣽⣥⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇\r\n" + 
					"⠈⠻⣾⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀\r\n" + 
					"⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⠉⠉⠁⠀⠈⠙⠛⠛⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠉⠻⣿⣿⣿⣿⣿⠟⠀⠀\r\n" + 
					"⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠰⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⣸⣿⣿⣿⣿⡄⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠉⠉⣿⣿⣿⣿⣧⡀⠀⠀⡀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠋⠉⠛⠋⠉⠋⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⡿⠋⠉⠉⠙⠻⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠛⠻⠿⠛⠿⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⢸⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠋⠁⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"");
			System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
			System.out.println("도감번호:No.399 | 이름:비버니 | 타입:노말 | 능력치[공격력:80, 방어력:73, 체력:153, 포획확률:50%]");
			System.out.println("사용스킬[1.몸통박치기 2.돌진 3.필살앞니 4.깨물어부수기 5.풀묶기]");
			System.out.println("-------------------------------------------------------------");
			break;
		
		case "리피아":
			System.out.println("\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⡞⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢴⡏⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⢏⣠⣤⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⡇⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⢀⣸⣿⣿⣿⣷⠿⠿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⣤⣾⣿⣿⣿⣿⣷⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⢀⣿⣿⣿⣿⣿⡏⠀⠀⠈⢻⣿⣿⣿⣿⡇⢀⣴⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⢸⣿⣿⣿⣿⣿⡇⣄⠀⠀⣺⣿⣿⣿⡿⢡⣾⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⢸⣿⣿⣿⣿⠿⢃⣿⣆⢌⣾⣿⣿⣿⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠈⣟⢿⣿⡀⢀⡟⢹⢡⣿⣿⠟⡻⠋⣿⠁⣽⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠈⠙⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⢽⠈⠻⣧⢸⠀⠸⢻⡟⠁⠐⠁⢰⡆⣸⠟⠋⠉⢻⢿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠡⡀⠈⠀⠀⠀⠈⠃⠀⠀⠀⠀⠁⠃⢀⣠⠖⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠐⠲⢓⢴⢶⡤⠀⠀⠀⡀⡴⣿⣶⡄⣥⠋⠁⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⡟⠉⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠹⢿⣷⠀⠀⠀⢸⣷⣿⣿⡿⠃⠀⠀⠀⣼⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⢄⣀⣤⣀⣠⣤⣾⣿⣷⣦⣤⣴⣾⠿⠁⠀⠀⠀⠀⢀⠀⠀⠀⢰⣾⣿⣿⣿⣿⡿⠿⠿⠿⠋⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣿⣿⣿⣿⣿⠟⠀⠁⠚⠀⠀⠐⠂⠉⠉⠀⠀⠉⠲⣿⡿⠿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⢛⣿⣿⣿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⢠⣄⣠⣤⣤⣶⣾⣧⡀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⢻⡇⠀⠀⠀⢠⠿⠟⠛⠛⠉⠉⠻⣿⣿⣦⣄⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠃⠀⠀⢀⠃⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⠒⢶⣶⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣬⠀⢀⣀⣶⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⡿⠃⠀⢠⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⠿⠟⠀⢾⣿⣿⠀⠀⠀⠀⠀⠀⠀⣀⣾⣿⣿⠁⠀⠀⣸⣿⣿⡟⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣀⣀⣼⣿⡟⠓⠀⠀⠀⠀⠀⠀⢿⣿⡿⠃⠀⠀⢠⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
					"");
			System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
			System.out.println("도감번호:No.470 | 이름:리피아 | 타입:풀 | 능력치[공격력:216, 방어력:219, 체력:163, 포획확률:13%]");
			System.out.println("사용스킬[1.잎날가르기 2.전광석화 3.솔라빔 4.리프블레이드 5.에너지볼]");
			System.out.println("-------------------------------------------------------------");
			break;
			
			
			
		}
	}

}