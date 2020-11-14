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
public class Address2 implements Address{
    private String address2;
    
    @Override
    public String RT(String a) {
        return a;
    }

    public Address2() {
        System.out.println("상세주소 임시 저장 클래스"); 
    }
    public boolean address2Storage(String address2) {
        System.out.println("<상세주소> 출력값은 : " + address2);
        this.address2 = address2;
        setAddress2(address2);        
        return true;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}