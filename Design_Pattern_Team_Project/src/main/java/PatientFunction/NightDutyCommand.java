package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 당직표 호출 커맨드 (class)
     <내용> : Command 인터페이스를 상속 받아서 인터페이스의 excute 메소드를 구현하여
    Duty 클래스의 watchBill 메소드를 호출한다. 
 */

public class NightDutyCommand implements Command {

    Duty duty;

    public NightDutyCommand(Duty duty) {
        this.duty = duty;
    }

    public void execute() {
        duty.watchBill();
    }
}
