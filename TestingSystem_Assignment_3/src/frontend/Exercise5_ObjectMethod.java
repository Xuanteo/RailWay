package frontend;

import java.util.Scanner;

import entity.Department;

public class Exercise5_ObjectMethod {
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

		default:
			break;
		}
		sc.close();

	}

//	Question 8: Khởi tạo 1 array học sinh gồm 5 học sinh, sau đó in ra danh sách học sinh được
//	sắp xếp theo tên
//	VD:
//	Nguyễn Văn A
//	Trần Hưng Đạo
//	Trần Văn Nam
//	Nguyễn Văn Toàn
	private static void question8() {
		String[] students = { "Nguyễn Văn A", "Nguyễn Văn Toàn", "Trần Văn Nam", "Trần Hưng Đạo" };
		System.out.println("Danh sách học sinh sắp xếp theo tên");
		for (int i = 0; i < students.length; i++) {
			String reverseName = reverseWord1(students[i]);
			for (int j = 0; j < students.length - 1; j++) {
				String reverseCompareName = reverseWord1(students[j]);
				if (reverseName.compareToIgnoreCase(reverseCompareName) < 0) {
					// swap
					String temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		for (String student : students) {
			System.out.println(student);
		}
	}

	private static String reverseWord1(String str) {
		str = str.trim();
		str = str.replaceAll("\\s", " ");
		String[] words = str.split(" ");
		str = "";
		for (int i = words.length - 1; i >= 0; i--) {
			str += words[i] + " ";
		}
		return str.substring(0, str.length() - 1);
	}

	// Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//	sách phòng ban được sắp xếp theo tên
//	VD:
//	Accounting
//	Boss of director
//	Marketing
//	waiting room
//	Sale
	private static void question7() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		System.out.println("Sắp xếp các phòng ban: ");
		// sử dụng 2 vòng lặp:
		// group by
		for (int i = 0; i < departments.length; i++) {
			// Đảo ngược chuỗi kí tự
			String reverseDepartmentname = reverseWord(departments[i].departmentName);
			for (int j = 0; j < departments.length - 1; j++) {
				// đảo ngược chuỗi kí tự.
				String reverseCompareDepartmentName = reverseWord(departments[j].departmentName);
				if (reverseDepartmentname.compareToIgnoreCase(reverseCompareDepartmentName) < 0) {
					// swap đổi chỗ:
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		for (Department department : departments) {
			System.out.println(department);
		}
	}

	private static String reverseWord(String str) {
		str = str.trim();
		str = str.replaceAll("\\s", " ");
		String[] words = str.split(" ");
		str = "";
		for (int i = words.length - 1; i >= 0; i--) {
			str += words[i] + " ";
		}
		return str.substring(0, str.length() - 2);
	}

//	Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//	sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//	VD:
//	Accounting
//	Boss of director
//	Marketing
//	Sale
//	Waiting room
	private static void question6() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		System.out.println("In ra thứ tự phòng ban theo thứ tự tăng dần theo tên");
		// sử dụng 2 vòng for trượt đi để so sánh
		for (int i = 0; i < departments.length; i++) {
			for (int j = 0; j < departments.length - 1; j++) {
				if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) < 0) {
					// swap đổi chỗ 2 thằng
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		printArray(departments);
	}

	private static void printArray(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department);
		}

	}

//	Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//	không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
	private static void question5() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		System.out.println("So sánh 2 phòng ban 1, 2 có bằng nhau không(Bằng nhau khi tên phòng ban bằng nhau):");
		if (department1.equals(department2)) {
			System.out.println("2 phòng ban bằng nhau");
		} else {
			System.out.println("2 phòng ban không bằng nhau");
		}

	}

//	Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
	private static void question4() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		// Kiếm tra phòng ban 1 có tên phòng A hay không.
		if (department1.departmentName.equals("Phòng A")) {
			System.out.println("Có tên phòng A");
		} else {
			System.out.println("Không có tên phòng A");
		}

	}

//	Question 3:
//		In ra địa chỉ của phòng ban thứ 1
	private static void question3() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		// In ra địa chỉ ô nhớ của phòng ban thứ nhất:
		System.out.println("Địa chỉ ô nhớ của phòng ban thứ nhất là: " + department1.hashCode());

	}

//	Question 2:
//		In ra thông tin của tất cả phòng ban (sử dụng toString())
	private static void question2() {
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là: " + departments[i].toString());
		}

	}

//	Question 1:
//		In ra thông tin của phòng ban thứ 1 (sử dụng toString())
	private static void question1() {
		// Tạo phòng ban:
		Department[] departments = new Department[5];
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";
		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Boss of director";
		Department department4 = new Department();
		department4.departmentID = 4;
		department4.departmentName = "Waiting room";
		Department department5 = new Department();
		department5.departmentID = 5;
		department5.departmentName = "Accounting";
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		// In ra thông tin phòng ban thứ 1:
		System.out.println("Thông tin phòng ban thứ 1 là :" + department1.toString());

	}
}
