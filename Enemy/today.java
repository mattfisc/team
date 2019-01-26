package myMain;

public class today {

	public static void main(String[] args) {
		// objct of engine
		QuizEngine quiz = new QuizEngine();
		
		
		// add three questions
		Question q1 = new Question("What is my fav color", "green");
		Question q2 = new Question("What is the color of the floor", "grey");
		Question q3 = new Question("What is above you?", "ceiling");
		
		//add questions
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		quiz.addQuestion(q3);

		
	}

}
