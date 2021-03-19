package Sample20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample20_2 {

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

		Sample20_2 main = new Sample20_2();
		main.select();
		
		main.delete();
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

	private void select() {

		// Connectionクラス、Statementクラスは
		// AutoCloseableを実装しているのでtry - with構文を使う
		try (Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();) {

			// SQLを発行して、結果を受け取る
			ResultSet rs = st.executeQuery("select * from emp");

			// 1行ずつレコードを読み込む
			while (rs.next()) {
				System.out.println(String.format("id : %s, name : %s, birthday : %s", rs.getObject(1), rs.getObject(2),
						rs.getObject(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void insert() {
		try(Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();){
			st.execute("insert into emp (name, birth) values ('kuboyama', '1990-01-01')");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void delete() {
		try(Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();){
			st.execute("delete from emp where id in (5, 6);");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
