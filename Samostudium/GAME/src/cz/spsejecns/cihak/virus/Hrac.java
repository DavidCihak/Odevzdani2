package cz.spsejecns.cihak.virus;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import cz.spsejecna.cihak.RenderLayer;

public class Hrac extends Entity implements MouseMotionListener {

	public Hrac(RenderLayer l) {
		super(l);
		this.color = Color.BLUE;
		this.width = 25;
		this.heigth = 25;
		this.xPosition = 750 / 2 - this.width / 2;
		this.yPosition = 550 / 2 - this.heigth / 2;

		// TODO Auto-generated constructor stub
	}


	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.xPosition, this.yPosition, this.width, this.heigth);

	}

	public void mouseDragged(MouseEvent e) {
		this.mouseMoved(e);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.xPosition = e.getX() - this.width / 2;
		this.yPosition = e.getY() - this.heigth / 2;

	}

}
