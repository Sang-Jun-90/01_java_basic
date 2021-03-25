package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_정답 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int bul = 0;
		int shrimp = 0;
		int coke = 0;
		int total = 0;
		
		
		while (i < 5) {
			System.out.print( "메뉴선택 : ");
			int menu1 = scan.nextInt();
			
			if (menu1 == 1) {
				bul ++;
				total += 8700;
			}
			else if (menu1 == 2){
				shrimp ++;
				total += 6200;
			}
			else if (menu1 == 3){
				coke ++;
				total += 1500;
			}
			else {
				System.out.println("잘못입력함");
			}
			
			i++;
		}
		
		System.out.println("돈을 입력하세요");
		int inputMoney = scan.nextInt();
		
		
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + bul + "개");
		System.out.println("2. 새우    버거 : "+ shrimp + "개");
		System.out.println("3. 콜         라 : "+ coke + "개");
		System.out.println("4. 총   금   액 : "+ total + "원");
		System.out.println("5. 잔         돈 : "+ (inputMoney - total) + "원");
		

	}

}
