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

	private int positionID;

	private PositionName positionName;

	public Position() {
		super();
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
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
