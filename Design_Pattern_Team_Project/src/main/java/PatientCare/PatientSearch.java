/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCare;

import Login.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author user
 */
public class PatientSearch {
   private Connection con = null;
   private Statement st = null;
   private ResultSet rs = null;
   String SQL ="";  
   String ide = null, name = null, roomnum = null, dateofbirth = null, gender = null, bloodtype = null, symptom = null, diagnosis = null, treatment = null, prescription = null;
   String address1 = null, address2 = null, homephone = null, cellphone = null, email = null, remark = null;
    public boolean isSearch(String id) {      
       
        char a= id.charAt(0);
        String b = id.substring(1);
    
        try {
                SQL = "SELECT * FROM patient WHERE patientid ='" + id + "'";
                rs = DBConnector.getStatement().executeQuery(SQL);
                if(rs.next()) {
                      ide=rs.getString("patientID");
                      name=rs.getString("name");
                      roomnum=rs.getString("roomnum");
                      dateofbirth=rs.getString("dateofbirth");
                      gender = rs.getString("gender");
                      bloodtype = rs.getString("bloodtype");
                      address1 = rs.getString("address1");
                      address2 = rs.getString("address2");
                      homephone = rs.getString("homephone");
                      cellphone = rs.getString("cellphone");
                      email = rs.getString("email");
                      remark = rs.getString("remark");
                      symptom = rs.getString("symptom");
                      diagnosis = rs.getString("diagnosis");
                      treatment = rs.getString("treatment");
                      prescription = rs.getString("prescription");
		}
                      if(b.equals(ide.substring(1))){
                          System.out.println("검색 시스템 확인");
                      }else{
                      return false;
                      }

                 setId(ide);
                 setRoomNumber(roomnum);
                 setName(name);
                 setDateOfBirth(dateofbirth);
                 setGender(gender);
                 setBloodType(bloodtype);
                 setAddress1(address1);
                 setAddress2(address2);
                 setHomephone(homephone);
                 setCellphone(cellphone);
                 setEmail(email);
                 setRemark(remark);
                 setSymptom(symptom);  
                 setDiagnosis(diagnosis);  
                 setTreatment(treatment);  
                 setPrescription(prescription);  
                 updateConfirm(id);
       } catch(Exception e){
                          showMessageDialog(null,"사용자 검색 실패");
			System.out.println("데이터베이스 사용자 검색 오류 :" +e.getMessage());
                          return false;
	    }
        return true;
    }
    
    
    public void updateConfirm(String mode) {
        showMessageDialog(null,"ID : "+getId()+"\n\n"+ "이름  : "+getName()+ "님이 검색되었습니다");
    }

    public String getId() {
        return ide;
    }

    public void setId(String id) {
        this.ide = id;
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

    public String getDateOfBirth() {
        return dateofbirth;
    }

    public void setDateOfBirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
}