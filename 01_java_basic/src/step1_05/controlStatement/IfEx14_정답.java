package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);

		Scanner scan = new Scanner(System.in);
		
		System.out.print("동전맞추기(앞면 0, 뒷면 1) : ");
		int inputCoin = scan.nextInt();
		
		if (coin == inputCoin) {
			System.out.println("정답");
			if (coin == 0) {
				System.out.println("앞면");
			}
			else {
				System.out.println("뒷면");
			}
		}
		else {
			System.out.println("땡");
			if (coin == 0) {
				System.out.println("앞면");
			}
			else {
				System.out.println("뒷면");
			}
		}
		
		
		scan.close();


	}

}
