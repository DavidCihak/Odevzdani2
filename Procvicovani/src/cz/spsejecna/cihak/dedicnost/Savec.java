package cz.spsejecna.cihak.dedicnost;

public class Savec {
	private int vek;
	private int vaha;

	public Savec() {
		System.out.println("Savec.");
		vek = 5;
		vaha = 3;
	}

	public void pohyb() {
		System.out.println("Pes se pohybuje.");

	}

	public int getVek() {
		return vek;
	}

	public void setVek(int vek) {
		this.vek = vek;
	}

	public int getVaha() {
		return vaha;
	}

	public void setVaha(int vaha) {
		this.vaha = vaha;
	}
}
