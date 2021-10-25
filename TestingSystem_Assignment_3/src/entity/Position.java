package entity;

import entity.enumerate.PositionName;

/**
 * Table 2: Position PositionID: định danh của chức vụ (auto increment)
 * PositionName: tên chức vụ (Dev, Test, Scrum Master, PM)
 * 
 * @author PTXUAN
 *
 */
public class Position {

	public int positionID;

	public PositionName positionName;

	public Position() {
		super();
	}

	public Position(int positionID, PositionName positionName) {
		super();
		this.positionID = positionID;
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionName=" + positionName + "]";
	}

}
