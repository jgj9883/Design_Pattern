package WardManagement;

import Login.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author HyunSung <gus005479@daum.net>
 */
class mainWard extends Ward {

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    String SQL = "";
    ArrayList list = new ArrayList();

    public mainWard() {
    }

    protected ArrayList update(String id) {
        
        try{
        SQL = "SELECT roomnum, name, dateofbirth, diagnosis FROM patient WHERE roomnum ='" + id + "'";
        rs = DBConnector.getStatement().executeQuery(SQL);
        while (rs.next()) {
            HashMap map = new HashMap();
            map.put("roomnum", rs.getString(1));
            map.put("name", rs.getString(2));
            map.put("dateofbirth", rs.getString(3));
            map.put("diagnosis", rs.getString(4));
            list.add(map);
        }
        }catch (Exception e) {
            showMessageDialog(null, "환자 확인 실패");
            System.out.println("데이터베이스 환자 검색 오류 :" + e.getMessage());
    }
        return list;
    }
    

    protected void care() {
        System.out.println("일반 환자 관리");
        new mWardCheckGUI().setVisible(true);
    }

}
