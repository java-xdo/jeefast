package cn.jeefast.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import cn.jeefast.system.entity.SysUser;

/**
 * <p>
  * 系统用户 Mapper 接口
 * </p>
 *
 * @author theodo
 * @since 2017-10-28
 */
public interface SysUserDao extends BaseMapper<SysUser> {
	
	List<SysUser> queryPageList(Page<SysUser> page, Map<String, Object> map);

	List<SysUser> queryList(Map<String, Object> map);
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUser queryByUserName(@Param("username")String username,@Param("deptId")String deptId);
	
	int deleteBatch(Object[] id);	
	
}