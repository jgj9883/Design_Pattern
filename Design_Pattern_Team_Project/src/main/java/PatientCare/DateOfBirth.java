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

public class DateOfBirth implements PersonalInformation{
    private String dateofbirth;
    @Override
        public String RT(String a) {
            return a;
        }
    public DateOfBirth() {
    System.out.println("생년월일 임시 저장 클래스"); 
}
public boolean dateofbirthStorage(String dateofbirth) {
        System.out.println("<생년월일 > 출력값은 : " + dateofbirth);
        this.dateofbirth = dateofbirth;
        setDateOfBirth(dateofbirth);        
        return true;
    }

    public String getDateOfBirth() {
        return dateofbirth;
    }

    public void setDateOfBirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
    
     