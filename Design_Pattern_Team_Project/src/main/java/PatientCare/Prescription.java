/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCare;

/**
 *
 * @author user
 */
public class Prescription implements DiagnosisInformation{
    private String prescription;
    @Override
        public String RT(String a) {
            return a;
        }
    public Prescription() {
    System.out.println("처방 임시 저장 클래스"); 
}
public boolean symptomStorage(String prescription) {
        System.out.println("<처방> 출력값은 : " + prescription);
        this.prescription = prescription;
        setPrescription(prescription);        
        return true;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}