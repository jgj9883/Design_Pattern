package PatientFunction;

/**
 *
 * @author min
 */
public class PatientTestDriver {

    public static void main(String[] args) {
        PatientFunction command = new PatientFunction();

        // 리시버와 커맨드 객체 생성
        Carte carte = new Carte("0");
        Command hospitalCarteCommand = new HospitalCarteCommand(carte);
        Call nurseCall = new Call("간호사");
        Command nurseCallCommand = new NurseCallCommand(nurseCall);
        Duty duty = new Duty("당직표");
        Command nightDutyCommand = new NightDutyCommand(duty);

        // 커맨드 배열 저장
        command.setCommand(0, hospitalCarteCommand);
        command.setCommand(1, nurseCallCommand);
        command.setCommand(2, nightDutyCommand);

        // 커맨드 실행
        command.executeCommand(0);
        command.executeCommand(1);
        command.executeCommand(2);

    }

}
