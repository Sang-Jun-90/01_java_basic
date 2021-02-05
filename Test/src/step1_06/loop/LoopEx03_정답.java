package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답1) 15
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		int i = 1 ; 
		int plusFive = 0;
		
		while (i <= 5 ) {
			plusFive = plusFive + i;
			i++;
		}
		System.out.println(plusFive);
		
		int k = 1 ; 
		int plus = 0;
		int howMany = 0;
		
		while (k <= 10 ) {
			if (k < 3 || k >= 7 ) {
				System.out.println(k);
				plus = plus + k;
				howMany++;
			}
			k++;
		}
		System.out.println(plus);
		System.out.println(howMany);
		

	}

}
