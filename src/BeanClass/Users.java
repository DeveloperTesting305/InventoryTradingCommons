package BeanClass;

import java.io.Serializable;

public class Users implements Serializable {

    private Integer userId;
    private String userName;
    private String password;
    private String privilege;

    public Users() {}

    public Users(Integer userId, String userName, String password, String privilege) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.privilege = privilege;
    }

    public Users(String userName, String password, String privilege) {
        this.userName = userName;
        this.password = password;
        this.privilege = privilege;
    }

    public Integer getUserId() {
        if(userId != null) return userId;
        return 0;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        if(userName != null) return userName;
        return "";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if(password != null) return password;
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilege() {
        if(privilege != null) return privilege;
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
}
