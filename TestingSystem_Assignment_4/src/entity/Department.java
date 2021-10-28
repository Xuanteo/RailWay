package entity;

/**
 * Table 1:Department DepartmentID: định danh của phòng ban (auto increment)
 * DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)
 * 
 * @author PTXUAN
 *
 */
public class Department {

	private int departmentID;

	private String departmentName;

	public Department() {
		super();
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(String departmentName) {
		super();
		this.departmentID = 0;
		this.departmentName = departmentName;
	}

	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

}
