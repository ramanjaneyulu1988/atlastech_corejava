package exception.compiletime;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main method start");
		
		Example1 example1 = new Example1();
		try {
			example1.test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
	}
	
	public void test() throws InterruptedException
	{
		System.out.println("test method start...");
		
		Thread.sleep(20000);
		
		System.out.println("test method end...");
		
	}
}
