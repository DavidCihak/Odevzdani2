package cz.spsejecns.cihak.virus;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import cz.spsejecna.cihak.RenderLayer;
import cz.spsejecna.cihak.Vector;

public class Enemy extends Entity {
	private Vector directionVector;

	public Enemy(RenderLayer l) {
		super(l);
		Random rnd = new Random();

		switch (rnd.nextInt(4)) {
		case 0:
			this.color = Color.RED;
			break;
		case 1:
			this.color = Color.GREEN;

			break;
		case 2:
			this.color = Color.GREEN;
			break;
		case 3:
			this.color = Color.ORANGE;
			break;

		}

		this.directionVector = new Vector(rnd.nextInt(5), rnd.nextInt(5));

		this.xPosition = rnd.nextInt(750);
		this.xPosition = rnd.nextInt(550);
		this.width = 50;
		this.heigth = 50;

	}

	public void update() {
		this.xPosition += this.directionVector.getX();
		this.yPosition += this.directionVector.getY();

		if (this.xPosition + this.width > 800) {
			this.xPosition = 800 - this.width;

		}
		if (this.yPosition + this.heigth > 600) {
			this.yPosition = 600 - this.heigth;

		}

	}

	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.xPosition, this.yPosition, this.width, this.heigth);
	}

}
