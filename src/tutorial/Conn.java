package tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conn {
	private Connection con;
	private String url = "jdbc:mysql://localhost:3306/test1?"
            + "user=root&password=leonhitcx&useUnicode=true&characterEncoding=UTF8";
	
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			con = DriverManager.getConnection(url);
			System.out.println("���ݿ����ӳɹ�");
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
