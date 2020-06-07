package cn.jeefast.system.service;

import cn.jeefast.system.entity.PackageMenu;
import cn.jeefast.system.entity.SysRole;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 套餐列表 服务类
 * </p>
 *
 * @author theodo
 * @since 2020-06-07
 */
public interface PackageMenuService extends IService<PackageMenu> {
	Page<PackageMenu> queryPackageMenuList(Page<PackageMenu> pageUtil, Map<String, Object> map);

	Integer deletePackageMenuById(PackageMenu packageMenu);
	
	
	
	void save(PackageMenu packageMenu);
	void update(PackageMenu packageMenu);
}
