package cn.jeefast.system.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.jeefast.system.dao.PackageMenuDao;
import cn.jeefast.system.entity.PackageMenu;
import cn.jeefast.system.service.PackageMenuService;

/**
 * <p>
 * 套餐列表 服务实现类
 * </p>
 *
 * @author theodo
 * @since 2020-06-07
 */
@Service
public class PackageMenuServiceImpl extends ServiceImpl<PackageMenuDao, PackageMenu> implements PackageMenuService {

	@Autowired
	private PackageMenuDao packageMenuDao;

	@Override
	public Page<PackageMenu> queryPackageMenuList(Page<PackageMenu> page, Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		page.setRecords(packageMenuDao.queryPackageMenuList(page, map));
		return page;
	}

	@Override
	public Integer deletePackageMenuById(PackageMenu packageMenu) {
		// TODO Auto-generated method stub
		return packageMenuDao.deletePackageMenuById(packageMenu);
	}

	@Override
	public void save(PackageMenu packageMenu) {

		packageMenuDao.insert(packageMenu);

	}

	@Override
	public void update(PackageMenu packageMenu) {
		packageMenuDao.updateById(packageMenu);

		
	}

}
