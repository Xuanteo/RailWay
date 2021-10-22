package entity;

import entity.enumerate.TypeName;
/**
 * Table 6: TypeQuestion
 * TypeID: định danh của loại câu hỏi (auto increment)
 * TypeName: tên của loại câu hỏi (Essay, Multiple-Choice)
 * @author PTXUAN
 *
 */
public class TypeQuestion {

	private int typeID;

	private TypeName typeName;

	public TypeQuestion() {
		super();
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
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
