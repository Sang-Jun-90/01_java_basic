package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요(3번)");
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("세번째 숫자 : ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2) {
			if(num1 >= num3) {
				System.out.println("MAX 값은 :" + num1);
			}
			else if(num1 < num3) {
				System.out.println("MAX 값은 :" + num3);
			}
		}
		else if(num1 < num2) {
			if(num2 >= num3) {
				System.out.println("MAX 값은 :" + num2);
			}
			else if(num2 < num3) {
				System.out.println("MAX 값은 :" + num3);
			}
		}
		
		
		scan.close();
	}

}
