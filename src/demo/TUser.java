package demo;

import java.util.List;

public class TUser {
    int userId;
    String userUsername;
    String userPwd;
    String userRealname;
    List<TRoles> roles;

    public TUser() {
    }

    public TUser(int userId, String userUsername, String userPwd, String userRealname, List<TRoles> roles) {
        this.userId = userId;
        this.userUsername = userUsername;
        this.userPwd = userPwd;
        this.userRealname = userRealname;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userId=" + userId +
                ", userUsername='" + userUsername + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userRealname='" + userRealname + '\'' +
                ", roles=" + roles +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public List<TRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<TRoles> roles) {
        this.roles = roles;
    }
}
