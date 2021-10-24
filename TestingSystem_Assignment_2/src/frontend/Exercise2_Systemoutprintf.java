package frontend;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.enumerate.PositionName;

public class Exercise2_Systemoutprintf {

	public static void main(String[] args) {

//		Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó
		System.out
				.println("Question1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó");
		int a = 5;
		System.out.printf("%d%n", a);

//		Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.println("Question 2: "+
				"Khai báo 1 số nguyên = 100 000 000 in\r\n" + "ra số nguyên đó thành định dạng như sau: 100,000,000");
		int i = 100000000;
		System.out.printf(Locale.US, "%,d%n", i);

//		Question 3:
//			Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//			thực đó chỉ bao gồm 4 số đằng sau

		System.out.println("Question 3: "+
				"Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau");
		float i1 = 5.567098f; 
		
		System.out.printf("%5.4f%n", i1);
		
//		Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân
		System.out.println("Question 4: "+ "Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng ");
		String s = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"" + s + "\" và tôi đang độc thân \n");
		
//		Question 5:
//			Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20s
		System.out.println("Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau: ");
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
//		Question 6:
//			In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//			table (giống trong Database)
		
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
				
				System.out.println("Question 6: theo định dạng table (giống trong Database)");
				Account[] arrAcc = { account1, account2, account3, account4, account5 };
				System.out.println("Thông tin Account: ");
				String leftAlignFormat = "| %-21s | %-21s | %-21s |%n";
				System.out.format("+-----------------------+-----------------------+-----------------------+%n");
				System.out.format("| Email                 | FullName              | Tên Phòng ban         |%n");
				System.out.format("+-----------------------+-----------------------+-----------------------+%n");
				for (Account account : arrAcc) {
					System.out.format(leftAlignFormat,account.email,account.fullName,account.department.departmentName);
				}
				System.out.format("+-----------------------+-----------------------+-----------------------+%n");
	}
}
