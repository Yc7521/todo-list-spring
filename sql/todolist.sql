-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办', '2000', '1', 'todo', 'todolist/todo/index', 1, 0, 'C', '0', '0', 'todolist:todo:list', '#', 'admin', sysdate(), '', null, '代办菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('代办导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签', '2000', '1', 'tag', 'todolist/tag/index', 1, 0, 'C', '0', '0', 'todolist:tag:list', '#', 'admin', sysdate(), '', null, '标签菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'todolist:tag:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'todolist:tag:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'todolist:tag:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'todolist:tag:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('标签导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'todolist:tag:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag', '2000', '1', 'todo_tag', 'todolist/todo_tag/index', 1, 0, 'C', '0', '0', 'todolist:todo_tag:list', '#', 'admin', sysdate(), '', null, 'todo_tag菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo_tag:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo_tag:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo_tag:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo_tag:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('todo_tag导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'todolist:todo_tag:export',       '#', 'admin', sysdate(), '', null, '');