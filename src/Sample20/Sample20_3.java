package Sample20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample20_3 {
	
	private static String dbURL = "jdbc:mariadb://docker.rapideact.local:3307/furuki";

	private static String user = "furuki";

	private static String password = "furuki";
	
	public static void main(String[] args) {

        try {

            // JDBCドライバをロードする
            // JDBCドライバを使う前のおまじない
            Class.forName(org.mariadb.jdbc.Driver.class.getName());

        } catch (ClassNotFoundException e) {
            System.out.println("jdbcクラスが見つけられませんでした。");
            e.printStackTrace();
        }
        
        Sample20_3 main = new Sample20_3();
        
        main.update();
        
        main.select();
        
        main.delete();
        
        
        
        
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
	
	private void update() {
		
		try(Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();){
			
			st.execute("update emp set name = 'm-kawabata' where name = 'kawabata'");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void insert() {

        try(Connection con = DriverManager.getConnection(dbURL, user, password);
                Statement st = con.createStatement();){

            // insert文を発行
            st.execute("insert into emp (name, birth) values ('kuboyama', '1990-01-01'), ('maruyama', '1991-01-01');");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
	
	private void delete() {
		try(Connection con = DriverManager.getConnection(dbURL, user, password);
				Statement st = con.createStatement();){
			st.execute("delete from emp where id in (9, 10);");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
