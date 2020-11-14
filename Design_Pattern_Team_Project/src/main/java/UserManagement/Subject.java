package UserManagement;

import java.util.List;

/*
    <작성이> : 20163337 전규빈
    <제목> : subject 인터페이스 (interface)
    <내용> : subject 인터페이스로 다양한 옵저버와 
    연결되있을 수 있다. 각종 옵저버들을 정의해준다.
 */
public abstract class Subject {

    protected List<Observer> observers;
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract boolean notifyObserver(String mode, UserInforData data, UserManipulation um);

}
