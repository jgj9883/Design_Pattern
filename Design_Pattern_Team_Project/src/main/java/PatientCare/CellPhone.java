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
public class CellPhone implements ContactInformation{
    private String cellphone;
    @Override
        public String RT(String a) {
            return a;
        }
    public CellPhone() {
    System.out.println("휴대전화 임시 저장 클래스"); 
}
public boolean cellphoneStorage(String cellphone) {
        System.out.println("<휴대전화> 출력값은 : " + cellphone);
        this.cellphone = cellphone;
        setCellPhone(cellphone);        
        return true;
    }

    public String getCellPhone() {
        return cellphone;
    }

    public void setCellPhone(String cellphone) {
        this.cellphone = cellphone;
    }
}