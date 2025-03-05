import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		OrderMatic orderMatic = new OrderMatic();
		
		
		ExecutorService pool = Executors.newFixedThreadPool(50);
		
		for (int i = 0; i < 100; i++) {
			pool.execute(orderMatic);
		}
		
		pool.shutdown();
		
		
		System.out.println(orderMatic.getOrderNo());
		

	}

}
