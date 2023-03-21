package day06;

import java.util.Scanner;

public class 과제 {
	//스캐너 오픈 - 멤버변수의 자리(공통변수 선언) - 파란색
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 
		 * 계산기 ( + - * / % ) 각각 메서드 만들기
		 * 메서드에서 바로 출력(3+2 =5)
		 * 1. 숫자를 입력받는 메서드
		 * 	- 숫자 둘은 배열로 입력받기 
		 * 2. 메뉴 메서드
		 * 	- 원하는 계산을 선택해주세요
		 * 	- 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지 (switch)
		 * 3. 각 기능 메서드 => 메서드에서 바로 출력 (3+2=5)
		 * 
		 * 3. main에서 처리되어야 하는 부분
		 * 	1) 1번 메서드 호출 => 숫자를 배열로 저장
		 * 	2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 * 	3) switch(2번 return)
		 * 	4) case에 따라 계산기 메서드 호출
		 * 
		 * */
		
		//1번 메서드 호출
		
		int [] arr = getNums();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		// 2번 메서드 호출
		
		int select = getSelect();
		
		
		switch(select) {
		case 1 :
			add(arr);
			break;
		case 2 :
			sub(arr);
			break;
		case 3 :
			mul(arr);
			break;
		case 4 :
			div(arr);
			break;
		case 5 :
			rem(arr);
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
		/* 각 기능에 대한 메서드
		 * 리턴 : void
		 * 매개변수 : 배열
		 * */
	
		/* 숫자 배열로 입력받는 메서드 
		 * 매개변수 : X 
		 * 리턴타입 : 배열 -> int[]
		 * 메서드명 : getNums()
		 * */ 		 

		
		public static int[] getNums() {
			
			int[] nums = new int[2];
			
			for(int i=0;i<nums.length; i++) {
				System.out.println((i+1)+"번째 숫자를 입력하세요");
				nums[i] =scan.nextInt();
			}
			return nums;
			
		}
			
		// 2번 메뉴 메서드
		/* 매개변수 : x
		 * 리턴타입 : 사용자가 메뉴에서 고를 값 -> int
		 * 메서드명 : getSelect */
		
		public static int getSelect() {
		System.out.println("원하는 계산을 선택해주세요");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지 (switch)");
		
		int select = scan.nextInt();
		return select;
		}

		//3번 각기능 메서드
		/* 각 기능에 대한 출력 메서드
		 * 리턴 : void
		 * 매개변수 : 배열
		 * */
			
		public static void add(int nums[]) {
			int result = 0;
			for(int i=0; i<nums.length; i++) {
				result = result + nums[i];	
			}
			System.out.println(nums[0]+"+"+nums[1]+"="+result);
		}
		
		public static void sub(int nums[]) {
			int result = nums[0]-nums[1];
			System.out.println(nums[0]+"-"+nums[1]+"="+result);
		}
		
		public static void mul(int nums[]) {
			System.out.println(nums[0]+"*"+nums[1]+"="+(nums[0]*nums[1]));
		}
		public static void div(int nums[]) {
			System.out.println(nums[0]+"/"+nums[1]+"="+((double)nums[0]/nums[1]));
		}
		public static void rem(int nums[]) {
			System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
		}
}
