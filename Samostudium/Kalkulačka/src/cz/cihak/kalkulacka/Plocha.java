package cz.cihak.kalkulacka;

import java.awt.Canvas;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.image.BufferStrategy;




import java.awt.Button;

public class Plocha extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	private boolean isRunning;
	private boolean isGameOver;
	String j = "jedna";

	public Plocha() {
		super();
		this.isRunning = false;
		this.isGameOver = false;
		this.setSize(new Dimension(750, 550));
	}

	@Override
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
	}

	private void update() {

	}

	public void start() {
		this.isRunning = true;
	
		Button Btn = new Button("Vote " + j);
		Btn.setLabel("+1");
		

	
	}
}
// TODO Auto-generated method stub
