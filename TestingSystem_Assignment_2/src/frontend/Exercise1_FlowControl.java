package frontend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.enumerate.PositionName;

public class Exercise1_FlowControl {

	public static void main(String[] args) {
		// Khởi tạo department:
		Department department1 = new Department(1, "Sale");
		Department department2 = new Department(2, "Marketing");
		Department department3 = new Department(3, "BOB");

		// Khởi tạo Position:
		Position position1 = new Position(1, PositionName.Dev);
		Position position2 = new Position(2, PositionName.Scrum_Master);
		Position position3 = new Position(3, PositionName.PM);

		// Khởi tạo Group
		Group group1 = new Group(1, "Development", LocalDate.now());
		Group group2 = new Group(2, "Group3", LocalDate.now());
		Group group3 = new Group(3, "VTI", LocalDate.now());

		// Khởi tạo Account:

		Group[] groupAcc1 = { group1, group2 };
		Group[] groupAcc2 = { group2, group3 };
		Group[] groupAcc3 = { group1, group2, group3 };
		Account account1 = new Account(1, "email1@gmai.com", "email1", "fullname1", department3, position3,
				LocalDate.now(), groupAcc1);
		Account account2 = new Account(2, "email2@gmai.com", "email2", "fullname2", department2, position2,
				LocalDate.now(), groupAcc2);
		Account account3 = new Account(3, "email3@gmai.com", "email3", "fullname3", department1, position1,
				LocalDate.now(), groupAcc3);
		Account account4 = new Account(4, "email4@gmai.com", "email4", "fullname4", department2, position1,
				LocalDate.now(), groupAcc3);
		Account account5 = new Account(5, "email5@gmai.com", "email5", "fullname5", department3, position1,
				LocalDate.now(), groupAcc3);
		// add account to group
		group1.accounts = new Account[] { account1, account2 };
		group2.accounts = new Account[] { account2, account3 };
		group3.accounts = new Account[] { account1, account2, account3 };

//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"

		System.out.println("question1:--------Check Account 2 ---------");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department);
		}

//		Question 2:
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//			người hóng chuyện, tham gia tất cả các group"

		System.out.println("question2:--------Check Account 2 ---------");
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int countGroup = account2.groups.length;
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên\r\n" + "này là Java Fresher, C# Fresher");
			}
			if (countGroup == 3) {
				System.out.println("Nhân viên này là người\r\n" + "quan trọng, tham gia nhiều group");
			}
			if (countGroup >= 4) {
				System.out.println("Nhân viên này là\r\n" + "người hóng chuyện, tham gia tất cả các group");
			}
		}

//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1

		System.out.println("question3:--------Check Account 2 sử dụng toán tử ternary để làm question 1---------");
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + account2.department);

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

		System.out.println("question4:--------Check Account 1 sử dụng toán tử ternary để check position---------");
		System.out.println(account1.position.positionName.toString().equalsIgnoreCase("Dev") ? "Đây là Developer"
				: "Người này không phải là Developer");

//		SWITCH CASE
//		Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"

		System.out.println("question5:--------Lấy ra số lượng account trong nhóm thứ 1---------");
		if (group1.accounts == null) {
			System.out.println("Không có thành viên nào trong nhóm");
		} else {

			int countAcc = group1.accounts.length;
			switch (countAcc) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;

			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}

		}
//		Question 6:
//			Sử dụng switch case để làm lại Question 2

		System.out.println("question6:--------Check Account 2 with switch case---------");
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int accgroup = account2.groups.length;
			switch (accgroup) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			case 4:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;

			default:
				break;
			}
		}

//		Question 7:
//			Sử dụng switch case để làm lại Question 4
		System.out.println("question7:--------Check Account 1 sử dụng toán tử ternary để check position---------");

		switch (account1.position.positionName.toString()) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

//		FOREACH
//		Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ
		System.out.println("question8:--------In ra thông tin các account---------");
		Account[] arrAcc = { account1, account2, account3 };
		for (Account account : arrAcc) {
			System.out.println("Thông tin Account: " + account.fullName);
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Tên Phòng ban: " + account.department.departmentName);
		}

