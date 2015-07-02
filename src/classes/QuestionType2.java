package classes;

import java.util.*;

// Multiple choice question
public class QuestionType2 extends Question {
  private String CorrectAnswer;
  private String[] AlternativeAnswers;
  
  public QuestionType2(String questionText, String correctAnswer, String[] alternativeAnswers) {
    super(questionText);
    CorrectAnswer = correctAnswer;
    AlternativeAnswers = alternativeAnswers;
  }
  
  public String getCorrectAnswer() {
    return CorrectAnswer;
  }
  
  public String[] getPossibleAnswers() {
    String[] PossibleAnswers = new String[AlternativeAnswers.length + 1];
    PossibleAnswers[0] = CorrectAnswer;
    for (int i=0; i<AlternativeAnswers.length; i++) {
      PossibleAnswers[i+1] = AlternativeAnswers[i];
    }
    
    // Shuffle answers
    Collections.shuffle(Arrays.asList(PossibleAnswers));
    
    return PossibleAnswers;
  }
}
