public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
    }

    public String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        return "HAPPY";
    }

    public String analyzeMoodAgain() {
        return analyzeMood(this.message);
    }
}