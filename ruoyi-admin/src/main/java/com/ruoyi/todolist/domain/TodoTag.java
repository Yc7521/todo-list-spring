package com.ruoyi.todolist.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * todo_tag对象 sys_todo_tag
 *
 * @author yc7521
 * @date 2022-09-09
 */
public class TodoTag extends BaseEntity {
  private static final long serialVersionUID = 1L;

  /**
   * 编号
   */
  private Long id;

  /**
   * todo编号
   */
  @Excel(name = "todo编号")
  private Long todoId;

  /**
   * tag编号
   */
  @Excel(name = "tag编号")
  private Long tagId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
      .append("id", getId())
      .append("todoId", getTodoId())
      .append("tagId", getTagId())
      .toString();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getTodoId() {
    return todoId;
  }

  public void setTodoId(Long todoId) {
    this.todoId = todoId;
  }

  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }
}
