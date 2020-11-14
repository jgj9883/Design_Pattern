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
public class Symptom implements DiagnosisInformation{
    private String symptom;
    @Override
        public String RT(String a) {
            return a;
        }
    public Symptom() {
    System.out.println("증상 임시 저장 클래스"); 
}
public boolean symptomStorage(String symptom) {
        System.out.println("<증상> 출력값은 : " + symptom);
        this.symptom = symptom;
        setSymptom(symptom);        
        return true;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}