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
//(String)jComboBox1.getSelectedItem() + jTextField1.getText();
public class PatientID implements PersonalInformation {

    private String id;

    public String RT(String a) {
        return a;
    }

    public PatientID() {
        System.out.println("아이디 임시 저장 클래스");      
    }
    
    public boolean idStorage(String id) {
        System.out.println("<아이디> 출력값은 : " + id);
        this.id = id;
        setId(id);        
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
