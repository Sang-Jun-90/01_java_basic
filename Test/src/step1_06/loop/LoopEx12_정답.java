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
		
		while (i <= 50) {
			
			int check = 0;
			
			int ten = i % 10;
			int one = i / 10;
			
			if (ten == 3 || ten == 6 || ten == 9) check++;
			if (one == 3 || one == 6 || one == 9) check++;
			
			if (check == 2) System.out.println("짝짝");
			else if (check == 1) System.out.println("짝");
			else System.out.println(i);
			
			i++;
		}
		
	}

}
