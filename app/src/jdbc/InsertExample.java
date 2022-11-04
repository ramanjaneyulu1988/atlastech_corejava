package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DBUtil.getDBConnection();
			// Creating Statement
			stmt = con.createStatement();
			String sql = "insert into customer (customer_id, firstname, lastname, address, email, phone) values (105, 'Alex', 'Dayya', 'Blr', 'alex@gmail.com', 1234567)";
			
			// Executing query
			int i = stmt.executeUpdate(sql);
			if(i > 0)
			{
				System.out.println("Insertion succesful...");
			}
			else
			{
				System.out.println("Insertion failed...");
			}
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
