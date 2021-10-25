package entity;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Table 3: Account AccountID: định danh của User (auto increment) Email:
 * Username: FullName: DepartmentID: phòng ban của user trong hệ thống
 * PositionID: chức vụ của User CreateDate: ngày tạo tài khoản Group[] để lưu
 * các nhóm mà acc tham gia
 * 
 * @author PTXUAN
 *
 */
public class Account {

	public int accountID;

	public String email;

	public String username;

	public String fullName;

	public Department department;

	public Position position;

	public LocalDate createDate;

	public Group[] groups;

	public Account() {
		super();
	}

	public Account(int accountID, String email, String username, String fullName, Department department,
			Position position, LocalDate createDate, Group[] groups) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}

	public Account(int accountID, String email, String username, String fullName, Department department,
			Position position, LocalDate createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;

	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

}
