package PatientCare;

import Login.DBConnector;
import java.sql.Connection;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

public class WardPatientProfileFactory {

    String SQL = "";
    Connection con = null;
    Statement st = null;
    String id;
    String name;
    String gender;
    String dateofbirth;
    String bloodtype;
    String address1;
    String address2;
    String homephone;
    String cellphone;
    String email;
    String remarkcolumn;
    String roomnum;

    public WardPatientProfileFactory() {
    }

    public void createPatientID(PatientID pa_id) {
        String id = pa_id.getId();
        System.out.println("아이디의 출력 값은 : " + id);
        setId(id);
    }
    
    public void createRoomNumber(RoomNumber pa_roomnum) {
        String roomnum = pa_roomnum.getRoomNumber();
        System.out.println("병실의 출력 값은 : " + roomnum);
        setRoomNumber(roomnum);
    }

    public void createName(Name pa_name) {
        String name = pa_name.getName();
        System.out.println("이름의 출력 값은 : " + name);
        setName(name);
    }
    
    public void createDateOfBirth(DateOfBirth pa_dateofbirth) {
        String dateofbirth = pa_dateofbirth.getDateOfBirth();
        System.out.println("생년월일의 출력 값은 : " + dateofbirth);
        setDateOfBirth(dateofbirth);
    }
    
    public void createGender(Gender pa_gender) {
        String gender = pa_gender.getGender();
        System.out.println("성별의 출력 값은 : " + gender);
        setGender(gender);
    }
    
    public void createBloodType(BloodType pa_bloodtype) {
        String bloodtype = pa_bloodtype.getBloodType();
        System.out.println("혈액형의 출력 값은 : " + bloodtype);
        setBloodType(bloodtype);
    }
    
    public void createAddress1(Address1 pa_address1) {
        String address1 = pa_address1.getAddress1();
        System.out.println("주소의 출력 값은 : " + address1);
        setAddress1(address1);
    }
    
    public void createAddress2(Address2 pa_address2) {
        String address2 = pa_address2.getAddress2();
        System.out.println("상세주소의 출력 값은 : " + address2);
        setAddress2(address2);
    }
    
    public void createHomePhone(HomePhone pa_homephone) {
        String homephone = pa_homephone.getHomePhone();
        System.out.println("집전화의 출력 값은 : " + homephone);
        setHomePhone(homephone);
    }
    
    public void createCellPhone(CellPhone pa_cellphone) {
        String cellphone = pa_cellphone.getCellPhone();
        System.out.println("휴대전화의 출력 값은 : " + cellphone);
        setCellPhone(cellphone);
    }
    
    public void createEmail(Email pa_email) {
        String email = pa_email.getEmail();
        System.out.println("이메일의 출력 값은 : " + email);
        setEmail(email);
    }
    
    public void createRemarkColumn(RemarkColumn pa_remarkcolumn) {
        String remarkcolumn = pa_remarkcolumn.getRemarkColumn();
        System.out.println("비고의 출력 값은 : " + remarkcolumn);
        setRemarkColumn(remarkcolumn);
    }

    public void sqlFuction() {
        try {
            SQL = "Insert into patient values('" + getId() + "','" + getRoomNumber() + "','" + getName() + "','"+ getDateOfBirth() + "','" + getGender() + "','" + getBloodType() + "','" + getAddress1() + "','" + getAddress2() + "','" + getHomePhone() + "','" + getCellPhone() + "','" + getEmail() + "','" + getRemarkColumn() + "','" + null +"','" + null+"','" + null +"','" + null +"')";
            con = DBConnector.getConnection();
            st = DBConnector.getConnection().prepareStatement(SQL);
            st.executeUpdate(SQL);
            showMessageDialog(null, "환자 추가 성공");
        } catch (Exception e) {
            showMessageDialog(null, "환자 추가 실패");
            System.out.println("데이터베이스 추가 오류 :" + e.getMessage());
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomnum;
    }

    public void setRoomNumber(String roomnum) {
        this.roomnum = roomnum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private void setDateOfBirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    private String getGender() {
        return gender;
    }

    private String getDateOfBirth() {
        return dateofbirth;
    }
    
    public String getBloodType() {
        return bloodtype;
    }

    public void setBloodType(String bloodtype) {
        this.bloodtype = bloodtype;
    }
    
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    public String getHomePhone() {
        return homephone;
    }

    public void setHomePhone(String homephone) {
        this.homephone = homephone;
    }
    
    public String getCellPhone() {
        return cellphone;
    }

    public void setCellPhone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRemarkColumn() {
        return remarkcolumn;
    }

    public void setRemarkColumn(String remarkcolumn) {
        this.remarkcolumn = remarkcolumn;
    }
    
}
