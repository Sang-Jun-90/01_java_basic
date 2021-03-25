package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx22_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50)+1;
		
		int tenNum = rNum / 10;	
		int oneNum = rNum % 10;
		
		int howMany = 0;

		if (tenNum == 3 || tenNum == 6 || tenNum == 9) {
			howMany = howMany + 1;
		}
		if (oneNum == 3 || oneNum == 6 || oneNum == 9) {
			howMany = howMany + 1;
		}
		
		if(howMany == 2) {
			System.out.println("짝짝");
		}
		else if (howMany == 1) {
			System.out.println("짝");
		}
		else if (howMany == 0) {
			System.out.println("없음");
		}
		
		System.out.println(rNum);
		System.out.println(tenNum);
		System.out.println(oneNum);
		
	}

}
