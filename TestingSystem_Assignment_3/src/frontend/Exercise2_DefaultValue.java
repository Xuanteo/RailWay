package frontend;

import java.time.LocalDate;

import entity.Account;

public class Exercise2_DefaultValue {
	public static void main(String[] args) {
//		Exercise 2 (Optional): Default value
//		Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		• Email: "Email 1"
//		• Username: "User name 1"
//		• FullName: "Full name 1"
//		• CreateDate: now
		System.out.println("Khởi tạo mảng account gồm 5 phần tử sử dụng vòng for: ");
		Account[] accArr = new Account[5];
		for (int i = 0; i < accArr.length; i++) {
			Account account = new Account();
			account.email = "Email " + i;
			account.username = "User name " + i;
			account.fullName = "Full name " + i;
			account.createDate = LocalDate.now();
			accArr[i] = account;
			System.out.println("Thông tin account " + i + " là: Email: " + accArr[i].email + " Username: "
					+ accArr[i].username + " Full name: " + accArr[i].fullName + " CreateDate: " + accArr[i].createDate);
		}
	}
}
