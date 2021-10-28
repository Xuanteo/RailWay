package backend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Position;

public class Exercise1_Constructor {
//	Question 1:
//		Tạo constructor cho department:
//		a) Không có parameters
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public void question1() {
		Department department = new Department();
		Department department2 = new Department("Sale");
	}
//	Question 2:
//		Tạo constructor cho Account:
//		a) Không có parameters
//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
//		d) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, createDate
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public void question2() {
		Account acc = new Account();
		Account acc2 = new Account(2, "email2", "username2", "fullname2");
		Position pos3 = new Position();
		Account acc3 = new Account(3, "email3", "username3", "fullname3",
		pos3);
		System.out.println(acc3.getCreateDate());
		Position pos4 = new Position();
		Account acc4 = new Account(3, "email3", "username3", "fullname3",
		pos4, LocalDate.of(2021, 03, 17));
	}
	
	
}
