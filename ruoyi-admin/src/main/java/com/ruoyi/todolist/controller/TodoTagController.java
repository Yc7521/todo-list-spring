package com.ruoyi.todolist.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.todolist.domain.TodoTag;
import com.ruoyi.todolist.service.ITodoTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * todo_tagController
 *
 * @author yc7521
 * @date 2022-09-09
 */
@RestController
@RequestMapping("/todolist/todo_tag")
public class TodoTagController extends BaseController {
  @Autowired
  private ITodoTagService todoTagService;

  /**
   * 查询todo_tag列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:list')")
  @GetMapping("/list")
  public TableDataInfo list(TodoTag todoTag) {
    startPage();
    List<TodoTag> list = todoTagService.selectTodoTagList(todoTag);
    return getDataTable(list);
  }

  /**
   * 导出todo_tag列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:export')")
  @Log(title = "todo_tag", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, TodoTag todoTag) {
    List<TodoTag> list = todoTagService.selectTodoTagList(todoTag);
    ExcelUtil<TodoTag> util = new ExcelUtil<TodoTag>(TodoTag.class);
    util.exportExcel(response, list, "todo_tag数据");
  }

  /**
   * 获取todo_tag详细信息
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:query')")
  @GetMapping(value = "/{id}")
  public AjaxResult getInfo(
    @PathVariable("id") Long id) {
    return AjaxResult.success(todoTagService.selectTodoTagById(id));
  }

  /**
   * 新增todo_tag
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:add')")
  @Log(title = "todo_tag", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(
    @RequestBody TodoTag todoTag) {
    return toAjax(todoTagService.insertTodoTag(todoTag));
  }

  /**
   * 修改todo_tag
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:edit')")
  @Log(title = "todo_tag", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(
    @RequestBody TodoTag todoTag) {
    return toAjax(todoTagService.updateTodoTag(todoTag));
  }

  /**
   * 删除todo_tag
   */
  @PreAuthorize("@ss.hasPermi('todolist:todo_tag:remove')")
  @Log(title = "todo_tag", businessType = BusinessType.DELETE)
  @DeleteMapping("/{ids}")
  public AjaxResult remove(
    @PathVariable Long[] ids) {
    return toAjax(todoTagService.deleteTodoTagByIds(ids));
  }
}
