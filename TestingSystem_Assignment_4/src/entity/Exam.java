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

	private int examID;

	private String code;

	private String title;

	private CategoryQuestion[] categoryQuestion;

	private int duration;

	private Account creatorID;

	private LocalDate createDate;

	private Question[] questions;

	public Exam() {
		super();
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion[] getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion[] categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Account getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(Account creatorID) {
		this.creatorID = creatorID;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
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
