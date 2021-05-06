package core;

import java.rmi.RemoteException;

import entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersisManagerAdapter implements MersisService {

	@Override
	public boolean validate(User user) throws RemoteException {
	KPSPublicSoap kpsPublicSoap=new KPSPublicSoapProxy();
		
		
		return kpsPublicSoap.TCKimlikNoDogrula(user.getNationalityId(), user.getFirstName(), user.getLastName(), user.getYearOfBirth());
		
	}

}
