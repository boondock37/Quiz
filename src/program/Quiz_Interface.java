package program;

import classes.*;
import data.*;
import java.util.Scanner;

public class Quiz_Interface {
	public static void main(String[] args){
     	
     	Login_Tester loginTester = new Login_Tester();
		Scanner scanner = new Scanner(System.in);
     
     	System.out.print("Enter your Username: ");
		String username = scanner.next();
     
     	System.out.print("Enter your Password: ");
		String password = scanner.next();
     
     	User player = loginTester.getUser(username, password);
     
     	if (player == null) {     
     		System.out.print("Invalid login");
      }
     	else {
     		System.out.print("Welcome back " + player.getFullName());  
     		Quiz_Tester quizTester = new Quiz_Tester();
        
        	Question[] quizQuestions = quizTester.getQuestions();
        	
        	int playerScore = 0;
        	
        	for (int i=0; i<quizQuestions.length; i++) {
         	Question currentQuestion = quizQuestions[i];
     			System.out.println("Question " + (i+1) + ": " + currentQuestion.getQuestionText());
           
           	if (currentQuestion instanceof QuestionType2) {
              // If this is a multiple choice question, display possible answers
              QuestionType2 multiChoiceQuestion = (QuestionType2)currentQuestion;
              String[] PossibleAnswers = multiChoiceQuestion.getPossibleAnswers();
              
              for (int j=0; j<PossibleAnswers.length; j++) {            
                 System.out.println(PossibleAnswers[j]); 
              }
              
            }
           	else if (currentQuestion instanceof QuestionType3) {
     				System.out.println("true / false"); 
           	}
           
     			System.out.print("Answer: ");
				String answer = scanner.next();
           
           	if (currentQuestion.isCorrectAnswer(answer)) {
                playerScore++;
                System.out.println("Correct!");    
            }
           	else {   
                System.out.println("Wrong - the correct answer is " + currentQuestion.getCorrectAnswer());   
            }
           
				System.out.println(""); 
           
        	}
        
        	System.out.println("Final Score: " + playerScore + " out of " + quizQuestions.length);        
     	}
   }
}
