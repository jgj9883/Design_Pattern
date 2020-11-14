
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
    <작성이> : 20163337 전규빈
    <제목> : 데이터베이스 연결 (class)
    <내용> : 프로그램과 서버를 연결시키져는 클래로써 초기 프로그램 시작에 DBConnector객체를 생성하여 서버와 연결한다.
    프로그램을 사용하면서 커넥터의 연결값들을 받아와야하기 때문에 static을 통해 get메소드를 통하여 객체들을 리턴해준다. 
*/

 public class DBConnector extends LoginSystem {
  
    public static final DBConnector dbconnector = new DBConnector();
  
    static private Connection con = null;
    static private Statement st = null;
    private ResultSet rs = null;
  
            static Connection connect() {
                    throw new UnsupportedOperationException("Not supported yet."); 
            }
     
            private DBConnector() {}
    
        public static DBConnector getInstance() {
           return dbconnector;
       }
       
       public static Statement getStatement() {
           return st;
       }
       
       public static Connection getConnection(){
           return con;
       }
  
  public boolean initialize() {
      try{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	con = DriverManager.getConnection("jdbc:mysql://113.198.235.240:3192/dp_pattern?serverTimezone=UTC","root","0922");
	st = con.createStatement();
         System.out.println("연결 성공");
                     
         return true;				
	}catch(SQLException e) 
	{
	    System.out.println("데이터 베이스 연결 오류 : "+e.getMessage());
	}
         return false;
  }
  
  }
  
  
		


