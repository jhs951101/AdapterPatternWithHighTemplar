package pkg;

public class Main{
	public static void main(String[] args){
		
		ProtossUnit zealot = new Zealot();
		ProtossUnit dragon = new Dragon();
		
		HighTemplarInterface hightemplar = new HighTemplar();
		HighTemplarAdaptor hightemplarAdaptor = new HighTemplarAdaptor(hightemplar);
		
		zealot.attack();
		dragon.attack();
		hightemplarAdaptor.attack();
		
	}
}