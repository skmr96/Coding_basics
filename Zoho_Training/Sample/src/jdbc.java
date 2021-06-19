import java.sql.*;

throws ClassNotFoundException, SQLException

String url = "jdbc:mysql://localhost:3306/players?useSSL=false";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection(url,"root","");
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from players");
		
		while(rs.next())
			System.out.println(rs.getString(1)+rs.getInt(2));
		
		cn.close();