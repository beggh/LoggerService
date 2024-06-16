public class LogManager {
    static AbstractLogger buildChainOfCommand() {
        AbstractLogger infologger = new InfoLogger(1);
        AbstractLogger errLogger = new ErrorLogger(2);
        infologger.setNextLogger(errLogger);
        return infologger;
    }
    static LoggerSubject buildLoggerSubjects() {
        LoggerSubject loggerSubject = new LoggerSubject();
        LogObserver consoleObserver = new ConsoleObserver();
        loggerSubject.addObservers(1, consoleObserver);
        loggerSubject.addObservers(2, consoleObserver);
        LogObserver fileObserver = new FileObserver();
        loggerSubject.addObservers(2, fileObserver);
        return loggerSubject;
    }
}
