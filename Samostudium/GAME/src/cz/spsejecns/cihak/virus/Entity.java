package cz.spsejecns.cihak.virus;

import java.awt.Color;
import java.awt.Graphics;

import cz.spsejecna.cihak.RenderLayer;

abstract public class Entity {
	protected int xPosition;
	protected int yPosition;
	protected Color color;
	protected int width;
	protected int heigth;
	protected RenderLayer map;

	public Entity(RenderLayer l) {
		super();
		this.map = l;

	}

	abstract public void update();

	abstract public void render(Graphics g);

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
