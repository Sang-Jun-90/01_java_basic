package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 로그인
			if (sel == 1) {
				// 로그아웃상태일때
				if (identifier == -1) {
					System.out.print("아이디 : ");
					int inputId = scan.nextInt();
					if (inputId == 1111) {
						System.out.print("비밀번호 : ");
						int inputPw = scan.nextInt();
						if(inputPw == 1234) {
							System.out.println("=======================");
							System.out.println("로그인성공 1111님 반갑습니다.");
							System.out.println("=======================");
							identifier = 1;
						}
					}
					else if (inputId == 2222) {
						System.out.print("비밀번호 : ");
						int inputPw = scan.nextInt();
						if(inputPw == 2345) {
							System.out.println("=======================");
							System.out.println("로그인성공 2222님 반갑습니다.");
							System.out.println("=======================");
							identifier = 2;
						}
						
					}
					else {
						System.out.println("=======================");
						System.out.println("아이디가 틀렸어요.");
						System.out.println("=======================");
					}
				}
				else {
					System.out.println("=======================");
					System.out.println("이미 로그인되어 있습니다.");
					System.out.println("=======================");
				}
			}
			// 로그아웃
			else if (sel == 2) {
				// 1111 로그아웃
				if (identifier == 1) {
					System.out.println("=======================");
					System.out.println("로그아웃 1111님");
					System.out.println("=======================");
					identifier = -1;
				}
				// 2222 로그아웃
				else if (identifier == 2) {
					System.out.println("=======================");
					System.out.println("로그아웃 2222님");
					System.out.println("=======================");
					identifier = -1;
				}
				//// 로그인안되어 있을때
				else {
					System.out.println("=======================");
					System.out.println("로그인이 안되어있는데요...");
					System.out.println("=======================");
				}	
			}
			// 입금
			else if (sel == 3) {
				//// 1111 입금
				if (identifier == 1) {
					System.out.print("입금할금액은? :");
					int inputMoney = scan.nextInt();
					dbMoney1 += inputMoney;
					System.out.println("=======================");
					System.out.println("당신의 잔고 : " + dbMoney1);
					System.out.println("=======================");	
				}
				//// 2222 입금
				if (identifier == 2) {
					System.out.print("입금할금액은? :");
					int inputMoney = scan.nextInt();
					dbMoney2 += inputMoney;
					System.out.println("=======================");
					System.out.println("당신의 잔고 : " + dbMoney2);
					System.out.println("=======================");	
				}
				else {
					System.out.println("=======================");
					System.out.println("로그인이 안되어있는데요...");
					System.out.println("=======================");
				}
			}
			// 출금
			else if (sel == 4) {
				// 1111 출금 하는경우
				if (identifier == 1) {
					System.out.print("출금할금액은? :");
					int withdrawMoney = scan.nextInt();
					// 돈이 있는 경우
					if (withdrawMoney <= dbMoney1 ) {
						dbMoney1 -= withdrawMoney;
						System.out.println("=======================");
						System.out.println("당신의 잔고 : " + dbMoney1);
						System.out.println("=======================");	
					}
					// 돈이 없는 경우
					else if (withdrawMoney > dbMoney1) {
						System.out.println("=======================");
						System.out.println("돈이 없는데요...");
						System.out.println("=======================");						
					}
				}
				// 2222 출금하는경우
				if (identifier == 2) {
					System.out.print("출금할금액은? :");
					int withdrawMoney = scan.nextInt();
					if (withdrawMoney <= dbMoney2 ) {
						dbMoney1 -= withdrawMoney;
						System.out.println("=======================");
						System.out.println("당신의 잔고 : " + dbMoney2);
						System.out.println("=======================");	
					}
					// 돈이 없는 경우
					else if (withdrawMoney > dbMoney2) {
						System.out.println("=======================");
						System.out.println("돈이 없는데요...");
						System.out.println("=======================");						
					}
				}
				// 출금시 로그인안되어 있는경우
				else {
					System.out.println("=======================");
					System.out.println("로그인이 안되어있는데요...");
					System.out.println("=======================");
				}
				
			}
			// 이체
			else if (sel == 5) {
				// 1111 이 이체하는 경우
				if (identifier == 1) {
					System.out.print("어느계좌로 이체 : ");
					int inputAcc = scan.nextInt();
					// 계좌가 맞는경우
					if (inputAcc == 2222) {
						System.out.print("얼마나 이체 : ");
						int sendMoney = scan.nextInt();
						// 잔금이 있는경우
						if (sendMoney <= dbMoney1) {
							dbMoney1 -= sendMoney;
							dbMoney2 += sendMoney;
							System.out.println("당신의 잔고는 : " + dbMoney1);
						}
						// 잔금이 없는경우
						else if (sendMoney > dbMoney1) {
							System.out.println("=======================");
							System.out.println("잔금이 없는데요...");
							System.out.println("=======================");						
						}
					}
					else {
						System.out.println("=======================");
						System.out.println("계좌가 안맞는데요...");
						System.out.println("=======================");						
					}
					
				}
				// 2222 이 이체하는 경우
				else if (identifier == 2) {
					System.out.print("어느계좌로 이체 : ");
					int inputAcc = scan.nextInt();
					// 계좌가 맞는경우
					if (inputAcc == 1111) {
						System.out.print("얼마나 이체 : ");
						int sendMoney = scan.nextInt();
						// 잔금이 있는경우
						if (sendMoney <= dbMoney2) {
							dbMoney2 -= sendMoney;
							dbMoney1 += sendMoney;
							System.out.println("당신의 잔고는 : " + dbMoney2);
						}
						// 잔금이 없는경우
						else if (sendMoney > dbMoney2) {
							System.out.println("=======================");
							System.out.println("잔금이 없는데요...");
							System.out.println("=======================");						
						}
					}
					else {
						System.out.println("=======================");
						System.out.println("계좌가 안맞는데요...");
						System.out.println("=======================");						
					}
				
				}
				
				// 이체시 로그인안되어 있는경우
				else {
					System.out.println("=======================");
					System.out.println("로그인이 안되어있는데요...");
					System.out.println("=======================");
				}
			}
			// 조회
			else if (sel == 6) {
				// 1111 로그인일때 조회
				if (identifier == 1) {
					System.out.println("=======================");
					System.out.println("당신의 잔금은 : " + dbMoney1);
					System.out.println("=======================");
				}
				else if (identifier == 2) {
				// 2222 로그인일때 조회
					System.out.println("=======================");
					System.out.println("당신의 잔금은 : " + dbMoney2);
					System.out.println("=======================");
				}
				// 로그아웃일 때 조회
				else {
					System.out.println("=======================");
					System.out.println("로그아웃 상태인데요..");
					System.out.println("=======================");
				}
			}
			// 종료
			else if (sel == 0) {
				isRun = false;
				System.out.println("=======================");
				System.out.println("프로그램 종료");
				System.out.println("=======================");
			}
		}
	
		scan.close();
		
	}

}
