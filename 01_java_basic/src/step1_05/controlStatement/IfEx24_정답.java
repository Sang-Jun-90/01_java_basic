package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx24_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;

		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = ran.nextInt(4)+1;
		int what;
		
		System.out.println(num3);
		
		int answer;
		
		
		if (num3 == 1) {
			System.out.println(num1 + " ? "+ num2 + " = " + (num1+num2)) ;
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.print("정답은? ");
			answer = scan.nextInt();
		}
		else if (num3 == 2) {
			System.out.println(num1 + " ? "+ num2 + " = " + (num1-num2)) ;
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.print("정답은? ");
			answer = scan.nextInt();
		}
		else if (num3 == 3) {
			System.out.println(num1 + " ? "+ num2 + " = " + (num1*num2)) ;
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.print("정답은? ");
			answer = scan.nextInt();
		}
		else  {
			System.out.println(num1 + " ? "+ num2 + " = " + (num1/num2)) ;
			System.out.println("1) + 2) - 3) * 4) %");
			System.out.print("정답은? ");
			answer = scan.nextInt();
		}
		
		if (answer == num3) {
			System.out.println("정답");
		}
		else { 
			System.out.println("땡");
		}
		
		
	}

}
