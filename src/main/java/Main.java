public class Main {

    public static void main(String[] args) throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzerOne = new MoodAnalyzer(null);
        String nullMood = moodAnalyzerOne.analyzeMoodAgain();
        System.out.println(nullMood);
    }
}