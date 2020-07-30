import java.util.logging.*;

public class lesson45_logging {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(lesson45_logging.class.getName()); // экземпляр регистратора используя имя класса
        Filter filter = new FilterExample();

        /*
        logger.log(Level.WARNING, "hello " + logger.getName()); // log() - метод для печати сообщения журнала
                                                                // Level.WARNING - константа пакета

        logger.severe("severe log");
        logger.warning("warning log");
        logger.info("info log");

        Handler fileHandler  = new FileHandler("default2.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());  //SimpleFormatter() или XMLFormatter()
        logger.info("info log message");
        */

        logger.setFilter(filter);
        logger.info("Serve log");
        logger.info("info log");
        logger.warning("warning log");

    }
}

class FilterExample implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        if (record.getLevel() != Level.INFO) {
            return false;
        }
        return true;
    }
}
