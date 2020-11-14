
package UserManagement;

import Login.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/*
    <작성이> : 20163337 전규빈
    <제목> : 사용자 검색 클래스(class)
    <내용> : 사용자의 정보를 검색하기 위한 클래스이다.
 */
public class UserSearch implements ConfirmElement {
   private Connection con = null;
   private Statement st = null;
   private ResultSet rs = null;
   String SQL ="";  
   String ide = null, password = null, name = null, gender = null, age = null, major = null;
    
    public boolean isSearch(String id) {      
       
        char a= id.charAt(0);
        String b = id.substring(1);
    
        try {
            if(a =='M'){
                SQL = "SELECT * FROM administrator WHERE manno ='" + id + "'";
                 rs = DBConnector.getStatement().executeQuery(SQL);
                  if(rs.next()) {
                      ide=rs.getString("manno");
                      password=rs.getString("password");
                      name = rs.getString("name");
                      gender = rs.getString("gender");
                      age = rs.getString("age");
                      major = rs.getString("major");
		}
                      if(b.equals(ide.substring(1))){
                          System.out.println("검색 시스템 확인");
                      }else{
                      return false;
                      }
            }
            else if(a =='D'){
                SQL = "SELECT * FROM doctor WHERE docno ='" + id+ "'";
                 rs = DBConnector.getStatement().executeQuery(SQL);
                  if(rs.next()) {
                      ide=rs.getString("docno");
                      password=rs.getString("password");
                      name = rs.getString("name");
                      gender = rs.getString("gender");
                      age = rs.getString("age");
                      major = rs.getString("major");
		}         
                    if(b.equals(ide.substring(1))){
                          System.out.println("검색 시스템 확인");
                      }else{
                      return false;
                      }
            }
            else if(a =='N'){
                SQL = "SELECT * FROM nurse WHERE nurno ='" + id+ "'";
                 rs = DBConnector.getStatement().executeQuery(SQL);
                  if(rs.next()) {
                      ide=rs.getString("nurno");
                      password=rs.getString("password");
                      name = rs.getString("name");
                      gender = rs.getString("gender");
                      age = rs.getString("age");
                      major = rs.getString("major");
		}  
                    if(b.equals(ide.substring(1))){
                          System.out.println("검색 시스템 확인");
                      }else{
                      return false;
                      }
            }else{
                showMessageDialog(null,"등록되지 않은 사용자입니다.");
                return false;
            }
                 setId(ide);
                    setName(name);
                        setGender(gender);
                            setAge(age);
                                setMajor(major);             
                                updateConfirm(id);
       }
             catch(Exception e){
                          showMessageDialog(null,"사용자 검색 실패");
			System.out.println("데이터베이스 사용자 검색 오류 :" +e.getMessage());
                          return false;
	    }
        return true;
    }
    
    
    @Override
    public void updateConfirm(String mode) {
        showMessageDialog(null,"ID : "+getId()+"\n\n"+ "이름  : "+getName()+ "님이 검색되었습니다");
    }

    public String getId() {
        return ide;
    }

    public void setId(String id) {
        this.ide = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
}
