public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info(" Info log level");
        //logger.error("Error inside error log");
    }

}

// application ->  Logger -> loglevels -> sinks ( file, console, database)