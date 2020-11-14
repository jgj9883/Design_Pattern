package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 당직표 호출 (class)
     <내용> : 클라이언트에게 hospitalCarteCommand로 명령을 받았을 때 excute할 경우에
    이 클래스에서 구현한 watchBill 메소드를 호출한다.    
 */

public class Duty {

    private String Duty;

    public Duty(String Duty) {
        this.Duty = Duty;
    }

    public void watchBill() { // watchBill은 당직표를 뜻함
        System.out.println(Duty + " 확인");
        new Duty_gui().setVisible(true);
    }
}
