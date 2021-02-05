package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */
//20210115 20:01 ~
public class IfEx02_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int com = 8;	
		System.out.println("빙고게임시작!");
		System.out.print("숫자 : ");
		int num1 = scan.nextInt();
		
		if (num1 < 8) {
			System.out.println("up!");
		}
		if (num1 == 8) {
			System.out.println("bingo!");
		}
		if (num1 > 8) {
			System.out.println("down!");
		}
		
		scan.close();
		
	}

}
