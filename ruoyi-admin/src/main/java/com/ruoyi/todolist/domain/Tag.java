package com.ruoyi.todolist.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 标签对象 sys_tag
 *
 * @author yc7521
 * @date 2022-09-09
 */
public class Tag extends BaseEntity {
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
   * 颜色
   */
  @Excel(name = "颜色")
  private String color;

  /**
   * 创建时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date createdTime;

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
      .append("id", getId())
      .append("title", getTitle())
      .append("color", getColor())
      .append("createdTime", getCreatedTime())
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

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }
}
