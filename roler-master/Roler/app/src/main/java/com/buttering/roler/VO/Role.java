package com.buttering.roler.VO;

/**
 * Created by ichaeeun on 2016. 7. 30..
 */
public class Role {

    private int id;
    private int rolePrimary;
    private String roleName;
    private String roleContent;
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleContent() {
        return roleContent;
    }

    public void setRoleContent(String roleContent) {
        this.roleContent = roleContent;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRolePrimary() {
        return rolePrimary;
    }

    public void setRolePrimary(int rolePrimary) {
        this.rolePrimary = rolePrimary;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
