package PatientFunction;

import javax.swing.JOptionPane;

/*
     <작성이> : 20153326 민병철
     <제목> : 명령 없음 (Class)
     <내용> : 슬롯에 지정되지 않은 명령을 실행할 경우에 대신 실행되는 
    클래스이다.
 */

public class NoCommand implements Command {

    @Override
    public void execute() {

        System.out.println("잘못된 명령입니다.");
        JOptionPane.showMessageDialog(null, ("잘못된 명령입니다."));
    }

}
