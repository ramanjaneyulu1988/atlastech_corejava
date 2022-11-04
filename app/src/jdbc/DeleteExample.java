package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DBUtil.getDBConnection();
			// Creating Statement
			stmt = con.createStatement();
			String sql = "delete from customer where customer_id in (102, 103)";
			
			// Executing query
			int i = stmt.executeUpdate(sql);
			if(i > 0)
			{
				System.out.println("Deletion succesful...");
			}
			else
			{
				System.out.println("Deletion failed...");
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
