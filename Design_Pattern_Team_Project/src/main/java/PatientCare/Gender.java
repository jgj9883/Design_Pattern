/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCare;
import PatientCare.addPatient;
/**
 *
 * @author user
 */
public class Gender implements PersonalInformation{
    private String gender;    
    @Override
     public String RT(String a) {
     return a;
     }

    public Gender() {
        System.out.println("성별 임시 저장 클래스"); 
    }
    public boolean genderStorage(String gender) {
        System.out.println("<성별 > 출력값은 : " + gender);
        this.gender = gender;
        setGender(gender);        
        return true;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
    
     
