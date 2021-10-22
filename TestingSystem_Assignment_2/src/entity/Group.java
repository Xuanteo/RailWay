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

	public int groupID;

	public String groupName;

	public Account creator;

	public LocalDate createDate;

	public Account[] accounts;

	public Group() {
		super();
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
