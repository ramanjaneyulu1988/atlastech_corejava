package collectionfw.generics;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		Product product1 = new Product();
		product1.setBrand("MI");
		product1.setId(1);
		product1.setPrice(8000.0);
		product1.setProductName("REDMI 10A (Charcoal Black, 64 GB)  (4 GB RAM)");
		
		Product product2 = new Product();
		product2.setBrand("MI");
		product2.setId(2);
		product2.setPrice(10000.0);
		product2.setProductName("REDMI 10A (Charcoal Black, 64 GB)  (6 GB RAM)");
		
		Product product3 = new Product();
		product3.setBrand("Samsung");
		product3.setId(3);
		product3.setPrice(9000.0);
		product3.setProductName("Saumng mobile with 4 gb");
		
		Product product4 = new Product();
		product4.setBrand("Apple");
		product4.setId(4);
		product4.setPrice(40000.0);
		product4.setProductName("Iphone 7");
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		
		System.out.println(productList);
		
		for(Product p : productList)
		{
			if(p.getBrand().contains("Apple"))
			{
				System.out.println(p);
			}
		}
	}
}
