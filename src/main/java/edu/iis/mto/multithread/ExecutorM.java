package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class ExecutorM implements Executor{

	@Override
	public void execute(Runnable arg0) {
		// TODO Auto-generated method stub
		arg0.run();
	}

}
