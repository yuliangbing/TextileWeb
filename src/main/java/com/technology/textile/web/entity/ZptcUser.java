package com.technology.textile.web.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "zptc_user")
public class ZptcUser {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 教师姓名
     */
    @Column(name = "tea_name")
    private String teaName;

    /**
     * 教师编号
     */
    @Column(name = "tea_code")
    private String teaCode;

    /**
     * 电话
     */
    private String tel;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 状态(1=正常，2=删除)
     */
    private Integer status;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取教师姓名
     *
     * @return tea_name - 教师姓名
     */
    public String getTeaName() {
        return teaName;
    }

    /**
     * 设置教师姓名
     *
     * @param teaName 教师姓名
     */
    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    /**
     * 获取教师编号
     *
     * @return tea_code - 教师编号
     */
    public String getTeaCode() {
        return teaCode;
    }

    /**
     * 设置教师编号
     *
     * @param teaCode 教师编号
     */
    public void setTeaCode(String teaCode) {
        this.teaCode = teaCode;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取状态(1=正常，2=删除)
     *
     * @return status - 状态(1=正常，2=删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(1=正常，2=删除)
     *
     * @param status 状态(1=正常，2=删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}