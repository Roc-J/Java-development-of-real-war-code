package train;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRow {
	Connection conn = null;
	//insert
	public int insertRow(int id,String name,String sex,int age){
		try {
			conn = new GetConn().getConnection();
			Statement stat = conn.createStatement();
			String sql = "insert into User values("+id+",'"+name+"','"+sex+"',"+age+")";
			System.out.println(sql);
			int count = stat.executeUpdate(sql);
			stat.close();
			conn.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//delete 
	public int deleteCount(String sql){
		try {
			conn = new GetConn().getConnection();
			Statement stat = conn.createStatement();
			int count = stat.executeUpdate(sql);
			stat.close();
			conn.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//update
	public int update(String name){
		try {
			conn = new GetConn().getConnection();
			Statement stat = conn.createStatement();
			String sql = "update User set age=30 where name="+"'"+name+"'";
			int count = stat.executeUpdate(sql);
			stat.close();
			conn.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public ResultSet select(int age){
		try {
			conn = new GetConn().getConnection();
			String sql = "select * from User where age<?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, age);
			ResultSet rs = pstat.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		/*int count = new InsertRow().deleteCount("delete from User");
		System.out.println("删除数据的行数是:"+count);*/
		/*new InsertRow().insertRow(101, "张玉荣", "女", 19);
		new InsertRow().insertRow(111, "马苏", "女", 19);
		new InsertRow().insertRow(121, "张国荣", "男", 19);*/
		//new InsertRow().update("张国荣");
		System.out.println("输出年龄小于50岁的人");
		try {
			ResultSet rs = new InsertRow().select(50);
			while(rs.next()){
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				System.out.println(name +" " + sex +" "+ age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
