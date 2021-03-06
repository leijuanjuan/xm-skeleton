package com.xm.admin.module.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xm.admin.common.constant.CommonConstant;
import com.xm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaomalover
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("sys_admin")
public class Admin extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String address;

    private String avatar = CommonConstant.USER_DEFAULT_AVATAR;

    private String description;

    private String email;

    private String mobile;

    private String nickName;

    private String password;

    private Integer sex;

    private Integer status = CommonConstant.USER_STATUS_NORMAL;

    private Integer type = CommonConstant.USER_TYPE_NORMAL;

    private String username;

    private String departmentId;

    private String street;

    private String passStrength;

    @TableField(exist = false)
    private String departmentTitle;

    @TableField(exist = false)
    private List<Role> roles;

    @TableField(exist = false)
    private List<Permission> permissions;
}