//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("question9:--------In ra thông tin các phòng ban---------");
		Department[] depArr = { department1, department2, department3 };
		for (Department department : depArr) {
			System.out.println("Thông tin phòng ban: " + department.departmentName);
			System.out.println("ID Phòng ban: " + department.departmentID);
			System.out.println("Tên Phòng ban: " + department.departmentName);
		}

//		FOR
//		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		System.out.println("question10:--------In ra thông tin các account---------");
		Account[] arrAcc1 = { account1, account2, account3 };
		for (int i = 0; i < arrAcc1.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + arrAcc1[i].email);
			System.out.println("Full name: " + arrAcc1[i].fullName);
			System.out.println("Phòng ban: " + arrAcc1[i].department.departmentName);
		}
//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("question11:--------In ra thông tin các phòng ban---------");
		Department[] depArr1 = { department1, department2, department3 };
		for (int i = 0; i < depArr1.length; i++) {
			System.out.println("Thông tin deparment thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + depArr1[i].departmentID);
			System.out.println("Name: " + depArr1[i].departmentName);

		}

//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("question12:--------Chỉ in ra thông tin 2 department đầu tiên---------");
		Department[] depArr2 = { department1, department2, department3 };
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin deparment thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + depArr2[i].departmentID);
			System.out.println("Name: " + depArr2[i].departmentName);
		}
//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("question13:--------In ra thông tin tất cả các account ngoại trừ account thứ 2---------");
		Account[] arrAcc2 = { account1, account2, account3 };
		for (int i = 0; i < arrAcc1.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + arrAcc2[i].email);
				System.out.println("Full name: " + arrAcc2[i].fullName);
				System.out.println("Phòng ban: " + arrAcc2[i].department.departmentName);
			}

		}
//		Question 14:
//			In ra thông tin tất cả các account có id < 4
		System.out.println("question14:--------In ra thông tin tất cả các account có id < 4---------");
		Account[] arrAcc3 = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < arrAcc1.length; i++) {
			if (arrAcc3[i].accountID < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + arrAcc3[i].email);
				System.out.println("Full name: " + arrAcc3[i].fullName);
				System.out.println("Phòng ban: " + arrAcc3[i].department.departmentName);
			}

		}
//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("question15:--------In ra các số chẵn nhỏ hơn hoặc bằng 20---------");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}

		}

//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue

//		Question 16-10: cách sử dụng WHILE
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		System.out.println("question 16-10:--------In ra thông tin các account---------");
		Account[] arrAcc4 = { account1, account2, account3 };
		int i = 0;
		while (i < arrAcc4.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + arrAcc1[i].email);
			System.out.println("Full name: " + arrAcc1[i].fullName);
			System.out.println("Phòng ban: " + arrAcc1[i].department.departmentName);
			i++;
		}

//		Question 16-11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
//		Thông tin department thứ 2 là:
//		Id: 2
//		Name: Marketing
		System.out.println("question 16-11:--------In ra thông tin các phòng ban---------");
		Department[] depArr3 = { department1, department2, department3 };
		int i1 = 0;
		while (i1 < depArr3.length) {
			System.out.println("Thông tin deparment thứ " + (i1 + 1) + " là: ");
			System.out.println("ID: " + depArr1[i1].departmentID);
			System.out.println("Name: " + depArr1[i1].departmentName);
			i1++;
		}
//		Question 16-12:
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("question 16-12:--------Chỉ in ra thông tin 2 department đầu tiên---------");
		Department[] depArr4 = { department1, department2, department3 };
		int i2 = 0;
		while (i2 < 2) {
			System.out.println("Thông tin deparment thứ " + (i2 + 1) + " là: ");
			System.out.println("ID: " + depArr4[i2].departmentID);
			System.out.println("Name: " + depArr4[i2].departmentName);
			i2++;
		}
//		Question 13:
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out
				.println("question 16-13:--------In ra thông tin tất cả các account ngoại trừ account thứ 2---------");
		Account[] arrAcc5 = { account1, account2, account3 };
		int i3 = 0;
		while (i3 < arrAcc5.length) {
			if (i3 != 1) {
				System.out.println("Thông tin account thứ " + (i3 + 1) + " là: ");
				System.out.println("Email: " + arrAcc5[i3].email);
				System.out.println("Full name: " + arrAcc5[i3].fullName);
				System.out.println("Phòng ban: " + arrAcc5[i3].department.departmentName);
			}
			i3++;
		}
