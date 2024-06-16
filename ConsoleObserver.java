public class ConsoleObserver implements LogObserver {

    @Override
    public void log(String message) {
        System.out.println(" Console Log: " + message);
    }
    
}
