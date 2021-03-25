package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_정답 {

	public static void main(String[] args) {
		Random ran = new Random();
				
		int com = ran.nextInt(3);		
		
		System.out.println("[가위바위보게임]");
		System.out.println("=== 0 : 가위==="); 
		System.out.println("=== 1 : 바위==="); 
		System.out.println("=== 2 : 보==="); 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 선택은? ");
		
		int me = scan.nextInt();
		System.out.println();
		if( com == 0 ) {
			if(me == 0) {
				System.out.println("비겼어요.");
			}
			else if (me == 1) {
				System.out.println("이겼어요.");
			}
			else if (me == 2) {
				System.out.println("졌어요.");
			}
		}
		else if (com == 1 ) {
			if(me == 0) {
				System.out.println("졌어요.");
			}
			else if (me == 1) {
				System.out.println("비겼어요.");
			}
			else if (me == 2) {
				System.out.println("이겼어요.");
			}
			
		}
		else if (com == 2 ) {
			if(me == 0) {
				System.out.println("이겼어요.");
			}
			else if (me == 1) {
				System.out.println("졌어요.");
			}
			else if (me == 2) {
				System.out.println("비겼어요.");
			}
			
		}
		System.out.println();
		System.out.println("컴퓨터 선택 : " + com);
		System.out.println("당신의 선택 : " + me);
		
		
		scan.close();
		
	}

}