//		Question 16-14:
//		In ra thông tin tất cả các account có id < 4
		System.out.println("question 16-14:--------In ra thông tin tất cả các account có id < 4---------");
		Account[] arrAcc6 = { account1, account2, account3, account4, account5 };
		int i4 = 0;
		while (i4 < arrAcc6.length) {
			if (arrAcc3[i4].accountID < 4) {
				System.out.println("Thông tin account thứ " + (i4 + 1) + " là: ");
				System.out.println("Email: " + arrAcc6[i4].email);
				System.out.println("Full name: " + arrAcc6[i4].fullName);
				System.out.println("Phòng ban: " + arrAcc6[i4].department.departmentName);
			}
			i4++;
		}

//	Question 16-15:
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("question 16-15:--------In ra các số chẵn nhỏ hơn hoặc bằng 20---------");
		int i5 = 0;
		while (i5 <= 20) {
			if (i5 % 2 == 0) {
				System.out.println(i5 + " ");
			}
			i5++;
		}

//		DO-WHILE
//		Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//		lệnh break, continue

//		Question 17-10: cách sử dụng WHILE
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		System.out.println("question 17-10:--------In ra thông tin các account---------");
		Account[] arrAccou = { account1, account2, account3 };
		int j = 0;
		do {
			System.out.println("Thông tin account thứ " + (j + 1) + " là: ");
			System.out.println("Email: " + arrAccou[j].email);
			System.out.println("Full name: " + arrAccou[j].fullName);
			System.out.println("Phòng ban: " + arrAccou[j].department.departmentName);
			j++;
		} while (j < arrAccou.length);

//		Question 17-11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
//		Thông tin department thứ 2 là:
//		Id: 2
//		Name: Marketing
		System.out.println("question 17-11:--------In ra thông tin các phòng ban---------");
		Department[] departArr = { department1, department2, department3 };
		int j2 = 0;
		do {
			System.out.println("Thông tin deparment thứ " + (j2 + 1) + " là: ");
			System.out.println("ID: " + departArr[j2].departmentID);
			System.out.println("Name: " + departArr[j2].departmentName);
			j2++;
		} while (j2 < departArr.length);

//		Question 16-12:
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("question 17-12:--------Chỉ in ra thông tin 2 department đầu tiên---------");
		Department[] departArr1 = { department1, department2, department3 };
		int j3 = 0;
		do {
			System.out.println("Thông tin deparment thứ " + (j3 + 1) + " là: ");
			System.out.println("ID: " + departArr1[j3].departmentID);
			System.out.println("Name: " + departArr1[j3].departmentName);
			j3++;
		} while (j3 < 2);

//		Question 13:
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out
				.println("question 17-13:--------In ra thông tin tất cả các account ngoại trừ account thứ 2---------");
		Account[] arrAccou1 = { account1, account2, account3 };
		int j4 = 0;
		do {
			if (j4 != 1) {
				System.out.println("Thông tin account thứ " + (j4 + 1) + " là: ");
				System.out.println("Email: " + arrAccou1[j4].email);
				System.out.println("Full name: " + arrAccou1[j4].fullName);
				System.out.println("Phòng ban: " + arrAccou1[j4].department.departmentName);
			}
			j4++;
		} while (j4 < arrAccou1.length);

//		Question 17-14:
//		In ra thông tin tất cả các account có id < 4
		System.out.println("question 17-14:--------In ra thông tin tất cả các account có id < 4---------");
		Account[] arrAccou2 = { account1, account2, account3, account4, account5 };
		int j5 = 0;
		do {
			if (arrAccou2[j5].accountID < 4) {
				System.out.println("Thông tin account thứ " + (j5 + 1) + " là: ");
				System.out.println("Email: " + arrAccou2[j5].email);
				System.out.println("Full name: " + arrAccou2[j5].fullName);
				System.out.println("Phòng ban: " + arrAccou2[j5].department.departmentName);
			}
			j5++;
		} while (j5 < arrAccou2.length);

//	Question 17-15:
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("question 17-15:--------In ra các số chẵn nhỏ hơn hoặc bằng 20---------");
		int j6 = 0;
		do {
			if (j6 % 2 == 0) {
				System.out.println(j6 + " ");
			}
			j6++;
		} while (j6 <= 20);

	}

}
