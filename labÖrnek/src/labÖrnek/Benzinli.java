package labÖrnek;

public class Benzinli extends Araba {
int motorHacmi;
int yakitDeposu;
int silindirSayisi;

public void goruntule() {
	System.err.println("");
	System.out.println("Benzinli Araba Ozellikleri");
	 System.out.println("Kasa tipi: "+kasaTipi);
	 System.out.println("Renk: "+renk);
	 System.out.println("Teker boyutu: "+getTeketBoyut());
	 System.out.println("Beygir :"+getBeygir());
	System.out.println("Motor Hacmi: "+motorHacmi);
	System.out.println("Kalan Yakıt Deposu: "+yakitDeposu);
	System.out.println("Silindir Sayisi: "+silindirSayisi);
	
}
}

