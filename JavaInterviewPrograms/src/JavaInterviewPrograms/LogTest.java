package JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
	
	private static Logger Log = LogManager.getLogger(LogTest.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.info("This is info Log");
		Log.error("This is error Log");
		Log.debug("This is debug Log");
		Log.fatal("This is fatal Log");
		Log.warn("This is warn Log");

	}

}
