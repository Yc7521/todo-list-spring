package com.ruoyi.todolist.service.impl;

import com.ruoyi.todolist.domain.TodoTag;
import com.ruoyi.todolist.mapper.TodoTagMapper;
import com.ruoyi.todolist.service.ITodoTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * todo_tagService业务层处理
 *
 * @author yc7521
 * @date 2022-09-09
 */
@Service
public class TodoTagServiceImpl implements ITodoTagService {
  @Autowired
  private TodoTagMapper todoTagMapper;

  /**
   * 查询todo_tag
   *
   * @param id todo_tag主键
   * @return todo_tag
   */
  @Override
  public TodoTag selectTodoTagById(Long id) {
    return todoTagMapper.selectTodoTagById(id);
  }

  /**
   * 查询todo_tag列表
   *
   * @param todoTag todo_tag
   * @return todo_tag
   */
  @Override
  public List<TodoTag> selectTodoTagList(TodoTag todoTag) {
    return todoTagMapper.selectTodoTagList(todoTag);
  }

  /**
   * 新增todo_tag
   *
   * @param todoTag todo_tag
   * @return 结果
   */
  @Override
  public int insertTodoTag(TodoTag todoTag) {
    return todoTagMapper.insertTodoTag(todoTag);
  }

  /**
   * 修改todo_tag
   *
   * @param todoTag todo_tag
   * @return 结果
   */
  @Override
  public int updateTodoTag(TodoTag todoTag) {
    return todoTagMapper.updateTodoTag(todoTag);
  }

  /**
   * 批量删除todo_tag
   *
   * @param ids 需要删除的todo_tag主键
   * @return 结果
   */
  @Override
  public int deleteTodoTagByIds(Long[] ids) {
    return todoTagMapper.deleteTodoTagByIds(ids);
  }

  /**
   * 删除todo_tag信息
   *
   * @param id todo_tag主键
   * @return 结果
   */
  @Override
  public int deleteTodoTagById(Long id) {
    return todoTagMapper.deleteTodoTagById(id);
  }
}
