package classes;

// True / False question
public class QuestionType3 extends Question {
  private boolean CorrectAnswer;
  
  public QuestionType3(String questionText, boolean correctAnswer) {
    super(questionText);
    CorrectAnswer = correctAnswer;
  }
  
  // Override parent method
  public boolean isCorrectAnswer(String answer) {
    return Boolean.valueOf(answer) == CorrectAnswer;
  }
  
  // Override parent method
  public String getCorrectAnswer() {
    return String.valueOf(CorrectAnswer);
  }
}
