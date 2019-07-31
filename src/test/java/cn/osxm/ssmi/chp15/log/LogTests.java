package cn.osxm.ssmi.chp15.log;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.junit.Test;

/**
 * @ClassName: LogTests
 * @Description: TODO
 * @author oscarchen
 */

public class LogTests {

	protected static final org.apache.logging.log4j.Logger log4jLogger = org.apache.logging.log4j.LogManager.getLogger();

    protected static final org.apache.commons.logging.Log jclLogger = org.apache.commons.logging.LogFactory.getLog(LogTests.class);

    @Test
    public void log4jLog() {
        String loggerName = "Log4j";
        log4jLogger.trace(loggerName + " Trace Log");
        log4jLogger.debug(loggerName + " Debug Log.");
        log4jLogger.info(loggerName + " Info Log");
        log4jLogger.warn(loggerName + " Warn Log");
        log4jLogger.error(loggerName + " Error Log");
        log4jLogger.fatal(loggerName + " Fatal Log");

        // Marker marker = MarkerManager.getMarker("CLASS");

    }

    // @Test
    public void log4jLogMark() {
       String username = "root";
        String password = "123456";
        Marker marker = MarkerManager.getMarker("my_marker");
        log4jLogger.info(marker, "username:{} password:{}", username, password);
    }

    //@Test
    public void jclLog() {
        org.apache.commons.logging.Log jclLogger = org.apache.commons.logging.LogFactory.getLog(LogTests.class);        
        String loggerName = "Apache Commons Logging";
        jclLogger.trace(loggerName + " Trace Log");
        jclLogger.debug(loggerName + " Debug Log.");
        jclLogger.info(loggerName + " Info Log");
        jclLogger.warn(loggerName + " Warn Log");
        jclLogger.error(loggerName + " Error Log");
        jclLogger.fatal(loggerName + " Fatal Log");
    }
    
    //@Test
    public void log4jLogPattern() {
        log4jLogger.fatal("My Log4j Pattern");
        
        
        String loggerName = "Log4j";
        log4jLogger.trace(loggerName + " Trace Log");
        log4jLogger.debug(loggerName + " Debug Log.");
        log4jLogger.info(loggerName + " Info Log");
        log4jLogger.warn(loggerName + " Warn Log");
        log4jLogger.error(loggerName + " Error Log");
        log4jLogger.fatal(loggerName + " Fatal Log");
        //log4jLogger.info("My Log4j Pattern",new Exception("My Exception"));
    }
}



