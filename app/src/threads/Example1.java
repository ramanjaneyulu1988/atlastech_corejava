package threads;

public class Example1 extends Thread
{
	// main thread is responsible to call/execute the main method
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main method start...");
		
		Thread example1 = new Example1();
		System.out.println(example1.getState());
		example1.setName("SendSMSThread");
		System.out.println(example1.getName());
		System.out.println(example1.getPriority());
		example1.start();
		System.out.println(example1.getState());
		
		Thread example2 = new Example1();
		example2.setName("SendEmailThread");
		System.out.println(example2.getName());
		System.out.println(example2.getPriority());
		example2.start();
		
		for(int i=1; i<=10; i++)
		{
			Thread.sleep(500);
			System.out.println("Inside main method: "+i);
		}
		
		System.out.println("main method end...");
	}
	
	public void run()
	{
		String name = Thread.currentThread().getName();
		if(name.equals("SendSMSThread"))
		{
			sendSMS();
		}
		if(name.equals("SendEmailThread"))
		{
			sendEmails();
		}
	}
	
	public void sendSMS()
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
	
	public void sendEmails()
	{
		for(int i=21; i<=30; i++)
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
