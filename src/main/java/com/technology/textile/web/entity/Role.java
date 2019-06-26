package com.technology.textile.web.entity;

import java.util.Date;
import javax.persistence.*;

public class Role {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色编号
     */
    @Column(name = "role_num")
    private String roleNum;

    /**
     * 是否默认
     */
    @Column(name = "is_default")
    private Integer isDefault;

    /**
     * 排序
     */
    @Column(name = "role_order")
    private Integer roleOrder;

    /**
     * 状态(1=正常，2=删除)
     */
    private Integer status;

    /**
     * 是否初始化，1=是，2=否
     */
    @Column(name = "is_init")
    private Integer isInit;

    /**
     * 创建人id
     */
    @Column(name = "create_id")
    private Long createId;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人id
     */
    @Column(name = "modify_id")
    private Long modifyId;

    /**
     * 修改人
     */
    @Column(name = "modify_user")
    private String modifyUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

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
     * 获取角色编号
     *
     * @return role_num - 角色编号
     */
    public String getRoleNum() {
        return roleNum;
    }

    /**
     * 设置角色编号
     *
     * @param roleNum 角色编号
     */
    public void setRoleNum(String roleNum) {
        this.roleNum = roleNum;
    }

    /**
     * 获取是否默认
     *
     * @return is_default - 是否默认
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认
     *
     * @param isDefault 是否默认
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取排序
     *
     * @return role_order - 排序
     */
    public Integer getRoleOrder() {
        return roleOrder;
    }

    /**
     * 设置排序
     *
     * @param roleOrder 排序
     */
    public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
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

    /**
     * 获取是否初始化，1=是，2=否
     *
     * @return is_init - 是否初始化，1=是，2=否
     */
    public Integer getIsInit() {
        return isInit;
    }

    /**
     * 设置是否初始化，1=是，2=否
     *
     * @param isInit 是否初始化，1=是，2=否
     */
    public void setIsInit(Integer isInit) {
        this.isInit = isInit;
    }

    /**
     * 获取创建人id
     *
     * @return create_id - 创建人id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置创建人id
     *
     * @param createId 创建人id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人id
     *
     * @return modify_id - 修改人id
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * 设置修改人id
     *
     * @param modifyId 修改人id
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * 获取修改人
     *
     * @return modify_user - 修改人
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置修改人
     *
     * @param modifyUser 修改人
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
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
}