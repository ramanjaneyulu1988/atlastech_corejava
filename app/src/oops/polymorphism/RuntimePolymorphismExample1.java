package oops.polymorphism;

class Tree
{
	public void getTreeColor()
	{
		System.out.println("Tree - getTreeColor method...");
	}
}

class MangoTree extends Tree
{
	public void getTreeColor()
	{
		System.out.println("MangoTree - getTreeColor method...");
	}
}

class BananaTree extends Tree
{
	public void getTreeColor()
	{
		System.out.println("BananaTree - getTreeColor method...");
	}
}

public class RuntimePolymorphismExample1 {

	public static void main(String[] args) {
		
		Tree t = new BananaTree(); // Auto upcasting
		
		t.getTreeColor();
	}
}
