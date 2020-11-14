/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import UserManagement.UserManagement_gui;

/**
 *
 * @author 전규빈
 */
public class AdministratorEnter implements EnterBehavior  {

    @Override
    public void enter() {
        System.out.println("관리자의 페이지에 접근합니다.");
        new UserManagement_gui().setVisible(true);
     }
    
}
