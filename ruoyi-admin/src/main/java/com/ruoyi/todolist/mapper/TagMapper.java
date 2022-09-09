package com.ruoyi.todolist.mapper;

import com.ruoyi.todolist.domain.Tag;

import java.util.List;

/**
 * 标签Mapper接口
 *
 * @author yc7521
 * @date 2022-09-09
 */
public interface TagMapper {
  /**
   * 查询标签
   *
   * @param id 标签主键
   * @return 标签
   */
  Tag selectTagById(Long id);

  /**
   * 查询标签列表
   *
   * @param tag 标签
   * @return 标签集合
   */
  List<Tag> selectTagList(Tag tag);

  /**
   * 新增标签
   *
   * @param tag 标签
   * @return 结果
   */
  int insertTag(Tag tag);

  /**
   * 修改标签
   *
   * @param tag 标签
   * @return 结果
   */
  int updateTag(Tag tag);

  /**
   * 删除标签
   *
   * @param id 标签主键
   * @return 结果
   */
  int deleteTagById(Long id);

  /**
   * 批量删除标签
   *
   * @param ids 需要删除的数据主键集合
   * @return 结果
   */
  int deleteTagByIds(Long[] ids);
}
