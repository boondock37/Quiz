package data;

import classes.*;
import java.util.ArrayList;
import java.util.Random;

public class Quiz_Tester {
  private final int QUESTIONS_PER_QUIZ = 5;
  private Question[] QuestionBank;
  
  public Quiz_Tester() {
    QuestionBank = new Question[10]; 
    
    // Text Questions
    Question q1 = new QuestionType1("What is the capital of France?", "Paris");
    QuestionBank[0] = q1;
    Question q2 = new QuestionType1("What is the capital of England?", "London");
    QuestionBank[1] = q2;
    Question q3 = new QuestionType1("What is the capital of Japan?", "Tokyo");
    QuestionBank[2] = q3;
    Question q4 = new QuestionType1("What is the capital of Germany?", "Berlin");
    QuestionBank[3] = q4;
    
    // Multiple Choice
    Question q5 = new QuestionType2("What is the capital of Spain?", "Madrid", new String[] {"Barcelona", "Valencia"});
    QuestionBank[4] = q5;
    Question q6 = new QuestionType2("What is the capital of Italy?", "Rome", new String[] {"Florence", "Pisa", "Milan"});
    QuestionBank[5] = q6;
    Question q7 = new QuestionType2("What is the capital of the USA?", "Washington DC", new String[] {"New York", "California", "Boston"});
    QuestionBank[6] = q7;
    
    // True / False
    Question q8 = new QuestionType3("Moscow is the capital of Russia", true);
    QuestionBank[7] = q8;
    Question q9 = new QuestionType3("Glasgow is the capital of Scotland", false);
    QuestionBank[8] = q9;
    Question q10 = new QuestionType3("Lisbon is the capital of Portugal", true);
    QuestionBank[9] = q10;
  }
  
  public Question[] getQuestions() {
    // If the quiz has more questions than available, return all questions
    if (QUESTIONS_PER_QUIZ > QuestionBank.length) {
      return QuestionBank;
    }
    else {
    	Random rnd = new Random();
      ArrayList<Integer> selectedIndices = new ArrayList<Integer>();
      
      boolean finished = false;
      
      // Pick QUESTIONS_PER_QUIZ random numbers in the range of 0 to QuestionBank.length
      while (!finished) {
        int randomIndex = rnd.nextInt(QuestionBank.length);
        if (!selectedIndices.contains(randomIndex)) {
          selectedIndices.add(randomIndex);
        }
        finished = (selectedIndices.size() == QUESTIONS_PER_QUIZ);
      }
      
      // Fetch the questions; add to the output array
      Question[] quizQuestions = new Question[QUESTIONS_PER_QUIZ];
      for (int i=0; i<QUESTIONS_PER_QUIZ; i++) {
        quizQuestions[0] = QuestionBank[selectedIndices.get(i)];
      }
      return quizQuestions;
    }
  }
}
