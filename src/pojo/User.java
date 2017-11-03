package pojo;

import java.sql.SQLException;

/**
 * Created by Administrator on 2017/10/30.
 */
public class User {

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User() {
    }

    public Boolean isExist() throws SQLException{
       User user = new User(account,password);
        DBHelper db = new DBHelper();
        return db.Query(user);
    }
}
