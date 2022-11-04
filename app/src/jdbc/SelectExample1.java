package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectExample1 {

	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DBUtil.getDBConnection();
			// Creating Statement
			stmt = con.createStatement();
			String sql = "select * from customer";
			
			// Executing query
			ResultSet rs = stmt.executeQuery(sql);
			List<Customer> customers = new ArrayList<Customer>();
			while(rs.next())
			{
				Customer customer = new Customer();
				
				customer.setId(rs.getInt("customer_id"));
				customer.setFname(rs.getString("firstname"));
				customer.setLname(rs.getString("lastname"));
				customer.setEmail(rs.getString("email"));
				customer.setAddress(rs.getString("address"));
				customer.setPhone(rs.getInt("phone"));
				
				customers.add(customer);
			}
			
			System.out.println(customers);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				stmt.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
