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
public class RoomNumber implements PersonalInformation{
    private String roomnum;
    
    @Override
    public String RT(String a) {
        return a;
    }

    public RoomNumber() {
        System.out.println("병실 임시 저장 클래스"); 
    }
    public boolean roomnumStorage(String roomnum) {
        System.out.println("<병실> 출력값은 : " + roomnum);
        this.roomnum = roomnum;
        setRoomNumber(roomnum);        
        return true;
    }

    public String getRoomNumber() {
        return roomnum;
    }

    public void setRoomNumber(String roomnum) {
        this.roomnum = roomnum;
    }
    
     
}
