
package Login;

import PatientCare.Home;

/**
 *
 * @author 전규빈
 */
public class DoctorEnter implements EnterBehavior {

    @Override
    public void enter() {
        System.out.println("의사의 페이지에 접근합니다.");
        new Home().setVisible(true);
    }
}
