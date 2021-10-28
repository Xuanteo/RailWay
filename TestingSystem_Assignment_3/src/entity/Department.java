package entity;

import java.util.Comparator;

/**
 * Table 1:Department DepartmentID: định danh của phòng ban (auto increment)
 * DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)
 * 
 * @author PTXUAN
 *
 */
public class Department implements Comparator<Department>{

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Department department = (Department) obj;
		if (departmentName.equals(department.departmentName)) {
			return true;
		}
		return false;
	}
	// compareto so sánh 2 chuỗi theo thứ tự từ điển. chuỗi 1> chuỗi 2 trả về số dương còn không trả về số âm.
	@Override
	public int compare(Department o1, Department o2) {
		return o1.departmentName.compareTo(o2.departmentName);
	}
}
