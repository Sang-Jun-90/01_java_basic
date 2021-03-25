package step1_05.controlStatement;

import java.util.Scanner;

/*
 * 
 *  # 선택할 수 있는 야식
 * 
 *  금액을 입력받아서
 *   
 *  3만원 이상이면 아래와 같이 화면에 출력 후 종료
 *  족발세트 
 *  치킨세트 
 *  분식세트 
 *   
 *  2만원 이상 3만원 미만이면 아래와 같이 화면에 출력 후 종료
 *  치킨세트
 *  분식세트
 *  
 *  1만원 이상 2만원 미만이면 아래와 같이 화면에 출력 후 종료
 *  분식세트
 *  
 *  1만원 미만이면 아래와 같이화면에 출력 후 종료
 *  아무것도 사지 못합니다.
 *  
 * */

public class ifEx27_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- 선택할 수 있는 야식 ---");
		System.out.println("족발세트 (30000이상 40000미만)");
		System.out.println("치킨세트 (20000이상 30000미만)");
		System.out.println("분식세트 (10000이상 20000미만)\n");
		
		System.out.print("소유한 금액 입력: ");
		int getMoney= scan.nextInt();
		int myMoney;
		if (getMoney >=30000 && getMoney < 40000) {
			myMoney = 1;
		}
		else if (getMoney >=20000 && getMoney < 30000) {
			myMoney = 2;
		}
		else if (getMoney >=10000 && getMoney < 20000) {
			myMoney = 3;
		}
		else if (getMoney >=10000 && getMoney < 10000){
			myMoney = 4;
		}
		
	switch (getMoney) {
		
		case 1 :
			System.out.println("------------");
			System.out.println("족발세트");
			System.out.println("치킨세트");
			System.out.println("분식세트");
			System.out.println("------------");
			break;
		case 2 :
			System.out.println("------------");
			System.out.println("치킨세트");
			System.out.println("분식세트");
			System.out.println("------------");
			break;
		case 3 :
			System.out.println("------------");
			System.out.println("분식세트");
			System.out.println("------------");
			break;
		
		case 4 : 
			System.out.println("아무것도 사지 못합니다.");
			break;
			
			
		default : 
			System.out.println("?");
		}
		
		
		scan.close();
		
	}

}
