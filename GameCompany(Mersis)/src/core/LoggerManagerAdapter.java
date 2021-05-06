package core;

import jLogger.JLogger;

public class LoggerManagerAdapter implements LoggerService{

	@Override
	public void logToMessage(String message) {
		
		JLogger jLogger=new JLogger();
		jLogger.log(message);
		
	}
	
	

}
