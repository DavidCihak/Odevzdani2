package cz.cihak.kalkulacka;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main extends JFrame {
	public static final String GameTitle = "KALKULAÈKA";

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Main game = new Main();

		game.init();
	}

	private void init() {
		Plocha plocha = new Plocha();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(plocha);
		this.pack();
		this.setTitle(Main.GameTitle);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setVisible(true);
		plocha.start();
	}

}
