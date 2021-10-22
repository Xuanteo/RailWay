package entity;

/**
 * Table 1:Department DepartmentID: định danh của phòng ban (auto increment)
 * DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)
 * 
 * @author PTXUAN
 *
 */
public class Department {

	public int departmentID;

	public String departmentName;

	public Department() {
		super();
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
