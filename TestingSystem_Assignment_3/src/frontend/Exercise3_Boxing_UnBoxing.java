package frontend;

import java.util.Scanner;

public class Exercise3_Boxing_UnBoxing {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời ban chọn câu hỏi: ");
		System.out.println("Nhập vào số 1 để thực hiện Question1:");
		System.out.println("Nhập vào số 2 để thực hiện Question2:");
		System.out.println("Nhập vào số 3 để thực hiện Question3:");
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
		default:
			break;
		}
	}

//	Question 3:
//		Khởi tạo 1 số Integer có value là chữ "1234567"
//		Sau đó convert số trên thành datatype int
	private static void question3() {
		System.out.println("Khởi tạo 1 Integer và convert sang int ");
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println("Số int convert là: " + b);
	}
//	Question 2:
//		Khai báo 1 String có value = "1234567"
//		Hãy convert String đó ra số int
	private static void question2() {
		System.out.println("Khai báo 1 string có value 1234567 và convert sang integer ");
		String a = "1234567";
		int b = Integer.parseInt(a);
		System.out.println("Số convert là: " + b);

	}
//	Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		float có 2 số sau dấu thập phân)
	private static void question1() {
		System.out.println("Khởi tạo lương datatype là Interger và convert ra float có 2 số sau dấu thập phân ");
		Integer a = 5000;
		float b = (float) a;
		System.out.printf("%2.2f", b);
	}
}
