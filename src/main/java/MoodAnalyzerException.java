
public class MoodAnalyzerException extends Exception {
    enum ExceptionTypes {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionTypes types;

    public MoodAnalyzerException(ExceptionTypes types, String message) {
        super(message);
        this.types = types;
    }
}
