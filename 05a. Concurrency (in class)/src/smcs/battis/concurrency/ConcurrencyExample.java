package smcs.battis.concurrency;

public class ConcurrencyExample implements Runnable {

	public ConcurrencyExample(String name) {
		new Thread(this, name).start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
