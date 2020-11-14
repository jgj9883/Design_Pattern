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
public class Name implements PersonalInformation{
    private String name;
    
    @Override
    public String RT(String a) {
        return a;
    }

    public Name() {
        System.out.println("이름 임시 저장 클래스"); 
    }
    public boolean nameStorage(String name) {
        System.out.println("<이름 > 출력값은 : " + name);
        this.name = name;
        setName(name);        
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     
}
