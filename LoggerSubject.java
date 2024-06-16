import java.util.*;

public class LoggerSubject {
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();

    void addObservers(Integer level, LogObserver logObserver) {
        if(logObservers.get(level) == null) {
            logObservers.put(level, new ArrayList<>());
        }
        logObservers.get(level).add(logObserver);
    }

    void removeObservers(LogObserver observer) {
        
    }

    void notifyAllObservers(Integer level, String message) {
        for(Map.Entry<Integer, List<LogObserver>> entry: logObservers.entrySet()) {
            if(entry.getKey() == level) {
                entry.getValue().forEach(observer -> observer.log(message));
            }
        }
    }
    
}
