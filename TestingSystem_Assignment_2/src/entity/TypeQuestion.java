package entity;

import entity.enumerate.TypeName;

/**
 * Table 6: TypeQuestion TypeID: định danh của loại câu hỏi (auto increment)
 * TypeName: tên của loại câu hỏi (Essay, Multiple-Choice)
 * 
 * @author PTXUAN
 *
 */
public class TypeQuestion {

	public int typeID;

	public TypeName typeName;

	public TypeQuestion() {
		super();
	}

	public TypeQuestion(int typeID, TypeName typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TypeQuestion [typeID=" + typeID + ", typeName=" + typeName + "]";
	}

}
