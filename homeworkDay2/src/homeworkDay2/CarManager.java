package homeworkDay2;

public class CarManager {
	public void carAdd(CarField carField,CarCategory carcategory) {
		System.out.println("Ara� Sepete Eklendi:"+carField.model+"\nType:"+carcategory.type);
		
	}
	public void carRemove(CarField carField ) {
		System.out.println("Ara� Sepetten Kald�r�l�yor:"+carField.model);
		
	}
	public void carStar(CarField carField) {
		System.out.println("Ara� Favoriler Listesine Eklendi:"+carField.model);
	}

}
