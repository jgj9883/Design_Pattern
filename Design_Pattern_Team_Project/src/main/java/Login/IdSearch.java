package Login;

import java.sql.ResultSet;

/**
 *
 * @author 전규빈
 */
public class IdSearch implements Searchable {

    private ResultSet rs = null;
    String auth = null;
    String SQL = "";

    public IdSearch() {
        System.out.println("ID 검색 클래스");
    }

    @Override
    public boolean isSearch(LoginSystem sys) {
        System.out.println("ID를 검색합니다 !!");
        String id = sys.getId();
        char a = id.charAt(0);
        try {
            if (a == 'M') {
                SQL = "SELECT * FROM administrator WHERE manno ='" + id + "'";
                rs = DBConnector.getStatement().executeQuery(SQL);
                if (rs.next()) {
                    auth = rs.getString("manno");
                }
            } else if (a == 'D') {
                SQL = "SELECT * FROM doctor WHERE docno ='" + id + "'";
                rs = DBConnector.getStatement().executeQuery(SQL);
                if (rs.next()) {
                    auth = rs.getString("docno");
                }
            } else if (a == 'N') {
                SQL = "SELECT * FROM nurse WHERE nurno ='" + id + "'";
                rs = DBConnector.getStatement().executeQuery(SQL);
                if (rs.next()) {
                    auth = rs.getString("nurno");
                }
            }
            if (id.equals(auth)) {
                System.out.println("아이디가 확인되었습니다.");
                return true;
            } else {
                System.out.println("아이디가 틀렸습니다.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("데이터베이스 검색 오류 :" + e.getMessage());
            return false;
        }
    }
}
