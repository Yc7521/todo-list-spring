package com.ruoyi.todolist.service.impl;

import com.ruoyi.todolist.domain.Todo;
import com.ruoyi.todolist.mapper.TodoMapper;
import com.ruoyi.todolist.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 代办Service业务层处理
 *
 * @author yc7521
 * @date 2022-09-09
 */
@Service
public class TodoServiceImpl implements ITodoService {
  @Autowired
  private TodoMapper todoMapper;

  /**
   * 查询代办
   *
   * @param id 代办主键
   * @return 代办
   */
  @Override
  public Todo selectTodoById(Long id) {
    return todoMapper.selectTodoById(id);
  }

  /**
   * 查询代办列表
   *
   * @param todo 代办
   * @return 代办
   */
  @Override
  public List<Todo> selectTodoList(Todo todo) {
    return todoMapper.selectTodoList(todo);
  }

  /**
   * 新增代办
   *
   * @param todo 代办
   * @return 结果
   */
  @Override
  public int insertTodo(Todo todo) {
    return todoMapper.insertTodo(todo);
  }

  /**
   * 修改代办
   *
   * @param todo 代办
   * @return 结果
   */
  @Override
  public int updateTodo(Todo todo) {
    return todoMapper.updateTodo(todo);
  }

  /**
   * 批量删除代办
   *
   * @param ids 需要删除的代办主键
   * @return 结果
   */
  @Override
  public int deleteTodoByIds(Long[] ids) {
    return todoMapper.deleteTodoByIds(ids);
  }

  /**
   * 删除代办信息
   *
   * @param id 代办主键
   * @return 结果
   */
  @Override
  public int deleteTodoById(Long id) {
    return todoMapper.deleteTodoById(id);
  }
}
