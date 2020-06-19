package cz.spsejecna.cihak.dedicnost;

public class Pes extends Savec {
	private int vyska;
	private String rasa;

	public Pes() {
		vyska = 60;
		rasa = "kokrspanel";
		System.out.println("Pes. ");
	}

	public int ziskejVysku() {
		return vyska;
	}

	public void chuze() {
		System.out.println("Pes jde.");
	}

	public void beh() {
		System.out.println("Pes bezi. ");
	}
}
