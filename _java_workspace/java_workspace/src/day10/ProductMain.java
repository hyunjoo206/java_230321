package day10;

import java.util.Scanner;

public class ProductMain {
	
	public static void main(String[] args) {
		
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품등록 후 리스트 출력
		 * * 스캐너를 통해서 상품등록.
		 * 
		 * 상품을 등록하시겠습니까?(y/n)
		 * y => 상품등록 반복 / n => 그만
		 * 상품명, 가격을 등록받아서 상품 배열에 등록.
		 * n => 등록된 제품 리스트 출력
		 * 
		 * */
		
		Product[] p = new Product[10]; //객체 배열 - product만 담을 수 있음
		Scanner scan = new Scanner(System.in);		
		
		char menu = 'y';
		int cnt = 0; // p객체의 index를 핸들링하기 위한 변수
		int sum = 0;
		
		while(menu != 'n') {
			System.out.println("상품을 등록하시겠습니까?(y/n)");
			menu = scan.next().charAt(0); // 하나의 글자만 받을때
			
			if(menu == 'y') {
				System.out.println("상품명 >");
				String name = scan.next();
				
				System.out.println("가격 >");
				int price = scan.nextInt();
				
				//생성자 이용한 객체 생성 후 배열에 객체담기
//				Product tmp = new Product(name,price); 
//				p[cnt] = tmp;
				
				//insertProduct 메서드를 이용하여 객체 생성 후 등록
				p[cnt]= new Product(); //비어있는 객체가 들어감
				p[cnt].insertProduct(name, price);
				
				cnt++; //index 증가	
				
				//입력받은 값을 바로 더하는 방법
				//sum+=price;
				
				
				
			}else {
				if(menu == 'n') {
					System.out.println("상품등록 종료!");
				}else {
					System.out.println("y/n만 입력 가능합니다.");				
				}
			}

		}
		

		System.out.println("--등록된 제품 리스트--");
		//향상된 for문은 index번지를 다 채워야 하기 때문에 부적합 -> 그냥 for문
		for(int i=0; i<cnt; i++) {
			// to String이 있어야 사용가능
			System.out.println((i+1)+ "번째 상품 : "+p[i]);
			//프린트메서드 사용할 경우 - p[i].메서드명 
			
			sum+=p[i].getPrice(); //이미 배열에 있는 값까지 다 더해주는 것
			
			
		}
		
		System.out.println("---총합계----");
			System.out.println(cnt+"개의 총 합계:"+sum);
		}
		
		
		
		
		
		
		

	}


