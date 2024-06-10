package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
 
	
	public void CreateDatabase() {
		 try {
			 String url="jdbc:mysql://localhost:3306/server";
			// String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url, userName,password);
			 Statement stm = con.createStatement();
			 String query= "Create Table student (sid int(3), sname varchar(200), semail varchar(200))";
			stm.execute(query);
			 System.out.println("Table Created Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}

	public void CreateTable() {
		 try {
			 String url="jdbc:mysql://localhost:3306/sharma";
			// String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url, userName,password);
			 Statement stm = con.createStatement();
			 String query= "Create Table student (sid int(3), sname varchar(200), semail varchar(200))";
			stm.execute(query);
			 System.out.println("Table Created Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}

	public void CreateData() {
		
		 try {
			 String url="jdbc:mysql://localhost:3306/";
			 String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url+db, userName,password);
			 String query= "INSERT into student (SId,SuserName,Semail)VALUES(?,?,?)";

			 PreparedStatement pstm = con.prepareStatement(query);
			 pstm.setInt(1, 15);
			 pstm.setString(2, "Rock");
			 pstm.setString(3, "Rock@gmail.com");
			pstm.executeUpdate();
			 System.out.println("Data Inserted Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}

	public void readData() {
		 try {
			 String url="jdbc:mysql://localhost:3306/";
			 String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url+db, userName,password);
			 String query="Select * from student";
			 Statement stm = con.createStatement();
			 ResultSet rs = stm.executeQuery(query);
			 while(rs.next()) {
				 System.out.println("id="+rs.getInt(1));
				 System.out.println("name="+rs.getString(2));
				 System.out.println("email = "+rs.getString(3));
			 }
			 System.out.println("read Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}

	public void updateData() {
		 try {
			 String url="jdbc:mysql://localhost:3306/";
			 String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url+db, userName,password);
			 String query= "UPDATE student set SId =? where SuserName= ?";

			 PreparedStatement pstm = con.prepareStatement(query);
			 pstm.setInt(1, 12);
			 pstm.setString(2, "Saurabh");
			 
			pstm.execute();
			 System.out.println("Data Updated Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}

	public void deleteData() {
		 try {
			 String url="jdbc:mysql://localhost:3306/sharma";
			// String db = "sharma";
			 String userName= "root";
			 String password = "Ravi@9576#";
			 Connection con = DriverManager.getConnection(url, userName,password);
			 Statement stm = con.createStatement();
			 String query= "DELETE from student where SuserName = sharma";
			stm.executeUpdate(query);
			 System.out.println("Table Delete Successfully");
			 con.close();

		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
	}
	}
	
	

	
	
	
