package frontend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.enumerate.PositionName;

public class Program {

	public static void main(String[] args) {

		// Khởi tạo department:
		Department department1 = new Department(1, "Sale");
		Department department2 = new Department(2, "Marketing");
		Department department3 = new Department(3, "BOB");

		System.out.println(department1);
		System.out.println(department2);
		System.out.println(department3);

		// Khởi tạo Position:
		Position position1 = new Position(1, PositionName.Dev);
		Position position2 = new Position(2, PositionName.Scrum_Master);
		Position position3 = new Position(3, PositionName.PM);

		System.out.println(position1);
		System.out.println(position2);
		System.out.println(position3);

		// Khởi tạo Group
		Group group1 = new Group(1, "Development", LocalDate.now());
		Group group2 = new Group(2, "Group3", LocalDate.now());
		Group group3 = new Group(3, "VTI", LocalDate.now());

		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group3);

		// Khởi tạo Account:
		Group[] groupAcc1 = { group1, group2 };
		Group[] groupAcc2 = { group2, group3 };
		Account account1 = new Account(1, "email1@gmai.com", "email1", "fullname1", department3, position3,
				LocalDate.now(), groupAcc1);
		Account account2 = new Account(2, "email2@gmai.com", "email2", "fullname2", department2, position2,
				LocalDate.now(), groupAcc2);
		System.out.println(account1);
		System.out.println(account2);

	}
}
