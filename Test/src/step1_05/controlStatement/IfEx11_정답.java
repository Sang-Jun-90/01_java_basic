package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_정답 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("메뉴번호를 골라주세요.");
		int order = scan.nextInt();
		
		if(order == 1) {
			System.out.print("돈을입력하세요.");
			int pay1 = scan.nextInt();
			if (pay1 >= price1) {
				System.out.println();
				System.out.println("==영수증==");
				System.out.println("불고기버거");
				System.out.println("8,700원");
				System.out.println("잔돈 : " + (pay1 - price1)+ "원");
			}
			else if (pay1 < price1) {
				System.out.println("현금이 부족합니다.");
				
			}
			
		}
		if(order == 2) {
			System.out.print("돈을입력하세요.");
			int pay2 = scan.nextInt();
			if (pay2 >= price2) {
				System.out.println();
				System.out.println("==영수증==");
				System.out.println("새우버거");
				System.out.println("6,200원");
				System.out.println("잔돈 : " + (pay2 - price2)+ "원");
			}
			else if (pay2 < price2) {
				System.out.println("현금이 부족합니다.");
				
			}
		}
		if(order == 3) {
			System.out.print("돈을입력하세요.");
			int pay3 = scan.nextInt();
			if (pay3 >= price3) {
				System.out.println();
				System.out.println("==영수증==");
				System.out.println("콜라");
				System.out.println("1,500원");
				System.out.println("잔돈 : " + (pay3 - price3)+ "원");
			}
			else if (pay3 < price3) {
				System.out.println("현금이 부족합니다.");
				
			}
		}
		
		scan.close();
		
	}

}
