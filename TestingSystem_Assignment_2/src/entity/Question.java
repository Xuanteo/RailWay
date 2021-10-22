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

	public int questionID;

	public String content;

	public CategoryQuestion categoryQuestion;

	public TypeQuestion typeQuestion;

	public Account creator;

	public LocalDate createDate;

	public Exam[] exams;

	public Question() {
		super();
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
