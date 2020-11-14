/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import PatientCare.Home_Nurse;

/**
 *
 * @author 전규빈
 */
public class NurseEnter implements EnterBehavior {

    @Override
    public void enter() {
        System.out.println("간호사의 페이지에 접근합니다.");
        new Home_Nurse().setVisible(true);
    }
    
}
