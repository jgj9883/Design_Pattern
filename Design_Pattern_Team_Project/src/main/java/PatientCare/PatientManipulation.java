
package PatientCare;
import static Login.DBConnector.dbconnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author user
 */
public class PatientManipulation implements Observera {

    private String SQL = "";
    private Connection con = null;
    private Statement st = null;

    @Override
    public boolean update(String mode, PatientInforData data) {
        char a = data.getpatientid().charAt(0);

        if (mode == "revise") {

            //수정
            try {
                SQL = "Update patient set patientid ='" + data.getpatientid() + "',name='" + data.getName() + "',dateofbirth = '" + data.getDateofbirth() + "',gender = '" + data.getGender() + "',bloodtype = '" + data.getBloodtype() + "',address1 = '" + data.getAddress1()+ "',address2 = '" + data.getAddress2()+ "',homephone = '" + data.getHomephone()+ "',cellphone = '" + data.getCellphone()+ "',email = '" + data.getEmail()+ "',remark = '" + data.getRemark()+ "',symptom = '" + data.getSymptom()+ "',diagnosis = '" + data.getDiagnosis()+ "',treatment = '" + data.getTreatment()+ "',prescription = '" + data.getPrescription() + "'WHERE patientid= '" + data.getpatientid() + "'";
                con = dbconnector.getConnection();
                st = con.prepareStatement(SQL);
                int n = st.executeUpdate(SQL);
                updateConfirm(mode);
                showMessageDialog(null, "완료하였습니다.");
            } catch (SQLException ex) {
                System.out.println("데이터베이스 수정 오류 :" + ex.getMessage());
                showMessageDialog(null, " 사용자 수정 오류 : " + ex.getMessage());
                return false;
            }
        } else if (mode == "delete") {
            try {
                SQL = "Delete from administrator where patientid ='" + data.getpatientid() + "'";
                con = dbconnector.getConnection();
                st = con.prepareStatement(SQL);
                int n = st.executeUpdate(SQL);
                updateConfirm(mode);
            } catch (Exception e) {
                System.out.println("데이터베이스 삭제 오류 :" + e.getMessage());
                return false;
            }
        }

        return true;
    }

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