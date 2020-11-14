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
public class Treatment implements DiagnosisInformation{
    private String treatment;
    @Override
        public String RT(String a) {
            return a;
        }
    public Treatment() {
    System.out.println("치료 임시 저장 클래스"); 
}
public boolean symptomStorage(String symptom) {
        System.out.println("<치료> 출력값은 : " + treatment);
        this.treatment = treatment;
        setTreatment(treatment);        
        return true;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}