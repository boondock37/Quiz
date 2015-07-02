package classes;

// Simple text input question
public class QuestionType1 extends Question {
  private String CorrectAnswer;
  
  public QuestionType1(String questionText, String correctAnswer) {
    super(questionText);
    CorrectAnswer = correctAnswer;
  }
  
  public String getCorrectAnswer() {
    return CorrectAnswer;
  }
}
