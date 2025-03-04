package threadingDemo;


public class KronometreThread extends Thread {
	
	private String name;
 
	public KronometreThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + this.name);
			Thread.sleep(1000);
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
