package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_정답 {

	public static void main(String[] args) {
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		Scanner scan = new Scanner(System.in);
		System.out.print("이체할 계좌번호를 입력하세요 : ");
		
		int inputAcc = scan.nextInt();
		
		if(inputAcc == yourAcc) {
			System.out.print("이체할 금액을 입력하세요 : ");
			int inputMoney = scan.nextInt();
			if (inputMoney <= myMoney) {
				myMoney = myMoney - inputMoney;
				yourMoney = yourMoney + inputMoney;
				System.out.println("당신의 잔고 : " + myMoney + "원");
				System.out.println("너의의 잔고 : " + yourMoney + "원");
			}
			else {
				System.out.println("계좌에 금액이 부족합니다.");
				System.out.println("당신의 잔고 : " + myMoney + "원");
			}
		}
		else {
			System.out.println("계좌번호가 틀렸습니다.");
		}
		
		scan.close();
		
	}

}
