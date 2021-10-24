package frontend;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4_Optianal_RandomNumber {

	public static void main(String[] args) {
//		Question 1:
//			In ngẫu nhiên ra 1 số nguyên
		System.out.println("Question 1: In ngẫu nhiên ra 1 số nguyên");
		Random random = new Random();
		int a = random.nextInt();
		System.out.println("Số ngẫu nhiên: " + a);

//		Question 2:
//			In ngẫu nhiên ra 1 số thực
		System.out.println("Question 2: In ngẫu nhiên ra 1 số thực");
		float a1 = random.nextFloat();
		System.out.println("Số ngẫu nhiên: " + a1);

//		Question 3:
//			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//			ra tên của 1 bạn
		System.out.println(
				"Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn");
		String[] namearr = { "Hoa", "Hue", "Ha", "Huong" };
		int i = random.nextInt(namearr.length);
		System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + namearr[i]);

//		Question 4:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//			1995
		System.out.println("Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995");
		// Tính số ngày nhỏ nhất tính từ 01-01-1970
		int minday = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		// Tính số ngày lớn nhất tính từ 20-12-1995
		int maxday = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		// Số ngày ngẫu nhiên trong khoảng thời gian.
		long randomint = minday + random.nextInt(maxday - minday);
		// Lấy ngày ngẫu nhiên trong khoảng thời gian.
		LocalDate localDate = LocalDate.ofEpochDay(randomint);
		// In ra ngày ngẫu nhiên.
		System.out.println("Ngày ngẫu nhiên: " + localDate);

//		Question 5:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		System.out.println("Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây");
		// Tính số ngày tại thời điểm hiện tại tính từ 01-01-1970
		int now = (int) LocalDate.now().toEpochDay();
		// Số ngày random tại thời điểm hiện tại trở về 1 năm về trước.
		int intrandom = now - random.nextInt(365);
		// Số ngày ngẫu nhiên trong khoảng thời gian.
		LocalDate localDate2 = LocalDate.ofEpochDay(intrandom);
		// In Ra:
		System.out.println("Ngày ngẫu nhiên: " + localDate2);
		
//		Question 6:
//			Lấy ngẫu nhiên 1 ngày trong quá khứ
		System.out.println("Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ");
		int nowday = (int) LocalDate.now().toEpochDay();
		long intrandom1 = random.nextInt(nowday);
		LocalDate localDate3 = LocalDate.ofEpochDay(intrandom1);
		System.out.println("Ngày ngẫu nhiên: " + localDate3);
		
//		Question 7:
//			Lấy ngẫu nhiên 1 số có 3 chữ số
		System.out.println("Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số");
		//Lấy ra số random: random(số max- số min +1) + số min
		int j = random.nextInt(999-100 + 1) +100; 
		System.out.println("Số ngẫu nhiên : " + j);
		

	}

}
