package Sample20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample20_1 {

	private static String dbURL = "jdbc:mariadb://docker.rapideact.local:3307/furuki";

	private static String user = "furuki";

	private static String password = "furuki";

	public static void main(String[] args) {
		try {
			Class.forName(org.mariadb.jdbc.Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("jdbcクラスが見つけられませんでした。");
			e.printStackTrace();
		}

		Sample20_1 main = new Sample20_1();
		main.testConnection();
	}

	private void testConnection() {
		try (Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();) {

			ResultSet rs = st.executeQuery("select * from emp");
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
