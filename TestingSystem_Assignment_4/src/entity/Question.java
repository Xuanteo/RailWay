package entity;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Table 8: Question QuestionID: định danh của câu hỏi (auto increment) Content:
 * nội dung của câu hỏi CategoryID: định danh của chủ đề câu hỏi TypeID: định
 * danh của loại câu hỏi CreatorID: id của người tạo câu hỏi CreateDate: ngày
 * tạo câu hỏi Exam[] các đề thi có câu hỏi.
 * 
 * @author PTXUAN
 *
 */
public class Question {

	private int questionID;

	private String content;

	private CategoryQuestion categoryQuestion;

	private TypeQuestion typeQuestion;

	private Account creator;

	private LocalDate createDate;

	private Exam[] exams;

	public Question() {
		super();
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public Question(int questionID, String content, CategoryQuestion categoryQuestion, TypeQuestion typeQuestion,
			Account creator, LocalDate createDate, Exam[] exams) {
		super();
		this.questionID = questionID;
		this.content = content;
		this.categoryQuestion = categoryQuestion;
		this.typeQuestion = typeQuestion;
		this.creator = creator;
		this.createDate = createDate;
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", content=" + content + ", categoryQuestion=" + categoryQuestion
				+ ", typeQuestion=" + typeQuestion + ", creator=" + creator + ", createDate=" + createDate + ", exams="
				+ Arrays.toString(exams) + "]";
	}

}
