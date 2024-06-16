import java.io.Serializable;

public class Logger implements Cloneable, Serializable {
    private static Logger instance;
    private static AbstractLogger chainOfCommand;
    private static LoggerSubject buildObservers;
    private Logger(){
        if(instance != null) {
            throw new IllegalStateException("Object already created");
        }
    };

    public static Logger getInstance() {
        if(instance==null) {
            instance = new Logger();
            chainOfCommand = LogManager.buildChainOfCommand();
            buildObservers = LogManager.buildLoggerSubjects();
        }
        return instance;
    }
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private void createLog(String msg, int level, LoggerSubject loggerSubject) {
        chainOfCommand.logMessage(level, msg, loggerSubject);
    }

    public void info(String msg) {
        createLog(msg, 1, buildObservers);
    }

    public void error(String msg ) {
        createLog(msg, 2, buildObservers);
    }

}
