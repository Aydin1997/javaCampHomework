package adapters;

import java.rmi.RemoteException;

import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class RealCheckPersonMersisManager implements RealCheckPersonService {

	@Override
	public boolean validate(Customer customer) throws RemoteException {
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();

		return kpsPublicSoap.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getyearOfBirth());
	}

}
