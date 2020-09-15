package Package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {

	public static Logger logger= LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n  Sushil Doiphode  \n");
		logger.info("info sms");
		logger.error("error sms");
		logger.warn("warn sms");
		logger.fatal("fatal sms");
		
		
		System.out.println("\n  Complete  \n");
}
}