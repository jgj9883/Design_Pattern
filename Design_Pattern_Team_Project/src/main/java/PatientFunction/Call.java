package PatientFunction;

import javax.swing.JOptionPane;

/*
     <작성이> : 20153326 민병철
     <제목> : 간호사 호출 (class)
     <내용> : 클라이언트에게 nurseCallCommand로 명령을 받았을 때 excute할 경우에
    이 클래스에서 구현한 nurseCall 메소드를 호출한다.    
 */
public class Call {

    private String nurse;

    public Call(String nurse) {
        this.nurse = nurse;
    }

    public void nurseCall() {

        System.out.println(nurse + " 호출 메뉴");
        int a = JOptionPane.showConfirmDialog(null, "간호사를 호출 하시겠습니까?",
                "간호사 호출", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            JOptionPane.showMessageDialog(null, ("간호사를 호출했습니다."));
            System.out.println("간호사를 호출했습니다.");
        } else {
            System.out.println("간호사를 호출하지 않았습니다.");
        }
    }
}
