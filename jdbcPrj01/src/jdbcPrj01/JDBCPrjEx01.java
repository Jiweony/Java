package jdbcPrj01;

import java.sql.*;

public class JDBCPrjEx01 {

	public static void main(String[] args) {
		//데이터입출력 : try ~ catch() 또는 메소드 이름 옆에 throws
		JDBCPrjEx01 jdbc = new JDBCPrjEx01();
		jdbc.mysqlConnect();
	}
	
	void mysqlConnect() { //mysql 접속 동작
		try {
			//1. jdbc 연결 : Class.forName();
			//ver 5 : Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver"); //리버스 도메인
			
			//2. 연결정보 : Connection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id  = "root";
			String pwd = "1234";
			DriverManager.getConnection(url, id, pwd);
			
			//3. 확인
			System.out.println("데이터베이스 연결완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
