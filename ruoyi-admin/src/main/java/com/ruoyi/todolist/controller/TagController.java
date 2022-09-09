package com.ruoyi.todolist.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.todolist.domain.Tag;
import com.ruoyi.todolist.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 标签Controller
 *
 * @author yc7521
 * @date 2022-09-09
 */
@RestController
@RequestMapping("/todolist/tag")
public class TagController extends BaseController {
  @Autowired
  private ITagService tagService;

  /**
   * 查询标签列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:list')")
  @GetMapping("/list")
  public TableDataInfo list(Tag tag) {
    startPage();
    List<Tag> list = tagService.selectTagList(tag);
    return getDataTable(list);
  }

  /**
   * 导出标签列表
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:export')")
  @Log(title = "标签", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, Tag tag) {
    List<Tag> list = tagService.selectTagList(tag);
    ExcelUtil<Tag> util = new ExcelUtil<Tag>(Tag.class);
    util.exportExcel(response, list, "标签数据");
  }

  /**
   * 获取标签详细信息
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:query')")
  @GetMapping(value = "/{id}")
  public AjaxResult getInfo(
    @PathVariable("id") Long id) {
    return AjaxResult.success(tagService.selectTagById(id));
  }

  /**
   * 新增标签
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:add')")
  @Log(title = "标签", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(
    @RequestBody Tag tag) {
    return toAjax(tagService.insertTag(tag));
  }

  /**
   * 修改标签
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:edit')")
  @Log(title = "标签", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(
    @RequestBody Tag tag) {
    return toAjax(tagService.updateTag(tag));
  }

  /**
   * 删除标签
   */
  @PreAuthorize("@ss.hasPermi('todolist:tag:remove')")
  @Log(title = "标签", businessType = BusinessType.DELETE)
  @DeleteMapping("/{ids}")
  public AjaxResult remove(
    @PathVariable Long[] ids) {
    return toAjax(tagService.deleteTagByIds(ids));
  }
}
