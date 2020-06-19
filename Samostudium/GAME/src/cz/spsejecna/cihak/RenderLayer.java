package cz.spsejecna.cihak;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import cz.spsejecns.cihak.virus.Enemy;
import cz.spsejecns.cihak.virus.Entity;
import cz.spsejecns.cihak.virus.Hrac;


public class RenderLayer extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	private boolean isRunning;
	private boolean isGameOver;
	private float score;
	private Hrac hr;
	private ArrayList<Entity> entities;

	public RenderLayer() {
		super();
		this.isRunning = false;
		this.isGameOver = false;
		this.score = 0;
		this.setSize(new Dimension(750, 550));
		this.hr = new Hrac(this);
		this.addMouseMotionListener(this.hr);
		this.entities = new ArrayList<Entity>();

		for (int i = 0; i < 10; i++) {
			this.entities.add(new Enemy(this));
		}
	}

	public void run() {
		long lastTimeCycle = System.nanoTime();// zaznamená poslední èas bìhu cyklu
		long lastTimeOutput = System.currentTimeMillis();
		double unprocessedTicks = 0;
		double nsPerTick = Math.pow(10, 9) / 60;
		int FPS = 0;
		int ticks = 0;

		while (this.isRunning) {
			long nowTimeCycle = System.nanoTime();
			unprocessedTicks += (nowTimeCycle - lastTimeCycle) / nsPerTick;
			lastTimeCycle = nowTimeCycle;

			while (unprocessedTicks >= 1) {
				ticks++;
				unprocessedTicks--;
				this.update();

			}
			FPS++;
			this.render();
			if (System.currentTimeMillis() - lastTimeOutput > 1000) {
				lastTimeOutput += 1000;
				System.out.println("Ticks: " + ticks + ", FPS: " + FPS);
				this.score += 0.5;
				FPS = 0;
				ticks = 0;
			}
		}
	}

	private void render() {
		BufferStrategy buffer = this.getBufferStrategy();
		if (buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = buffer.getDrawGraphics();
		g.setColor(this.getForeground());
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (Entity e : this.entities) {
			e.render(g);
		}

		hr.render(g);
		/*
		 * g.setColor(Color.GREEN); g.fillOval(200, 150, 200, 200);
		 * 
		 * g.setColor(Color.GREEN); g.fillOval(450, 200, 100, 100);
		 */
		g.setColor(Color.WHITE);
		g.drawString("Tvé skoré: " + (int) this.score, 15, 15);
		g.dispose();
		buffer.show();
		// TODO Auto-generated method stub

	}

	private void update() {
		hr.update();

	}

	public void start() {
		this.isRunning = true;
		Thread t = new Thread(this);
		t.start();

	}

}
