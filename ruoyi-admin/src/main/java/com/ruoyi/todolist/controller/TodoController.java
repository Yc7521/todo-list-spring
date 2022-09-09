package com.ruoyi.todolist.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.todolist.domain.Todo;
import com.ruoyi.todolist.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 代办Controller
 *
 * @author yc7521
 * @date 2022-09-09
 */
@RestController
@RequestMapping("/todolist/todo")
public class TodoController extends BaseController {
  @Autowired
  private ITodoService todoService;

  /**
   * 查询代办列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:list')")
  @GetMapping("/list")
  public TableDataInfo list(Todo todo) {
    startPage();
    List<Todo> list = todoService.selectTodoList(todo);
    return getDataTable(list);
  }

  /**
   * 导出代办列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:export')")
  @Log(title = "代办", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, Todo todo) {
    List<Todo> list = todoService.selectTodoList(todo);
    ExcelUtil<Todo> util = new ExcelUtil<Todo>(Todo.class);
    util.exportExcel(response, list, "代办数据");
  }

  /**
   * 获取代办详细信息
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:query')")
  @GetMapping(value = "/{id}")
  public AjaxResult getInfo(
    @PathVariable("id") Long id) {
    return AjaxResult.success(todoService.selectTodoById(id));
  }

  /**
   * 新增代办
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:add')")
  @Log(title = "代办", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(
    @RequestBody Todo todo) {
    return toAjax(todoService.insertTodo(todo));
  }

  /**
   * 修改代办
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:edit')")
  @Log(title = "代办", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(
    @RequestBody Todo todo) {
    return toAjax(todoService.updateTodo(todo));
  }

  /**
   * 删除代办
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo:remove')")
  @Log(title = "代办", businessType = BusinessType.DELETE)
  @DeleteMapping("/{ids}")
  public AjaxResult remove(
    @PathVariable Long[] ids) {
    return toAjax(todoService.deleteTodoByIds(ids));
  }
}
