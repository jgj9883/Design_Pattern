
package Login;

import java.sql.ResultSet;

/**
 *
 * @author 전규빈
 */
public class PwSearch implements Searchable {
    private ResultSet rs = null;
    String pass = null;
    String SQL ="";
    
    public PwSearch(){
        System.out.println("Pw 검색 클래스");
    }

    @Override
    public boolean isSearch(LoginSystem sys) {
       System.out.println("Pw를 검색합니다 !!");
        String id =sys.getId();
        String pw =sys.getPw();
        char a = id.charAt(0);
        try {
                if(a =='M'){
                    SQL = "SELECT * FROM administrator WHERE manno ='" + id + "'";
                    rs = DBConnector.getStatement().executeQuery(SQL);
                      if(rs.next()) {
                          pass=rs.getString("password");
                      }
                }  
                else if(a =='D'){
                    SQL = "SELECT * FROM doctor WHERE docno ='" + id + "'";
                    rs = DBConnector.getStatement().executeQuery(SQL);
                      if(rs.next()) {
                          pass=rs.getString("password");
                      }
                }
                else if(a =='N'){
                    SQL = "SELECT * FROM nurse WHERE nurno ='" + id + "'";
                    rs = DBConnector.getStatement().executeQuery(SQL);
                      if(rs.next()) {
                          pass=rs.getString("password");
                      }
                }
                if(pw.equals(pass)){
                    System.out.println("비밀번호가 확인되었습니다.");
                    return true;
                }else{
                    System.out.println("비밀번호가 틀렸습니다.");
                    return false;
                }
	}catch(Exception e){
                    System.out.println("데이터베이스 검색 오류 :" +e.getMessage());            
                    return false;
	}
    }
    
}
