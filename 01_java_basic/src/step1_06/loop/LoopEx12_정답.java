package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답 {

	public static void main(String[] args) {
		
		int i = 1;
		
		int jjak = 0;
		
		while (i <= 50) {
			
			int ten = i / 10;
			int one = i % 10;
			
			if (ten == 3 || ten == 6 || ten == 9) {
				jjak += ten;
			}
			if (one == 3 || one == 6 || one == 9) {
				jjak += one;
			}
			
			if (jjak != 0) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
			
			jjak = 0;
			i++;
			
		}
		
		
	}

}
