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
public class Email implements ContactInformation{
    private String email;
    @Override
        public String RT(String a) {
            return a;
        }
    public Email() {
    System.out.println("이메일 임시 저장 클래스"); 
}
public boolean emailStorage(String email) {
        System.out.println("<이메일> 출력값은 : " + email);
        this.email = email;
        setEmail(email);        
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}