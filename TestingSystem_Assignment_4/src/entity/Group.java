package entity;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Table 4: Group GroupID: định danh của nhóm (auto increment) GroupName: tên
 * nhóm CreatorID: id của người tạo group CreateDate: ngày tạo group Account[]
 * để lưu tất cả các Account có trong group
 * 
 * @author PTXUAN
 *
 */
public class Group {

	private int groupID;

	private String groupName;

	private Account creator;

	private LocalDate createDate;

	private Account[] accounts;

	public Group() {
		super();
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Group(int groupID, String groupName, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group(int groupID, String groupName, LocalDate createDate) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
