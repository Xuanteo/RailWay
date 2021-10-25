package frontend;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Account;

public class Exercise6_Method {
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
//		Tạo method để in ra các số nguyên dương nhỏ hơn 10
	private static void question3() {
		System.out.println("In ra các số nguyên dương nhỏ hơn 10: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " ");
		}

	}

//	Question 2:
//		Tạo method để in thông tin các account
	private static void question2() {
		// Tạo Account:
		Account acc1 = new Account();
		acc1.accountID = 1;
		acc1.email = "email1@gmail.com";
		acc1.username = "username1";
		acc1.fullName = "fullname1";
		acc1.createDate = LocalDate.now();
		Account acc2 = new Account();
		acc2.accountID = 2;
		acc2.email = "email1@gmail.com";
		acc2.username = "username2";
		acc2.fullName = "fullname2";
		acc2.createDate = LocalDate.of(2021, 10, 22);
		Account acc3 = new Account();
		acc3.accountID = 3;
		acc3.email = "email1@gmail.com";
		acc3.username = "username3";
		acc3.fullName = "fullname3";
		acc3.createDate = LocalDate.of(2021, 10, 23);
		Account[] accArr = { acc1, acc2, acc3 };
		System.out.println("Thông tin account trên hệ thống: ");
		for (int i = 0; i < accArr.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + "là: " + "ID: " + accArr[i].accountID
					+ " Username: " + accArr[i].username + " Fullname: " + accArr[i].fullName + " CreateDate: "
					+ accArr[i].createDate);
		}

	}

//	Question 1:
//		Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
	private static void question1() {
		System.out.println("In ra các số chẵn nguyên dương nhỏ hơn 10: ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

	}
}
