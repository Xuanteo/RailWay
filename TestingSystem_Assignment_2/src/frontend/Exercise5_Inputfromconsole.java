package frontend;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5_Inputfromconsole {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời ban chọn câu hỏi: ");
		System.out.println("Nhập vào số 1 để thực hiện Question1:");
		System.out.println("Nhập vào số 2 để thực hiện Question2:");
		System.out.println("Nhập vào số 3 để thực hiện Question3:");
		System.out.println("Nhập vào số 4 để thực hiện Question4:");
		System.out.println("Nhập vào số 5 để thực hiện Question5:");
		System.out.println("Nhập vào số 6 để thực hiện Question6:");
		System.out.println("Nhập vào số 7 để thực hiện Question7:");
		System.out.println("Nhập vào số 8 để thực hiện Question8:");
		System.out.println("Nhập vào số 9 để thực hiện Question9:");
		System.out.println("Nhập vào số 10 để thực hiện Question10:");
		System.out.println("Nhập vào số 11 để thực hiện Question11:");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			question1();
			break;
		case 2:
			question2();
			break;
		case 3:
			question3();
			break;
		case 4:
			question4();
			break;
		case 5:
			question5();
			break;
		case 6:
			question6();
			break;
		case 7:
			question7();
			break;
		case 8:
			question8();
			break;
		case 9:
			question9();
			break;
		case 10:
			question10();
			break;
		case 11:
			question11();
			break;

		default:
			break;
		}

	}

//	Question 11: Tiếp tục Question 10
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//	vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//	Bước 1:
//	In ra tên các usernames của user cho người dùng xem6
//	Bước 2:
//	Yêu cầu người dùng nhập vào username của account
//	Bước 3:
//	Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//	Bước 4:
//	Thêm account vào group chương trình vừa chọn ngẫu
//	nhiên
	private static void question11() {
		// TODO Auto-generated method stub

	}

//	Question 10: Tiếp tục Question 8 và Question 9
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//	account
//	Bổ sung thêm Bước 3 của Question 8 như sau:
//	Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//	text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//	không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//	dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//	kết thúc chương trình)
	private static void question10() {
		// TODO Auto-generated method stub

	}

//	Question 9:
//		Viết method cho phép người dùng thêm group vào account theo flow sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		In ra tên các group cho người dùng xem
//		Bước 4:
//		Yêu cầu người dùng nhập vào tên của group
//		Bước 5:
//		Dựa vào username và tên của group người dùng vừa chọn, hãy
//		thêm account vào group đó .
	private static void question9() {
		// TODO Auto-generated method stub

	}

//	Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//		dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//		department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//		lại" và quay trở lại bước 1
	private static void question8() {
		// TODO Auto-generated method stub

	}

//	Question 7:
//		Nhập số chẵn từ console
	private static void question7() {
		// TODO Auto-generated method stub

	}

//	Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
	private static void question6() {
		// TODO Auto-generated method stub

	}

//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
	private static void question5() {
		System.out.println("Mời bạn nhập vào thông tin account: ");
		Scanner sc = new Scanner(System.in);

	}

	// Question 4:
//		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
	@SuppressWarnings("resource")
	private static void question4() {
		System.out.println("Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào năm sinh: ");
		int year = sc.nextInt();
		System.out.println("Nhập vào tháng sinh: ");
		int month = sc.nextInt();
		System.out.println("Nhập vào ngày sinh: ");
		int day = sc.nextInt();
		LocalDate localDate = LocalDate.of(year, month, day);
		System.out.println("Ngày sinh nhật của bạn là : " + localDate);

	}

//	Question 3:
//		Viết lệnh cho phép người dùng nhập họ và tên
	@SuppressWarnings("resource")
	private static void question3() {
		System.out.println("Question 3: Viết lệnh cho phép người dùng nhập họ và tên");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ: ");
		String a = sc.next();
		System.out.println("Nhập vào tên: ");
		String b = sc.next();
		System.out.println("Họ tên của người dùng đã nhập: " + a + " " + b);
	}

//	Question 2:
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
	@SuppressWarnings("resource")
	private static void question2() {
		System.out.println("Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình");
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào 2 số thực: ");
		System.out.println("Nhập vào số thứ 1: ");
		float a = sc.nextFloat();
		System.out.println("Nhập vào số thứ 2: ");
		float b = sc.nextFloat();
		System.out.println("Bạn vừa nhập các số: " + a + " " + b);
	}

//	Question 1:
//	Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
	@SuppressWarnings("resource")
	private static void question1() {
		System.out.println("Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình");
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào 3 số nguyên: ");
		System.out.println("Mời bạn nhập vào số nguyên 1: ");
		int a = sc.nextInt();
		System.out.println("Mời bạn nhập vào số nguyên 2: ");
		int b = sc.nextInt();
		System.out.println("Mời bạn nhập vào số nguyên 3: ");
		int c = sc.nextInt();
		System.out.println("Bạn vừa nhập vào các số: " + a + " " + b + " " + c);
	}

}
