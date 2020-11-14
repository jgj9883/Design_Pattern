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
public class Diagnosis implements DiagnosisInformation{
    private String diagnosis;
    @Override
        public String RT(String a) {
            return a;
        }
    public Diagnosis() {
    System.out.println("진단 임시 저장 클래스"); 
}
public boolean diagnosisStorage(String diagnosis) {
        System.out.println("<진단> 출력값은 : " + diagnosis);
        this.diagnosis = diagnosis;
        setDiagnosis(diagnosis);        
        return true;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}