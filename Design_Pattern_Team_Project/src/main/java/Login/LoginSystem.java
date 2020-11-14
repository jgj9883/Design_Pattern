package Login;

import javax.swing.JOptionPane;

/*
    <작성이> : 20163337 전규빈
    <제목> : 로그인 시스템 (class)
    <내용> : 아이디 TextField와 비밀번호 TextField에 친 값을 매개변수로 받아와 
    사용자 별로 유형을 나눠 각각의 화면처리, 예외 처리를 통합하는 클래스
*/
public class LoginSystem {
    protected Searchable search;
    protected EnterBehavior enter;
    private String id;
    private String pw;
    
  public LoginSystem(){}
  
  public LoginSystem(String id, String pw) {
      this.id = id;
      this.pw = pw;
  }
 
  public boolean start(String id, String pw){
         UserLogin ul = new UserLogin();
        return ul.isLogin(this);
  }
  
   public boolean isLogout() {
      int a = JOptionPane.showConfirmDialog(null,"정말 로그아웃 하시겠습니까?","Select",JOptionPane.YES_NO_OPTION);
      if(a==0){
          System.out.println("로그아웃"); 
            new Login_gui().setVisible(true);
        }
      else{
          return false;
      }
      return true;
  }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
  
  }
