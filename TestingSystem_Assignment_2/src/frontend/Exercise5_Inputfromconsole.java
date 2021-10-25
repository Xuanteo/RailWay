package frontend;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.enumerate.PositionName;

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
	@SuppressWarnings("resource")
	private static void question11() {

		System.out.println("Viết chương trình thực hiện theo flow: ");
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
			System.out.println(
					"Mời bạn nhập vào chức năng: 1. Tạo Account, 2. Tạo department, 3.Add Group vào Account, 4.Thêm account vào 1 nhóm ngẫu nhiên");
			choose = sc.nextInt();
			if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {
				switch (choose) {
				case 1:
					question5();
					break;
				case 2:
					question6();
					break;
				case 3:
					question9();
					break;
				case 4:
					addAccountToRandomGroup();
					break;
				}
				System.out.println(
						"Bạn có muốn thực hiện chức năng khác không, Hãy chọn chức năng, chọn 0 để thoát chương trình");
				int callback = sc.nextInt();
				if (callback == 0) {
					System.out.println("Bạn đã đăng xuất !!!");
					return;
				}
			} else {
				System.out.println("Nhập lại");
			}
		}
	}

//	Bước 3:
//	Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//	Bước 4:
//	Thêm account vào group chương trình vừa chọn ngẫu
//	nhiên
	@SuppressWarnings("resource")
	private static void addAccountToRandomGroup() {
		System.out.println("Viết chương trình thực hiện theo flow: ");
		Scanner sc = new Scanner(System.in);
		// Tạo group:
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "VTIgroup1";
		group1.createDate = LocalDate.of(2021, 10, 24);
		Group group2 = new Group();
		group2.groupID = 1;
		group2.groupName = "VTIgroup2";
		group2.createDate = LocalDate.of(2021, 10, 23);
		Group group3 = new Group();
		group3.groupID = 1;
		group3.groupName = "VTIgroup3";
		group3.createDate = LocalDate.now();
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
		Group[] groupArr = { group1, group2, group3 };
		// Bước 1:
		// In ra tên các usernames của user cho người dùng xem
		System.out.println("In ra các usernames của user trên hệ thống: ");
		for (int i = 0; i < accArr.length; i++) {
			System.out.println("Username thứ " + (i + 1) + " là: " + accArr[i].username);
		}
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
		System.out.println("Người dùng nhập vào Username");
		String username = sc.next();
		System.out.println("Thông tin user nhập vào là: " + username);
//		Bước 3:
//		In ra tên các group cho người dùng xem
		System.out.println("Danh sách các group trên hệ thống: ");
		for (int i = 0; i < groupArr.length; i++) {
			System.out.println("Group thứ " + (i + 1) + " là: " + groupArr[i].groupName);
		}
//		Bước 4:
//		Lấy random của group
		System.out.println("Lấy random group cần thêm: ");
		Random random = new Random();
		int indexgroup = random.nextInt(2);

		int indexaccount = -1;
		for (int j = 0; j < accArr.length; j++) {
			if (accArr[j].username.equals(username)) {
				indexaccount = j;
			}
		}
		if (indexaccount < 0) {
			System.out.println("Kiểm tra lại thông tin nhập vào, không có Account hoặc Group trên hệ thống.");
		} else {
			for (int j = 0; j < accArr.length; j++) {
				if (accArr[j].username.equals(username)) {
					Group[] groudadd = { groupArr[indexgroup] };
					accArr[j].groups = groudadd;
					System.out.println("Bạn vừa add group: " + accArr[indexaccount].groups[0].groupName
							+ " cho Account: " + accArr[indexaccount].username);
				}
			}
		}
	}

	// Question 10: Tiếp tục Question 8 và Question 9
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//	account
//	Bổ sung thêm Bước 3 của Question 8 như sau:
//	Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//	text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//	không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//	dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//	kết thúc chương trình)
	@SuppressWarnings("resource")
	private static void question10() {
		System.out.println("Viết chương trình thực hiện theo flow: ");
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
			System.out
					.println("Mời bạn nhập vào chức năng: 1. Tạo Account, 2. Tạo department, 3.Add Group vào Account");
			choose = sc.nextInt();
			if (choose == 1 || choose == 2 || choose == 3) {
				switch (choose) {
				case 1:
					question5();
					break;
				case 2:
					question6();
					break;
				case 3:
					question9();
					break;
				}
				System.out.println(
						"Bạn có muốn thực hiện chức năng khác không, Hãy chọn chức năng, chọn 0 để thoát chương trình");
				int callback = sc.nextInt();
				if (callback == 0) {
					System.out.println("Bạn đã đăng xuất !!!");
					return;
				}
			} else {
				System.out.println("Nhập lại");
			}
		}
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
	@SuppressWarnings("resource")
	private static void question9() {
		System.out.println("Viết chương trình thực hiện theo flow: ");
		Scanner sc = new Scanner(System.in);
		// Tạo group:
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "VTIgroup1";
		group1.createDate = LocalDate.of(2021, 10, 24);
		Group group2 = new Group();
		group2.groupID = 1;
		group2.groupName = "VTIgroup2";
		group2.createDate = LocalDate.of(2021, 10, 23);
		Group group3 = new Group();
		group3.groupID = 1;
		group3.groupName = "VTIgroup3";
		group3.createDate = LocalDate.now();
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
		Group[] groupArr = { group1, group2, group3 };
		// Bước 1:
		// In ra tên các usernames của user cho người dùng xem
		System.out.println("In ra các usernames của user trên hệ thống: ");
		for (int i = 0; i < accArr.length; i++) {
			System.out.println("Username thứ " + (i + 1) + " là: " + accArr[i].username);
		}
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
		System.out.println("Người dùng nhập vào Username");
		String username = sc.next();
		System.out.println("Thông tin user nhập vào là: " + username);
//		Bước 3:
//		In ra tên các group cho người dùng xem
		System.out.println("Danh sách các group trên hệ thống: ");
		for (int i = 0; i < groupArr.length; i++) {
			System.out.println("Group thứ " + (i + 1) + " là: " + groupArr[i].groupName);
		}
//		Bước 4:
//		Yêu cầu người dùng nhập vào tên của group
		System.out.println("Nhập vào tên group cần thêm: ");
		String groupname = sc.next();
		System.out.println("Thông tin tên group vùa nhập là: " + groupname);
//		Bước 5:
//		Dựa vào username và tên của group người dùng vừa chọn, hãy
//		thêm account vào group đó .
		int indexgroup = -1;
		for (int i = 0; i < groupArr.length; i++) {
			if (groupArr[i].groupName.equals(groupname)) {
				indexgroup = i;
			}
		}
		int indexaccount = -1;
		for (int j = 0; j < accArr.length; j++) {
			if (accArr[j].username.equals(username)) {
				indexaccount = j;
			}
		}
		if (indexgroup < 0 || indexaccount < 0) {
			System.out.println("Kiểm tra lại thông tin nhập vào, không có Account hoặc Group trên hệ thống.");
		} else {
			for (int j = 0; j < accArr.length; j++) {
				if (accArr[j].username.equals(username)) {
					Group[] groudadd = { groupArr[indexgroup] };
					accArr[j].groups = groudadd;
					System.out.println("Bạn vừa add group: " + accArr[indexaccount].groups[0].groupName
							+ " cho Account: " + accArr[indexaccount].username);
				}
			}
		}
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
	@SuppressWarnings("resource")
	private static void question8() {
		System.out.println("Viết chương trình thực hiện theo flow: ");
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
			System.out.println("Mời bạn nhập vào chức năng: 1. Tạo Account, 2. Tạo department");
			choose = sc.nextInt();
			if (choose == 1 || choose == 2) {
				switch (choose) {
				case 1:
					question5();
					break;
				case 2:
					question6();
					break;

				default:
					break;
				}
			} else {
				System.out.println("Nhập lại");
			}
		}

	}

