public class Main {

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzerOne = new MoodAnalyzer(null);
        String nullMood = moodAnalyzerOne.analyzeMoodAgain();
        System.out.println(nullMood);
    }
}