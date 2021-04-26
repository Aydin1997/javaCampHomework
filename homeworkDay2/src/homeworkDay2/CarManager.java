package homeworkDay2;

public class CarManager {
	public void carAdd(CarField carField,CarCategory carcategory) {
		System.out.println("Araç Sepete Eklendi:"+carField.model+"\nType:"+carcategory.type);
		
	}
	public void carRemove(CarField carField ) {
		System.out.println("Araç Sepetten Kaldýrýlýyor:"+carField.model);
		
	}
	public void carStar(CarField carField) {
		System.out.println("Araç Favoriler Listesine Eklendi:"+carField.model);
	}

}
