package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {
	private PatriotBattery battery;
	private Executor executor;

	public BetterRadar(PatriotBattery missle) {
		this.battery = missle;
	}

	public void notice(Scud enemyMissle) {
		launchPatriot();
	}

	private void launchPatriot() {
		Runnable launchPatriotTask = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					battery.launchPatriot();
				}
			}
		};
		executor.execute(arg0);
		Thread launchingThread = new Thread(launchPatriotTask);
		launchingThread.start();
	}
	public void setLaunchExecutor(Executor executor){
		this.executor = executor;
	}
}


