package edu.iis.mto.multithread;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.Executor;

import org.junit.Rule;
import org.junit.Test;
import edu.iis.mto.multithread.RepeatM.Repeat;
public class BetterRadarTest {

	@Rule
	public RepeatM repeat = new RepeatM();
	@Test
	@Repeat(times = 100)
	public void launchPatriotOnceWhenNoticesAScudMissle() {
		PatriotBattery batteryMock = mock(PatriotBattery.class);
		Executor executor = new ExecutorM();
		
		BetterRadar radar = new BetterRadar(batteryMock);
		radar.setLaunchExecutor(executor);
		radar.notice(new Scud());
		verify(batteryMock).launchPatriot();
	}

}
