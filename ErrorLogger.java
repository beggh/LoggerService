public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayMessage(String message, LoggerSubject loggerSubject) {
        loggerSubject.notifyAllObservers(this.level, "Error: "+message);
    }
}
