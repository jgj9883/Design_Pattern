package PatientFunction;

/*
     <작성이> : 20153326 민병철
     <제목> : 식단표 호출 (class)
     <내용> : 클라이언트에게 hospitalCarteCommand로 명령을 받았을 때 excute할 경우에
    이 클래스에서 구현한 getCarte 메소드를 호출한다.    
 */

public class Carte {

    private String carte;

    public Carte(String carte) {
        this.carte = carte;
    }

    public void getCarte() {
        System.out.println(carte + " 확인");
        new Carte_gui().setVisible(true);
    }
}
