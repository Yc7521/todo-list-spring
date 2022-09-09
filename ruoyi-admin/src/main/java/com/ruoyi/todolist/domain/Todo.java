package com.ruoyi.todolist.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 代办对象 sys_todo
 *
 * @author yc7521
 * @date 2022-09-09
 */
public class Todo extends BaseEntity {
  private static final long serialVersionUID = 1L;

  /**
   * 编号
   */
  private Long id;

  /**
   * 标题
   */
  @Excel(name = "标题")
  private String title;

  /**
   * 描述
   */
  @Excel(name = "描述")
  private String description;

  /**
   * 创建时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date createdTime;

  /**
   * 到期时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "到期时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date expiredTime;

  /**
   * 优先级
   */
  @Excel(name = "优先级")
  private Long priority;

  /**
   * 父事项编号
   */
  @Excel(name = "父事项编号")
  private Long parentId;

  /**
   * 用户编号
   */
  @Excel(name = "用户编号")
  private Long userId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
      .append("id", getId())
      .append("title", getTitle())
      .append("description", getDescription())
      .append("createdTime", getCreatedTime())
      .append("expiredTime", getExpiredTime())
      .append("priority", getPriority())
      .append("parentId", getParentId())
      .append("userId", getUserId())
      .toString();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public Date getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(Date expiredTime) {
    this.expiredTime = expiredTime;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }
}
