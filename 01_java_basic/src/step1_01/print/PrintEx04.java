package step1_01.print;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx04 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf3.format(date));
		
		
	}

}
