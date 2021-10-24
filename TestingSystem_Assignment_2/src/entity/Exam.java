package entity;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Table 10: Exam ExamID: định danh của đề thi (auto increment) Code: mã đề thi
 * Title: tiêu đề của đề thi CategoryID: định danh của chủ đề thi Duration: thời
 * gian thi CreatorID: id của người tạo đề thi CreateDate: ngày tạo đề thi
 * 
 * @author PTXUAN
 *
 */
public class Exam {

	public int examID;

	public String code;

	public String title;

	public CategoryQuestion[] categoryQuestion;

	public int duration;

	public Account creatorID;

	public LocalDate  createDate;

	public Question[] questions;

	public Exam() {
		super();
	}

	public Exam(int examID, String code, String title, CategoryQuestion[] categoryQuestion, int duration,
			Account creatorID, LocalDate createDate, Question[] questions) {
		super();
		this.examID = examID;
		this.code = code;
		this.title = title;
		this.categoryQuestion = categoryQuestion;
		this.duration = duration;
		this.creatorID = creatorID;
		this.createDate = createDate;
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", code=" + code + ", title=" + title + ", categoryQuestion="
				+ Arrays.toString(categoryQuestion) + ", duration=" + duration + ", creatorID=" + creatorID
				+ ", createDate=" + createDate + ", questions=" + Arrays.toString(questions) + "]";
	}

}
