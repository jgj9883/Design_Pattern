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
public class HomePhone implements ContactInformation{
    private String homephone;
    @Override
        public String RT(String a) {
            return a;
        }
    public HomePhone() {
    System.out.println("집전화 임시 저장 클래스"); 
}
public boolean homephoneStorage(String homephone) {
        System.out.println("<집전화> 출력값은 : " + homephone);
        this.homephone = homephone;
        setHomePhone(homephone);        
        return true;
    }

    public String getHomePhone() {
        return homephone;
    }

    public void setHomePhone(String homephone) {
        this.homephone = homephone;
    }
}