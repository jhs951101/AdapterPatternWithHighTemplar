package pkg;

public class HighTemplarAdaptor implements ProtossUnit{
	
	HighTemplarInterface hightemplar;
	
	public HighTemplarAdaptor(HighTemplarInterface ht){
		hightemplar = ht;
	}
	
	@Override
	public void attack() {
		hightemplar.psionicStorm();
	}
	
}