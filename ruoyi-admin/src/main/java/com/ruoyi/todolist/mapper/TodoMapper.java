package com.ruoyi.todolist.mapper;

import com.ruoyi.todolist.domain.Todo;

import java.util.List;

/**
 * 代办Mapper接口
 *
 * @author yc7521
 * @date 2022-09-09
 */
public interface TodoMapper {
  /**
   * 查询代办
   *
   * @param id 代办主键
   * @return 代办
   */
  Todo selectTodoById(Long id);

  /**
   * 查询代办列表
   *
   * @param todo 代办
   * @return 代办集合
   */
  List<Todo> selectTodoList(Todo todo);

  /**
   * 新增代办
   *
   * @param todo 代办
   * @return 结果
   */
  int insertTodo(Todo todo);

  /**
   * 修改代办
   *
   * @param todo 代办
   * @return 结果
   */
  int updateTodo(Todo todo);

  /**
   * 删除代办
   *
   * @param id 代办主键
   * @return 结果
   */
  int deleteTodoById(Long id);

  /**
   * 批量删除代办
   *
   * @param ids 需要删除的数据主键集合
   * @return 结果
   */
  int deleteTodoByIds(Long[] ids);
}
