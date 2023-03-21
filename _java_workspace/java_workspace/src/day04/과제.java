package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
//		주사위를 던져서 총 30칸을 이동하면 완주
//		주사위 : 1~6까지의 랜덤수
//		주사위 : 3
//		3칸 전진 => 27칸 남았습니다.
//		주사위 : 6
//		6칸 전진 => 21칸 남았습니다.
//		30칸이 지나면 '도착~!!', 총 이동횟수 : 00번


		int random = 0; // 주사위 값
		int sum =0; // 전체 이동거리 합산
		int cnt =0; // 던진 횟수(이동횟수)
		int last = 30; // 최종 목표값
		
		
		while(sum < last) { //sum이 last가 될때까지 반복
			random = (int)(Math.random()*6)+1;//랜덤수 생성
			sum += random; //거리합산
			cnt ++; //던진횟수 세기
			System.out.println("주사위: " + random + ", 전진=>"+ (last-sum) +"칸 남았습니다.");
		}
		System.out.println("도착~!!, 총이동횟수 : " +cnt);
		
		
		
	}

}
