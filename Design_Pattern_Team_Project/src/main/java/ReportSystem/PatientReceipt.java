package ReportSystem;
/**
 *
 * @author HyunSung <gus005479@daum.net>
 */
import Login.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

public class PatientReceipt implements Receipt {
    static String name = null;
    static String birth = null;
    static String patientid = null;
    static String symptom = null;
    static String diagnosis = null;
    static String treatment = null, remark = null;
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    int pay;
    String SQL = "";
    
    public void viewReceipt(String pname, String pbirth) {        
        System.out.println("보고서 확인");
        try {
            SQL = "SELECT * FROM patient WHERE name ='" + pname + "' and dateofbirth = '"+pbirth+"'";
            //SQL = "SELECT * FROM administrator WHERE manno ='" + id + "'";
            rs = DBConnector.getStatement().executeQuery(SQL);
            if(rs.next()){
            name = rs.getString("name");
            birth = rs.getString("dateofbirth");
            symptom = rs.getString("symptom");
            diagnosis = rs.getString("diagnosis");
            treatment = rs.getString("treatment");
            remark = rs.getString("remark");
            }
            new ReceiptGUI(name,birth,symptom,diagnosis,treatment,remark).setVisible(true);
        } catch (Exception e) {
            showMessageDialog(null, "환자 확인 실패");
            System.out.println("데이터베이스 사용자 검색 오류 :" + e.getMessage());
        }
    }
    public void print() {
        System.out.println(name + "영수증 출력");
        System.out.println("생년월일 : "+ birth);
        System.out.println("증상     : "+ symptom);
        System.out.println("진단내용 : "+ diagnosis);
        System.out.println("처방전 : "+ treatment);
        System.out.println("가격 : "+ remark);  
    }
}
