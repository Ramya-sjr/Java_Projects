import java.sql.*;

public class Insert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String URL="jdbc:mysql://localhost:3306/details";
		String uname="root";
		String password="root";
		int id = 7;
		String name = "Gita";
		String query = "insert into student values(?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,uname,password);
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		int count = st.executeUpdate();
		
		
		
		System.out.println(count+ "row(s) affected");
		
	
		
		
		st.close();
		conn.close();


	}

}
