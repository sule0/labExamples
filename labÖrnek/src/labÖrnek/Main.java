package labÖrnek;

public class Main {

	public static void main(String[] args) {

		Elektrikli elektrikli =new Elektrikli();
		elektrikli.kasaTipi= "Sedan";
		elektrikli.menzil=70000;
		elektrikli.renk="beyaz";
		elektrikli.sarjSuresi=3;
		elektrikli.setBeygir(5);
		elektrikli.setTeketBoyut(20);
		
		
		
		Benzinli benzinli=new Benzinli();
		benzinli.kasaTipi= "sedan";
		benzinli.yakitDeposu=100;
		benzinli.renk="siyah";
		benzinli.motorHacmi=200;
		benzinli.silindirSayisi=30;
		benzinli.setBeygir(6);
		benzinli.setTeketBoyut(25);
		
		
		benzinli.goruntule();
		elektrikli.goruntule();
		
		
	}

}
