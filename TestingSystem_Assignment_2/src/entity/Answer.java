package entity;

/**
 * Table 9: Answer AnswerID: định danh của câu trả lời (auto increment) Content:
 * nội dung của câu trả lời QuestionID: định danh của câu hỏi isCorrect: câu trả
 * lời này đúng hay sai
 * 
 * @author PTXUAN
 *
 */
public class Answer {

	public int answerID;

	public String content;

	public Question question;

	public Boolean isCorrect;

	public Answer() {
		super();
	}

	public Answer(int answerID, String content, Question question, Boolean isCorrect) {
		super();
		this.answerID = answerID;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Answer [answerID=" + answerID + ", content=" + content + ", question=" + question + ", isCorrect="
				+ isCorrect + "]";
	}

}
