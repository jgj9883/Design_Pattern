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
public class BloodType implements PersonalInformation{
    private String bloodtype;
    @Override
        public String RT(String a) {
            return a;
        }
    public BloodType() {
    System.out.println("혈액형 임시 저장 클래스"); 
}
public boolean bloodtypeStorage(String bloodtype) {
        System.out.println("<혈액형> 출력값은 : " + bloodtype);
        this.bloodtype = bloodtype;
        setBloodType(bloodtype);        
        return true;
    }

    public String getBloodType() {
        return bloodtype;
    }

    public void setBloodType(String bloodtype) {
        this.bloodtype = bloodtype;
    }
}
    
  