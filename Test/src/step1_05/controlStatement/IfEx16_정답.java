package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_정답 {

	public static void main(String[] args) {
		
		
		// 램덤으로 제시된 숫자가 짝수인지 홀수인지 알기
		Random ran = new Random();
		int num = ran.nextInt(100) + 1;
		int evenOdd;
		
		if(num % 2 == 1) {
			evenOdd = 1;
		}
		else {
			evenOdd = 2;
		}
		
		// 콘솔에 보여주기
		Scanner scan = new Scanner(System.in);
		System.out.println("제시된 숫자는? " + num);
		System.out.println();
		System.out.println("1.홀수");
		System.out.println("2.짝수");
		System.out.println();

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		scan.close();
		
		// 정답 확인
		
		if(choice == 1 || choice == 2) {
			if (evenOdd == choice) {
			System.out.println("정답");
			}
			else {
			System.out.println("땡");
			}
		}
		else {
			System.out.println("숫자를 잘못 입력했습니다.");
		}
		
		
		

		
	}

}