//	Question 7:
//		Nhập số chẵn từ console
	@SuppressWarnings("resource")
	private static void question7() {
		System.out.println("Nhập vào 1 số chẵn: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập vào 1 số chẵn: ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Số chẵn nhập vào là: " + a);
		} else {
			System.out.println("Nhập sai, đây không phải là số chẵn");
		}
	}

//	Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
	@SuppressWarnings("resource")
	private static void question6() {
		System.out.println("Mời bạn nhập vào thông tin Department: ");
		Scanner sc = new Scanner(System.in);
		Department dep = new Department();
		System.out.println("Nhập vào ID");
		dep.departmentID = sc.nextInt();
		System.out.println("Nhập vào tên phòng ban: ");
		dep.departmentName = sc.next();

		System.out.println(
				"Thông tin phòng ban cần tạo, ID: " + dep.departmentID + " DepartmentName: " + dep.departmentName);

	}

//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
	@SuppressWarnings("resource")
	private static void question5() {
		System.out.println("Mời bạn nhập vào thông tin account: ");
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Nhập vào ID: ");
		account.accountID = sc.nextInt();
		System.out.println("Nhập vào Email: ");
		account.email = sc.next();
		System.out.println("Nhập vào fullname: ");
		account.fullName = sc.next();
		System.out.println("Nhập vào username: ");
		account.username = sc.next();
		System.out.println("Nhập vào Position: ");
		System.out.println("Nhập vào các số từ 1 đến 4 tương ứng 1.Dev, 2.Test, 3.Scrum_Mater, 4.PM");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			Position pos1 = new Position();
			pos1.positionName = PositionName.Dev;
			account.position = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.positionName = PositionName.Test;
			account.position = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.positionName = PositionName.Scrum_Master;
			account.position = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.positionName = PositionName.PM;
			account.position = pos4;
			break;
		default:
			break;
		}

		System.out.println(
				"Thông tin account vừa nhập, ID: " + account.accountID + " Email: " + account.email + " fullname: "
						+ account.fullName + " username:" + account.username + " Position: " + account.position);
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
