package threads;

public class Example2 implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main method start...");
		
		Runnable example2 = new Example2();
		Thread t = new Thread(example2);
		t.start();
		
		for(int i=1; i<=10; i++)
		{
			Thread.sleep(500);
			System.out.println("Inside main method: "+i);
		}
		
		System.out.println("main method end...");
	}
	
	public void run()
	{
		for(int i=11; i<=20; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside run method: "+i);
		}
	}
}
