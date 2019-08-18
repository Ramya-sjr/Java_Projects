import java.sql.*;

public class Fetch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String URL="jdbc:mysql://localhost:3306/details";
		String uname="root";
		String password="root";
		String query = "select *from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,uname,password);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userdata;
		
		while(rs.next()) {
                     
			userdata= rs.getInt(1)+":"+rs.getString(2);
		    System.out.println(userdata);
		
		}
		st.close();
		conn.close();

	}

}
