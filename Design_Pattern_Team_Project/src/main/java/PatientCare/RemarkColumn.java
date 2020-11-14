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
public class RemarkColumn implements Remark{
    private String remarkcolumn;
    @Override
        public String RT(String a) {
            return a;
        }
    public RemarkColumn() {
    System.out.println("비고 임시 저장 클래스"); 
}
public boolean remarkcolumnStorage(String remarkcolumn) {
        System.out.println("<비고> 출력값은 : " + remarkcolumn);
        this.remarkcolumn = remarkcolumn;
        setRemarkColumn(remarkcolumn);        
        return true;
    }

    public String getRemarkColumn() {
        return remarkcolumn;
    }

    public void setRemarkColumn(String remarkcolumn) {
        this.remarkcolumn = remarkcolumn;
    }
}
