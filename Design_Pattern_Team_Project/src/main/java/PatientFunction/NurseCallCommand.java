package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 간호사 호출 커맨드 (class)
     <내용> : Command 인터페이스를 상속 받아서 인터페이스의 excute 메소드를 구현하여
    Call 클래스의 nursecall 메소드를 호출한다.    
 */

public class NurseCallCommand implements Command {

    Call call;

    public NurseCallCommand(Call call) {
        this.call = call;
    }

    public void execute() {
        call.nurseCall();
    }
}
