/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCare;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class PatientInforData extends Subjecta {

    private String patientid;
    private String roomnum;
    private String name;
    private String dateofbirth;
    private String gender;
    private String bloodtype;
    private String address1;
    private String address2;
    private String homephone;
    private String cellphone;
    private String email;
    private String remark;
    private String symptom;
    private String diagnosis;
    private String treatment;
    private String prescription;


    public PatientInforData(String patientid, String roomnum, String name, String dateofbirth, String gender, String bloodtype, String address1, String address2, String homephone, String cellphone, String email, String remark, String symptom, String diagnosis, String treatment, String prescription) {
        this.patientid = patientid;
        this.roomnum = roomnum;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.bloodtype = bloodtype;
        this.address1 = address1;
        this.address2 = address2;
        this.homephone = homephone;
        this.cellphone = cellphone;
        this.email = email;
        this.remark = remark;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
        observers = new LinkedList<>();
    }

    public void registerObservera(Observera o) {
        System.out.println("New 환자 등록");
        observers.add(o);

    }

    public void removeObservera(Observera o) {
        System.out.println("환자 Delete");
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservera(String mode, PatientInforData nd, PatientManipulation um) {

        if (mode == "revise") {
            System.out.println("수정");
            um.update(mode, this);
        } else if (mode == "delete") {
            System.out.println("삭제");
            um.update(mode, this);
            
        } 
    }

    public boolean setPatientChanged(String mode, PatientInforData nd, PatientManipulation um) {
        this.patientid = nd.getpatientid();
        this.roomnum = nd.getRoomnum();
        this.name = nd.getName();
        this.dateofbirth = nd.getDateofbirth();
        this.gender = nd.getGender();
        this.bloodtype = nd.getBloodtype();
        this.address1 = nd.getAddress1();
        this.address2 = nd.getAddress2();
        this.homephone = nd.getHomephone();
        this.cellphone = nd.getCellphone();
        this.email = nd.getEmail();
        this.remark = nd.getRemark();
        this.symptom = nd.getSymptom();
        this.diagnosis = nd.getDiagnosis();
        this.treatment = nd.getTreatment();
        this.prescription = nd.getPrescription();

        patientchanged(mode, nd, um);
        return true;
    }

    public void patientchanged(String mode, PatientInforData nd, PatientManipulation um) {
        notifyObservera(mode, nd, um);
    }

    public String getpatientid() {
        return patientid;
    }

    public void setpatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
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

    public void setDiagnosis(String diangosis) {
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