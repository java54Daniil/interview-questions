package telran.interviews.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.interviews.InterviewQuestions.*;
class InterviewQuestionsTest {

	@Test
	void displayOccurencesTest() {
		String[] strings = {"b","a","bb","aa","lmn","aa","lmn","lmn","bb"};
		//Should be displayed out the following
		displayOccurences(strings);
		
	}

}
