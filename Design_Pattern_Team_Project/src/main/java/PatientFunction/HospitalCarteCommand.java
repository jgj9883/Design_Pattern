package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 식단표 호출 커맨드 (class)
     <내용> : Command 인터페이스를 상속 받아서 인터페이스의 excute 메소드를 구현하여
    Carte 클래스의 getCarte 메소드를 호출한다.
 */

public class HospitalCarteCommand implements Command {

    Carte carte;

    public HospitalCarteCommand(Carte carte) {
        this.carte = carte;
    }

    public void execute() {
        carte.getCarte();
    }

}
