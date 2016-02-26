package logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;

/**
 * Created by zhaosq on 2016/2/22.
 */
public class Application {
    public static void main(String[] args) {

        // logback-classic requires slf4j-api.jar and logback-core.jar
        // with slf4j api, init the logger
        Logger logger = LoggerFactory.getLogger("Root");
//        Logger rootLogger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
//        rootLogger.info("root log");
        logger.info("Hello World");
//        Log log = LogFactory.getLog("Root");
//        Logger logger = LogManager.getLogger("Root");
//        log.info("test");
//        logger.info("test");

        // print logger internal status
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);
  }
}
