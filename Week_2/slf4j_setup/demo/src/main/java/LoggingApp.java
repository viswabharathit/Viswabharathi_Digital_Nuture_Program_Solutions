import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApp {

    // Create logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingApp.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            int result = divide(10, 0);
            logger.info("Division result: {}", result);
        } catch (ArithmeticException e) {
            logger.error("An error occurred during division: {}", e.getMessage(), e);
        }

        logger.warn("This is a warning message indicating something might be wrong");
        logger.info("Application finished");
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
