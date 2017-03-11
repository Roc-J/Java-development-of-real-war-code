package train;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接mysql数据库
 * @author Roc-J
 *
 */
public class GetConn {

	public Connection conn = null;
	public Connection getConnection(){
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//指定连接数据库的URL
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
			//指定连接数据库的用户名
			String user="root";
			//指定连接数据库的密码
			String password = "root";
			
			conn = DriverManager.getConnection(url,user,password);
			if (conn!=null) {
				System.out.println("数据库连接成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		GetConn geConn = new GetConn();
		geConn.getConnection();
	}

}
