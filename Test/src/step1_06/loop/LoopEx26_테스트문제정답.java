package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx26_테스트문제정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int getNumber = scan.nextInt();
		int outPut = 1;
		
		Boolean isRun = true;
		
		while (isRun) {
						
			int count = 0;
			for (int i = 1; i <= outPut ; i++) {
				if (outPut % i == 0) {
					count++;
				}
			}
			if (count == 2 && outPut > 1000) {
				System.out.print(outPut);
				isRun = false;
			}		
			outPut++;
		}
		
		scan.close();
		
	}

}
