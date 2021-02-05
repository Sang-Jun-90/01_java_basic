package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx28_테스트문제정답 {

	public static void main(String[] args) {

		
		
		
		for (int i = 0 ; i < 9 ; i++) {
			
			for (int j = 8 ; j - i > 0 ; j--) {
				
				System.out.print(" ");
			}
			
			for (int k = 0 ; k <= i ; k++) {
				
				System.out.print(i+1 + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
