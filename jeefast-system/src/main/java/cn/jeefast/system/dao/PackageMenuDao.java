package cn.jeefast.system.dao;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import cn.jeefast.system.entity.PackageMenu;
import cn.jeefast.system.entity.SysRole;

/**
 * <p>
  * 套餐列表 Mapper 接口
 * </p>
 *
 * @author theodo
 * @since 2020-06-07
 */
public interface PackageMenuDao extends BaseMapper<PackageMenu> {

	
	
	List<PackageMenu> queryPackageMenuList(Page<PackageMenu> page, Map<String, Object> map);
	
	Integer deletePackageMenuById(PackageMenu packageMenu);
	
}