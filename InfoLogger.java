
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayMessage(String message, LoggerSubject loggerSubject) {
      loggerSubject.notifyAllObservers(this.level, "INFO: "+ message);
    }
    
}
