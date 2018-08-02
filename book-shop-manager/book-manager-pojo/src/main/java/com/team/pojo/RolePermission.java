package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_role_permission")
public class RolePermission implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色ID
     */
    private Integer roleid;

    /**
     * 权限ID
     */
    private Integer permissionid;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     *
     * @return roleid - 角色ID
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色ID
     *
     * @param roleid 角色ID
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取权限ID
     *
     * @return permissionid - 权限ID
     */
    public Integer getPermissionid() {
        return permissionid;
    }

    /**
     * 设置权限ID
     *
     * @param permissionid 权限ID
     */
    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}