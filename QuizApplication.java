import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which company developed Java?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. What is the size of int in Java?",
            "4. Which collection stores unique values?",
            "5. Which loop executes at least once?",
            "6. What does JVM stand for?",
            "7. Which operator is used for comparison?",
            "8. Which package contains Scanner class?",
            "9. Which method is the entry point of Java program?",
            "10. Which keyword is used to create an object?"
        };

        String[][] options = {
            {"A. Google", "B. Microsoft", "C. Sun Microsystems", "D. Apple"},
            {"A. implement", "B. extends", "C. super", "D. inherit"},
            {"A. 2 Bytes", "B. 4 Bytes", "C. 8 Bytes", "D. 16 Bytes"},
            {"A. ArrayList", "B. Vector", "C. HashSet", "D. LinkedList"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. Java Virtual Machine", "B. Java Variable Method", "C. Java Vendor Machine", "D. None"},
            {"A. =", "B. ==", "C. +", "D. %"},
            {"A. java.util", "B. java.io", "C. java.lang", "D. java.net"},
            {"A. start()", "B. run()", "C. main()", "D. execute()"},
            {"A. new", "B. create", "C. object", "D. class"}
        };

        char[] answers = {'C', 'B', 'B', 'C', 'C', 'A', 'B', 'A', 'C', 'A'};

        int score = 0;

        System.out.println("==================================");
        System.out.println("      JAVA QUIZ APPLICATION");
        System.out.println("==================================");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name + "!");
        System.out.println("Quiz Started...\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter Answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i] + "\n");
            }
        }

        double percentage = (score * 100.0) / questions.length;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n==================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("==================================");
        System.out.println("Name           : " + name);
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers  : " + (questions.length - score));
        System.out.println("Percentage     : " + percentage + "%");
        System.out.println("Grade          : " + grade);
        System.out.println("==================================");

        sc.close();
    }
}