package com.ruoyi.todolist.service;

import com.ruoyi.todolist.domain.TodoTag;

import java.util.List;

/**
 * todo_tagService接口
 *
 * @author yc7521
 * @date 2022-09-09
 */
public interface ITodoTagService {
  /**
   * 查询todo_tag
   *
   * @param id todo_tag主键
   * @return todo_tag
   */
  TodoTag selectTodoTagById(Long id);

  /**
   * 查询todo_tag列表
   *
   * @param todoTag todo_tag
   * @return todo_tag集合
   */
  List<TodoTag> selectTodoTagList(TodoTag todoTag);

  /**
   * 新增todo_tag
   *
   * @param todoTag todo_tag
   * @return 结果
   */
  int insertTodoTag(TodoTag todoTag);

  /**
   * 修改todo_tag
   *
   * @param todoTag todo_tag
   * @return 结果
   */
  int updateTodoTag(TodoTag todoTag);

  /**
   * 批量删除todo_tag
   *
   * @param ids 需要删除的todo_tag主键集合
   * @return 结果
   */
  int deleteTodoTagByIds(Long[] ids);

  /**
   * 删除todo_tag信息
   *
   * @param id todo_tag主键
   * @return 结果
   */
  int deleteTodoTagById(Long id);
}
