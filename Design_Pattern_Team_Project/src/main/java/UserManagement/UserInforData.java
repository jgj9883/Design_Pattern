package UserManagement;

import java.util.LinkedList;

/*
    <작성이> : 20163337 전규빈
    <제목> : 사용자 관리 데이터들 (class)
    <내용> : 사용자 관리 데이터들을 옵저버 패턴을 사용하기 위해 LinkedList를 사용하여 유기적으로 연결한다.
    registeObserver을 이용한 setUserChanged을 통한 값  초기화, notifyObserver를 이용하여 옵저버의 업데이트를 한다.
    상태를 굳이 저장할 필요가 없는 경우여서 상태를 저장하지 않고 값들을 보여주는 형식으로 공유한다.
 */
public class UserInforData extends Subject {

    private String userId;
    private String userPw;
    private String name;
    private String gender;
    private String age;
    private String major;

    public UserInforData(String userId) {
        this.userId = userId;
    }

    public UserInforData(String userId, String userPw, String name, String gender, String age, String major) {
        this.userId = userId;
        this.userPw = userPw;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.major = major;
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println("New 사용자 등록");
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("사용자 Delete");
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public boolean notifyObserver(String mode, UserInforData nd, UserManipulation um) {

        if (mode == "input") {
            if (um.update(mode, this)) {
                System.out.println("옵저버 추가 업데이트!! " + "사용자의 ID : " + userId + " " + "PW :" + userPw + " " + "이름 : " + name + " " + "성 : " + gender + " " + "나이 : " + age + " " + " 직업 : " + major);
            } else {
                return false;
            }
        } else if (mode == "revise") {
            if (um.update(mode, this)) {
                System.out.println("옵저버 수정 업데이트!! " + "사용자의 ID : " + userId + " " + "PW :" + userPw + " " + "이름 : " + name + " " + "성 : " + gender + " " + "나이 : " + age + " " + " 직업 : " + major);
            } else {
                return false;
            }
        } else if (mode == "delete") {
            if (um.update(mode, this)) {
                System.out.println("옵저버 삭제 업데이트!! ");
            } else {
                return false;
            }

        }
        return true;
    }

    public boolean setUserChanged(String mode, UserInforData nd, UserManipulation um) {
        this.userId = nd.getUserId();
        this.userPw = nd.getUserPw();
        this.name = nd.getName();
        this.gender = nd.getGender();
        this.age = nd.getAge();
        this.major = nd.getMajor();
        if (userchanged(mode, nd, um)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean userchanged(String mode, UserInforData nd, UserManipulation um) {
        if (notifyObserver(mode, nd, um)) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

}
