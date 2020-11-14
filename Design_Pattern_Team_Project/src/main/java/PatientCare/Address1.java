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
public class Address1 implements Address{
    private String address1;
    
    @Override
    public String RT(String a) {
        return a;
    }

    public Address1() {
        System.out.println("주소 임시 저장 클래스"); 
    }
    public boolean address1Storage(String address1) {
        System.out.println("<주소> 출력값은 : " + address1);
        this.address1 = address1;
        setAddress1(address1);        
        return true;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}
    
     