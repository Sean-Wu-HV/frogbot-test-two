package org.sean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
   private static final Logger logger = LogManager.getLogger(Log4jExample.class);

   Log4jExample(){

   };

   public static void runLog4j() {
      // Log a debug message
      logger.debug("Debug message");

      // Log an info message
      logger.info("Info message");

      // Log a warning message
      logger.warn("Warning message");

      // Log an error message
      logger.error("Error message", new RuntimeException("Something went wrong!"));
   }
}
