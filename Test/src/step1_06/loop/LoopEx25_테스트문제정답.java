package step1_06.loop;

/*
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx25_테스트문제정답 {

	public static void main(String[] args) {

//		# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
//		# 답 : 63
		
		int i = 1;
		Boolean isRunning = true;
		
		while (isRunning) {
			int num = 9 * i;
			if (num / 10 >= 6) {
				System.out.print(num);
				isRunning = false;
			}
			i++;
		}
		System.out.println();
		
//		# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
//		# 답 149
		
		int j = 1;
		Boolean isRun = true;
		int max = 0;
		
		while (isRun) {
			if (j % 8 == 5) max = j;
			if (j > 150) isRun = false;
			j++;
		}
		System.out.print(max);
		System.out.println();
		
//		# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
//		# 답 6 (54,63,72,81,90,99)
		
		int cnt = 0;
		
		for (int k = 50 ; k <=100 ; k++) {
			if (k % 9 == 0) cnt++;
		}
		System.out.print(cnt);
		System.out.println();
		
//		# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
//		# 답 980
		
		int etMax  = 0;
		int l = 1;
		Boolean isR = true;
		
		while (isR) {
			int mul28 = l * 28;
			if (mul28 > 1000) {
				isR = false;
				continue;
			}
			if (etMax <= mul28 ) etMax = mul28;
			l++;
		}
		System.out.print(etMax);
		System.out.println();
		
		
//		# 문제5) 8의 배수를 작은수부터 5개 출력
//		# 답 : 0,8,16,24,32
		
		// for문
		for (int m = 0 ; m < 5 ; m++) System.out.print((m * 8) + ", ");
		System.out.println();
		
		// while문
		
		Boolean isRun1 = true;
		int n = 0;
		
		while (isRun1) {
			System.out.print((n * 8) + ", ");
			if (n == 4) {isRun1 = false;
			n++;
		}
		
		
	}

}
}
















