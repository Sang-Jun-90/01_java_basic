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
		
		int result = 0;
		
		int ten = rNum / 10;
		int one = rNum % 10;
		
		if (ten == 3) result += 1;
		if (one == 3 || one == 6 || one == 9) result += 1;
	
		if (result == 2) System.out.println("짝짝!");
		else if (result == 1) System.out.println("짝!");
		else System.out.println(rNum);
	
		
	}

}
