
public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
    }

    public String analyzeMood(String message) throws MoodAnalyzerException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.ENTERED_EMPTY, "Please check mood");

            if (message.toLowerCase().contains("sad"))
                return "SAD";

        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.ENTERED_NULL, "Please check mood");
        }
        return "HAPPY";
    }

    public String analyzeMoodAgain() throws MoodAnalyzerException {
        return analyzeMood(this.message);
    }
}