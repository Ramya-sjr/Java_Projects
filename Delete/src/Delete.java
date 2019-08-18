
import java.sql.*;

public class Delete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String URL="jdbc:mysql://localhost:3306/details";
		String uname="root";
		String password="root";
		
		String query = "delete from student where name='Gita'";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,uname,password);
		PreparedStatement st = conn.prepareStatement(query);

		int count = st.executeUpdate();
		
		
		
		System.out.println(count+ "row(s) affected");
		
	
		
		
		st.close();
		conn.close();

	}

}
