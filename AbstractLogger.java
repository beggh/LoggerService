public abstract class AbstractLogger {
    public int level;
    private AbstractLogger setNextLogger;

    void setNextLogger(AbstractLogger nextLogger) {
        this.setNextLogger = nextLogger;
    }

    void logMessage(int level, String message, LoggerSubject loggerSubject) {
        //System.out.println(level + " level-- this.level "+ this.level);
        if(this.level <= level) {
            displayMessage(message, loggerSubject);
        }
        if(setNextLogger != null) {
            //System.out.println(" setNextLogger" + setNextLogger);
            setNextLogger.logMessage(level, message, loggerSubject);
        }
    }

    protected abstract void displayMessage(String message, LoggerSubject loggerSubject);

}
