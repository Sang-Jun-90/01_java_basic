package step1_06.loop;
import java.util.*;
/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */
// 2021-02-03 21:32 ~ 
public class LoopEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scan.nextInt();
		
		
		for (int i = 2 ; i <= num ; i++) {
			
			int cnt = 0;
			int k = 1;
			while (k <= num) {
				if (i % k == 0) {
					cnt++;
				}
				k++;
			}
			if (cnt == 2) {
				System.out.print(i + ", ");
				cnt = 0;
			}
			

		}
		
		scan.close();
		
	}
	
}
