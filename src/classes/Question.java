package classes;

public class Question {
  private String QuestionText;
  
  public Question(String questionText) {
    QuestionText = questionText;
  }
  
  public String getQuestionText() {
    return QuestionText;
  }
  
  public String getCorrectAnswer() {
    // Overridden in subclasses
    return "";
  }
  
  public boolean isCorrectAnswer(String answer) {
    // Case insensitive
    return answer.toLowerCase() == getCorrectAnswer().toLowerCase();
  }
}
