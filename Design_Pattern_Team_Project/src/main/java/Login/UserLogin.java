
package Login;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author 전규빈
 */
public class UserLogin extends LoginSystem {

    public boolean isLogin(LoginSystem sys) {
        IdSearch ie = new IdSearch();
        PwSearch pe = new PwSearch();
        char a = sys.getId().charAt(0);
        
        if(ie.isSearch(sys) && pe.isSearch(sys)){
            showMessageDialog(null,"로그인 성공 ");
            if(a=='M'){
                AdministratorEnter page = new AdministratorEnter();
                page.enter();
            }else if(a=='D'){
                DoctorEnter page = new DoctorEnter(); 
                page.enter();
            }else if(a=='N'){
                NurseEnter page = new NurseEnter(); 
                page.enter();
            }
            return true;
        }else{
            showMessageDialog(null,"암호가 틀렸습니다.   다시 확인해주세요");
            return false;
        }
        
    }  
}
