package com.technology.textile.web.entity;

import java.util.Date;
import javax.persistence.*;

public class Menu {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "menu_str")
    private String menuStr;

    /**
     * 菜单编号
     */
    @Column(name = "menu_num")
    private String menuNum;

    /**
     * 父菜单id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 父菜单名称
     */
    @Column(name = "parent_str")
    private String parentStr;

    /**
     * 父菜单编号
     */
    @Column(name = "parent_num")
    private String parentNum;

    /**
     * 排序
     */
    @Column(name = "menu_order")
    private Integer menuOrder;

    /**
     * 菜单地址
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态(1=正常，2=删除)
     */
    private Integer status;

    /**
     * 是否显示，1=是，2=否
     */
    @Column(name = "show_type")
    private Integer showType;

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
     * 获取菜单名称
     *
     * @return menu_str - 菜单名称
     */
    public String getMenuStr() {
        return menuStr;
    }

    /**
     * 设置菜单名称
     *
     * @param menuStr 菜单名称
     */
    public void setMenuStr(String menuStr) {
        this.menuStr = menuStr;
    }

    /**
     * 获取菜单编号
     *
     * @return menu_num - 菜单编号
     */
    public String getMenuNum() {
        return menuNum;
    }

    /**
     * 设置菜单编号
     *
     * @param menuNum 菜单编号
     */
    public void setMenuNum(String menuNum) {
        this.menuNum = menuNum;
    }

    /**
     * 获取父菜单id
     *
     * @return parent_id - 父菜单id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父菜单id
     *
     * @param parentId 父菜单id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取父菜单名称
     *
     * @return parent_str - 父菜单名称
     */
    public String getParentStr() {
        return parentStr;
    }

    /**
     * 设置父菜单名称
     *
     * @param parentStr 父菜单名称
     */
    public void setParentStr(String parentStr) {
        this.parentStr = parentStr;
    }

    /**
     * 获取父菜单编号
     *
     * @return parent_num - 父菜单编号
     */
    public String getParentNum() {
        return parentNum;
    }

    /**
     * 设置父菜单编号
     *
     * @param parentNum 父菜单编号
     */
    public void setParentNum(String parentNum) {
        this.parentNum = parentNum;
    }

    /**
     * 获取排序
     *
     * @return menu_order - 排序
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * 设置排序
     *
     * @param menuOrder 排序
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取菜单地址
     *
     * @return url - 菜单地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单地址
     *
     * @param url 菜单地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * 获取是否显示，1=是，2=否
     *
     * @return show_type - 是否显示，1=是，2=否
     */
    public Integer getShowType() {
        return showType;
    }

    /**
     * 设置是否显示，1=是，2=否
     *
     * @param showType 是否显示，1=是，2=否
     */
    public void setShowType(Integer showType) {
        this.showType = showType;
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