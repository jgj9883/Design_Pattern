package UserManagement;

/*
    <작성이> : 20163337 전규빈
    <제목> : 옵저버 인터페이스 (interface)
    <내용> : 옵저버 인터페이스로 update문을 
    추상 메소드로 정의한다.
 */
public interface Observer {

    public abstract boolean update(String mode, UserInforData data);
}
