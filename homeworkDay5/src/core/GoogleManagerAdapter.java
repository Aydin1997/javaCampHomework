package core;

import jGoogle.GoogleManager;

public class GoogleManagerAdapter implements JGoogleService{

	@Override
	public void sendGoogleMessage(String message) {
		
		GoogleManager googleManager=new GoogleManager();
		googleManager.withGoogle(message);
		
	}

}
