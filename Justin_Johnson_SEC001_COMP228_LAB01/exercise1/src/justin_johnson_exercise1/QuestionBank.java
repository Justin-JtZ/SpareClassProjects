package justin_johnson_exercise1;

//Assignment 2
//Exercise #1

import java.security.SecureRandom;

public class QuestionBank{

	private char response;
	private int questionNo;
	private int questionCount = 0;
	private int rightCount = 0;
	private int attemptCount = 0;
	private double percentage = 0.0;
	
	//Generate random numbers for lottery system
	private static final SecureRandom randomNumbers = new SecureRandom();

public void simulateQuestion() {

	questionNo = 1 + randomNumbers.nextInt(5);
	
	if (questionNo == 1) {			//Print Question 1
	System.out.println("Moore's Law states:");
	System.out.println("A. Every year, computers have become more important in everyday life");
	System.out.println("B. Every year, computers double in capacity");		//Correct Answer
	System.out.println("C. Every year, you will need a new computer");
	System.out.println("D. Every year, computers update their operating systems");
	}

	if (questionNo == 2) {			//Print Question 2
	System.out.println("ASCII stands for:");
	System.out.println("A. American Standards for Computer Internet Intelligence");
	System.out.println("B. American Science Centre for International Intelligence");
	System.out.println("C. American Strawberry Cake with Icing Included");
	System.out.println("D. American Standard Code for Information Exchange");	//Correct Answer
	}
	
	if (questionNo == 3) {			//Print Question 3
	System.out.println("Three general types of languages are:");
	System.out.println("A. Machine Language, High-Level Language, Assembly Language");	//Correct Answer
	System.out.println("B. High-Level Language, Code Language, Assembly Language");
	System.out.println("C. Foreign Language, Machine Language, High-Level Language");
	System.out.println("D. Machine Language, Assembly Language, New Language");
	}
	
	if (questionNo == 4) {			//Print Question 4
	System.out.println("Which of these keywords does not come before Main in Java?");
	System.out.println("A. Public");
	System.out.println("B. Void");
	System.out.println("C. Bool");			//Correct Answer
	System.out.println("D. Static");
	}

	if (questionNo == 5) {			//Print Question 5
	System.out.println("What is the proper syntax to print to the screen?");
	System.out.println("System.Out");		//Correct Answer
	System.out.println("System.In");
	System.out.println("System.Output");
	System.out.println("System.PrintLn");
	}

}


public void checkAnswer() {

	if(questionNo == 1 && response == 'B'){
		rightCount++;
		attemptCount++;
		questionCount++;
		simulateQuestion();
	}
	else if(questionNo == 2 && response == 'D'){
		rightCount++;
		attemptCount++;
		questionCount++;
		simulateQuestion();
	}
	else if(questionNo == 3 && response == 'A'){
		rightCount++;
		attemptCount++;
		questionCount++;
		simulateQuestion();
	}
	else if(questionNo == 4 && response == 'C'){
		rightCount++;
		attemptCount++;
		questionCount++;
		simulateQuestion();
	}
	else if(questionNo == 5 && response == 'A'){
		rightCount++;
		attemptCount++;
		questionCount++;
		simulateQuestion();
	}
	else {
		attemptCount++;
		generateMessage
	}
	
}

void generateMessage(bool isCorrect) {
    if(isCorrect == true)
    {
        switch(randomNumbers.nextInt(4)){
        case 1:
            System.out.println("Excellent!");
            break;
        case 2:
            System.out.println("Good!");
            break;
        case 3:
            System.out.println("Keep up the good work!");
            break;
        case 4:
            System.out.println("Nice Work!");
            break;
        default:
            break;
        }
    }
    if(isCorrect == false){
       switch(randomNumbers.nextInt(4)){
        case 1:
            System.out.println("No. Please try again");
            break;
        case 2:
            System.out.println("Wrong. Try once more");
            break;
        case 3:
            System.out.println("Don't give up!");
            break;
        case 4:
            System.out.println("No. Keep trying..");
            break;
        default:
            break;
        } 
    }
}

public char inputAnswer () {
	System.out.println(" ");
	
}

percentage = rightCount/attemptCount;
if (questionCount == 5) {
	System.out.printf(" Your Total Score is %f", percentage);
}

}
