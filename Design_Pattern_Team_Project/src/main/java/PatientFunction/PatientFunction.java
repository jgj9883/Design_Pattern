package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 환자 기능 (class)
     <내용> : 커맨드 패턴의 인보커 클래스에 해당하는 부분으로 명령을 설정하기
     위해서 슬롯 번호를 지정하고 명령의 실행을 요청하는 호출자 클래스이다.
 */

public class PatientFunction {

    Command[] Commands;

    public PatientFunction() {
        Commands = new Command[3];
        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 3; i++) {
            Commands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command command) {
        Commands[slot] = command;

    }

    public void executeCommand(int slot) {

        Commands[slot].execute();
    }

}
