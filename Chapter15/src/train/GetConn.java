package train;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ����mysql���ݿ�
 * @author Roc-J
 *
 */
public class GetConn {

	public Connection conn = null;
	public Connection getConnection(){
		try {
			//�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//ָ���������ݿ��URL
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
			//ָ���������ݿ���û���
			String user="root";
			//ָ���������ݿ������
			String password = "root";
			
			conn = DriverManager.getConnection(url,user,password);
			if (conn!=null) {
				System.out.println("���ݿ����ӳɹ���");
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
