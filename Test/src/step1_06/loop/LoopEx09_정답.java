package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */
//2021-01-28 20:07 ~ 
public class LoopEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			// 입금
			if (selectMenu == 1) {
				System.out.print("입금할금액 : ");
				int inputMoney = scan.nextInt();
				myMoney += inputMoney;
				System.out.println("내계좌잔금 : " + myMoney);
			}
			
			// 출금
			else if (selectMenu == 2) {
				System.out.print("출금할금액 : ");
				int withdrow = scan.nextInt();
				// 돈이 있는경우
				if (withdrow <= myMoney) {
					myMoney -= withdrow;
					System.out.println("내계좌잔금 : " + myMoney);
				}
				// 돈이 없는경우
				else if (withdrow > myMoney) {
					System.out.println("돈이 없는데요....");
				}
				
			}
			
			// 이체
			else if (selectMenu == 3) {
				System.out.print("이체할 계좌 : ");
				int inputAcc = scan.nextInt();
				// 계좌가 맞는경우
				if (inputAcc == yourAcc) {
					
					System.out.print("이체할금액 : ");
					int sendMoney = scan.nextInt();
					//이제할 금액이 있는경우
					if (sendMoney <= myMoney) {
						myMoney -= sendMoney;
						yourMoney += sendMoney;
						System.out.println("내계좌잔금 : " + myMoney);
						System.out.println("너계좌잔금 : " + yourMoney);
					}
					//이체할 금액이 없는경우
					else if (sendMoney > myMoney){
						System.out.println("돈이 없는데요....");
						System.out.println("내계좌잔금 : " + myMoney);
					}
				}
				else {
					System.out.println("계좌가 틀렸어요");
				}
			}
			
			//조회
			else if (selectMenu == 4) {
				System.out.println("내계좌잔금 : " + myMoney);
				System.out.println("너계좌잔금 : " + yourMoney);
			}
			//종료
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}

