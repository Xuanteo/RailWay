package entity;

import entity.enumerate.CategoryName;

/**
 * Table 7: CategoryQuestion CategoryID: định danh của chủ đề câu hỏi (auto
 * increment) CategoryName: tên của chủ đề câu hỏi (Java, .NET, SQL, Postman,
 * Ruby,…)
 * 
 * @author PTXUAN
 *
 */
public class CategoryQuestion {

	private int categoryID;

	private CategoryName categoryName;

	public CategoryQuestion() {
		super();
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public CategoryName getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(CategoryName categoryName) {
		this.categoryName = categoryName;
	}

	public CategoryQuestion(int categoryID, CategoryName categoryName) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryQuestion [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}

}
