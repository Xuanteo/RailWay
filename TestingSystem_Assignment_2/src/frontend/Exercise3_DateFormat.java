package frontend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

import entity.Exam;

public class Exercise3_DateFormat {

	public static void main(String[] args) {

		Exam exam01 = new Exam();
		exam01.examID = 1;
		exam01.code = "VTI001";
		exam01.title = "De thi Java";
		exam01.duration = 90;
		exam01.createDate = LocalDate.of(2021, 10, 21);

		Exam exam02 = new Exam();
		exam02.examID = 2;
		exam02.code = "VTI002";
		exam02.title = "De thi SQL";
		exam02.duration = 60;
		exam02.createDate = LocalDate.of(2021, 4, 1);

		Exam exam03 = new Exam();
		exam03.examID = 3;
		exam03.code = "VTI003";
		exam03.title = "De thi PHP";
		exam03.duration = 120;
		exam03.createDate = LocalDate.of(2021, 1, 1);

//		Question 1:
//			In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//			dạng vietnamese
		System.out.println(
				"Question 1: In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese");
		Locale locale = new Locale("vn", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(Date.from(exam01.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));

		System.out.println("Thông tin exam thứ 1: ");
		System.out.println("ID: " + exam01.examID);
		System.out.println("Code: " + exam01.code);
		System.out.println("Title: " + exam01.title);
		System.out.println("Duration: " + exam01.duration);
		System.out.println("CreateDate: " + date);

//		Question 2:
//			In ra thông tin: Exam đã tạo ngày nào theo định dạng
//			Năm – tháng – ngày – giờ – phút – giây

		System.out.println(
				"Question 2: In ra thông tin: Exam đã tạo ngày nào theo định dạng Năm – tháng – ngày – giờ – phút – giây");
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Exam[] examarr = { exam01, exam02, exam03 };
		for (Exam exam : examarr) {
			date = simpleDateFormat.format(Date.from(exam.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			System.out.println(exam.code + " : " + date);
		}

//		Question 3:
//			Chỉ in ra năm của create date property trong Question 2
		System.out.println("Question 3: Chỉ in ra năm của create date property trong Question 2");
		String pattern1 = "yyyy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern1);
		Exam[] examarr1 = { exam01, exam02, exam03 };
		for (Exam exam : examarr1) {
			date = simpleDateFormat2
					.format(Date.from(exam.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			System.out.println(exam.code + " : " + date);
		}
		
//		Question 4:
//			Chỉ in ra tháng và năm của create date property trong Question 2
		System.out.println("Question 4: Chỉ in ra tháng và năm của create date property trong Question 2");
		String pattern2 = "yyyy-MM";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern2);
		Exam[] examarr2 = { exam01, exam02, exam03 };
		for (Exam exam : examarr2) {
			date = simpleDateFormat3
					.format(Date.from(exam.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			System.out.println(exam.code + " : " + date);
		}
		
//		Question 5:
//			Chỉ in ra "MM-DD" của create date trong Question 2
		System.out.println("Question 5: Chỉ in ra \"MM-DD\" của create date trong Question 2");
		String pattern3 = "MM-dd";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern3);
		Exam[] examarr3 = { exam01, exam02, exam03 };
		for (Exam exam : examarr3) {
			date = simpleDateFormat4
					.format(Date.from(exam.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
			System.out.println(exam.code + " : " + date);
		}
		

	}
}
