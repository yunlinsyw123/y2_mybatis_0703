package demo;

import java.util.List;

public class TRoles {
    int roleId;
    String roleRolename;
    String roleDemo;
    List<TUser> user;

    public TRoles() {
    }

    @Override
    public String toString() {
        return "TRoles{" +
                "roleId=" + roleId +
                ", roleRolename='" + roleRolename + '\'' +
                ", roleDemo='" + roleDemo + '\'' +
                ", user=" + user +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleRolename() {
        return roleRolename;
    }

    public void setRoleRolename(String roleRolename) {
        this.roleRolename = roleRolename;
    }

    public String getRoleDemo() {
        return roleDemo;
    }

    public void setRoleDemo(String roleDemo) {
        this.roleDemo = roleDemo;
    }

    public List<TUser> getUser() {
        return user;
    }

    public void setUser(List<TUser> user) {
        this.user = user;
    }

    public TRoles(int roleId, String roleRolename, String roleDemo, List<TUser> user) {
        this.roleId = roleId;
        this.roleRolename = roleRolename;
        this.roleDemo = roleDemo;
        this.user = user;
    }
}
