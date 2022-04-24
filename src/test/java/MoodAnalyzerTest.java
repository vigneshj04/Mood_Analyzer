import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    void givenMood_AnalyseSadMood_ResultShouldMatch() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMood_AnalyseHappyMood_ResultShouldMatch() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenHappyMoodMessage_AnalyseMoodUsingConstructor_ResultShouldMatch() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyzeMoodAgain();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenSadMoodMessage_AnalyseMoodUsingConstructor_ResultShouldMatch() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String mood = moodAnalyzer.analyzeMoodAgain();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenNullMessage_AnalyseMoodWithException_ThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMoodAgain();
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }


    @Test
    void givenEmptyMoodMessage_AnalyseMoodWithException_ThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMoodAgain();
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionTypes.ENTERED_EMPTY, e.types);
        }
    }
}