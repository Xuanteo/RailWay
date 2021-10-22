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

	public int categoryID;

	public CategoryName categoryName;

	public CategoryQuestion() {
		super();
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
