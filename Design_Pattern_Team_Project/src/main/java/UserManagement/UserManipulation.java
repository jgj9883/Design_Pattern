package UserManagement;

import Login.DBConnector;
import static Login.DBConnector.dbconnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/*
    <작성이> : 20163337 전규빈
    <제목> : 사용자 추가,수정, 삭제 (class)
    <내용> : 해당 클래스에서 옵저버의 내용을 전달받아 
    (추가, 수정, 삭제)업데이트를 수행하게 된다.
 */
public class UserManipulation implements Observer, ConfirmElement {

    private String SQL = "";
    private Connection con = null;
    private Statement st = null;

    @Override
    public boolean update(String mode, UserInforData data) {
        UserSearch is = new UserSearch();
        char a = data.getUserId().charAt(0);
        String id = data.getUserId();
        //newData.setUserChanged(userId, userPw, name, gender, age, major);
        if (mode == "input") {
            try {
                if (a == 'M') {
                    SQL = "Insert into administrator values('" + data.getUserId() + "','" + data.getUserPw() + "','" + data.getName() + "','" + data.getGender() + "','" + data.getAge() + "','" + data.getMajor() + "')";
                } else if (a == 'D') {
                    SQL = "Insert into Doctor values('" + data.getUserId() + "','" + data.getUserPw() + "','" + data.getName() + "','" + data.getGender() + "','" + data.getAge() + "','" + data.getMajor() + "')";
                } else if (a == 'N') {
                    SQL = "Insert into Nurse values('" + data.getUserId() + "','" + data.getUserPw() + "','" + data.getName() + "','" + data.getGender() + "','" + data.getAge() + "','" + data.getMajor() + "')";
                } else {
                    showMessageDialog(null, "등록될 수 없는 아이디입니다.");
                    return false;
                }

                con = DBConnector.getConnection();
                st = DBConnector.getConnection().prepareStatement(SQL);
                int n = st.executeUpdate(SQL);
                updateConfirm(mode);
            } catch (Exception e) {
                showMessageDialog(null, "사용자 추가 실패");
                showMessageDialog(null, ",등록되어 있는 아이디입니다,");
                System.out.println("데이터베이스 추가 오류 :" + e.getMessage());
                return false;
            }
        } else if (mode == "revise") {
            if (is.isSearch(id)) {
                try {
                    if (a == 'M') {
                        SQL = "Update administrator set manno ='" + data.getUserId() + "',password='" + data.getUserPw() + "',name = '" + data.getName() + "',gender = '" + data.getGender() + "',age = '" + data.getAge() + "',major = '" + data.getMajor() + "'WHERE manno= '" + data.getUserId() + "'";
                    } else if (a == 'D') {
                        SQL = "Update Doctor set docno ='" + data.getUserId() + "',password='" + data.getUserPw() + "',name = '" + data.getName() + "',gender = '" + data.getGender() + "',age = '" + data.getAge() + "',major = '" + data.getMajor() + "'WHERE docno= '" + data.getUserId() + "'";
                    } else if (a == 'N') {
                        SQL = "Update Nurse set nurno ='" + data.getUserId() + "',password='" + data.getUserPw() + "',name = '" + data.getName() + "',gender = '" + data.getGender() + "',age = '" + data.getAge() + "',major = '" + data.getMajor() + "'WHERE nurno= '" + data.getUserId() + "'";
                    }
                    con = dbconnector.getConnection();
                    st = con.prepareStatement(SQL);
                    int n = st.executeUpdate(SQL);
                    updateConfirm(mode);
                } catch (SQLException ex) {
                    System.out.println("데이터베이스 수정 오류 :" + ex.getMessage());
                    showMessageDialog(null, " 사용자 수정 오류 : " + ex.getMessage());
                    return false;
                }
            } else {
                showMessageDialog(null, "없는 Data입니다.");
                return false;
            }
        } else if (mode == "delete") {
            if (is.isSearch(id)) {
                try {
                    if (a == 'M') {
                        SQL = "Delete from administrator where manno ='" + data.getUserId() + "'";
                    } else if (a == 'D') {
                        SQL = "Delete from Doctor where docno ='" + data.getUserId() + "'";
                    } else if (a == 'N') {
                        SQL = "Delete from Nurse where nurno ='" + data.getUserId() + "'";
                    }
                    con = dbconnector.getConnection();
                    st = con.prepareStatement(SQL);
                    int n = st.executeUpdate(SQL);
                    updateConfirm(mode);
                } catch (Exception e) {
                    System.out.println("데이터베이스 삭제 오류 :" + e.getMessage());
                    return false;
                }
            } else {
                showMessageDialog(null, "없는 Data입니다.");
                return false;
            }

        }

        return true;
    }

    @Override
    public void updateConfirm(String mode) {
        String show = "";
        if (mode == "input") {
            show = "사용자를 추가 완료하였습니다.";
        } else if (mode == "revise") {
            show = "사용자를 수정 완료하였습니다.";
        } else if (mode == "delete") {
            show = "사용자를 삭제 완료하였습니다.";
        }
        showMessageDialog(null, show);
    }

}
