package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx24_정답 {

	public static void main(String[] args) {

		
		
		
		for (int i = 1 ; i < 6 ; i++) {
			// 홀수  
			if (i % 2 != 0) {
				for (int j = 1 ; j < 6 ; j++) {
				System.out.print(j + 5*(i-1));
				System.out.print(" ");
				}
				System.out.println();
			}
			
			// 짝수 
			if (i % 2 == 0) {
				for (int j = 1 ; j < 6 ; j++) {
				System.out.print((6-j) + 5*(i-1));
				System.out.print(" ");
				}
				System.out.println();
			}
		}

		
		
		
		
		
	}

}
