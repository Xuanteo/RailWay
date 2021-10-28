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

	private int accountID;

	private String email;

	private String username;

	private String fullName;

	private Department department;

	private Position position;

	private LocalDate createDate;

	private Group[] groups;

	public Account() {
		super();
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Account(int accountID, String email, String username, String fullName) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
	}

	public Account(int accountID, String email, String username, String fullName, Department department,
			Position position) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = LocalDate.now();

	}

	public Account(int accountID, String email, String username, String fullName, Position position,
			LocalDate createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
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
