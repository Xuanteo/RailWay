package frontend;

import java.util.Scanner;

public class Exercise1_DatatypeCasting {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời ban chọn câu hỏi: ");
		System.out.println("Nhập vào số 1 để thực hiện Question1:");
		System.out.println("Nhập vào số 2 để thực hiện Question2:");
		System.out.println("Nhập vào số 3 để thực hiện Question3:");
		System.out.println("Nhập vào số 4 để thực hiện Question3:");
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

		default:
			break;
		}
	}

//	Question 4:
//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	@SuppressWarnings("resource")
	private static void question4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a:");
		int a = sc.nextInt();
		System.out.println("Nhập vào số nguyên b:");
		int b;
		do {
			b = sc.nextInt();
			if (b == 0) {
				System.out.println("Nhập vào số khác 0");
			}
		} while (b == 0);
		
		float c = (float)a / (float)b;
		System.out.println("Thương của 2 số là: " + c);

	}

//	Question 3:
//		Lấy 2 số cuối của số ở Question 2 và in ra.
//		Gợi ý:
//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//		Cách 2: chia lấy dư số đó cho 100
	private static void question3() {
		System.out.println("Lấy ngẫy nhiên 1 số có 5 chữ số: ");
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		if (a < 10000) {
			a = a * 10;
		}
		System.out.println("Question 2");
		System.out.println("Số ngẫu nhiên: " + a);
		String b = String.valueOf(a);
		System.out.println("Question 3: ");
		System.out.println("2 số cuối của số có 5 chữ số: " + b.substring(3));

	}

//	Question 2:
//		Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//		có số 0 ở đầu cho đủ 5 chữ số)
	private static void question2() {
		System.out.println("Lấy ngẫy nhiên 1 số có 5 chữ số: ");
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		if (a < 10000) {
			a = a * 10;
		}
		System.out.println("Số ngẫu nhiên: " + a);
	}

//	Exercise 1 (Optional): Datatype Casting
//	Question 1:
//	Khai báo 2 số lương có kiểu dữ liệu là float.
//	Khởi tạo Lương của Account 1 là 5240.5 $
//	Khởi tạo Lương của Account 2 là 10970.055$
//	Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//	Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
	private static void question1() {
		float accsalary1;
		float accsalary2;
		accsalary1 = (float) 5240.5;
		accsalary2 = (float) 10970.055;
		System.out.println("Account salary 1: " + accsalary1 + " || Account salary 2:" + accsalary2);
		int roundSalary1 = (int) accsalary1;
		int roundSalary2 = (int) accsalary2;
		System.out.println("Round Account 1: " + roundSalary1 + "|| Round Account 2: " + roundSalary2);
	}
}
