package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_정답 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		int num = ran.nextInt(10);
		
		if(num < 3) {
			System.out.println("당신이 뽑은 복권은 당첨!");
		}
		else {
			System.out.println("당신이 뽑은 복권은 꽝");
		}
		
	}

}
