package cn.jeefast.system.controller;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.jeefast.common.annotation.Log;
import cn.jeefast.common.base.BaseController;
import cn.jeefast.common.utils.Query;
import cn.jeefast.common.utils.R;
import cn.jeefast.common.validator.ValidatorUtils;
import cn.jeefast.system.entity.PackageMenu;
import cn.jeefast.system.entity.SysRole;
import cn.jeefast.system.service.PackageMenuService;

/**
 * <p>
 * 套餐列表 前端控制器
 * </p>
 * 
 * @since 2020-06-07
 */
@RestController
@RequestMapping("sys/packageMenu")
public class PackageMenuController extends BaseController {

	@Autowired
	private PackageMenuService packageMenuService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:packageMenu:list")
	public R list(@RequestParam Map<String, Object> params) {
		Query query = new Query(params);
		Page<PackageMenu> pageUtil = new Page<PackageMenu>(query.getPage(), query.getLimit());

		Page<PackageMenu> page = packageMenuService.queryPackageMenuList(pageUtil, query);

		return R.ok().put("page", page);

	}

	/**
	 * 保存套餐
	 */
	@Log("保存套餐")
	@RequestMapping("/save")
	@RequiresPermissions("sys:packageMenu:save")
	public R save( PackageMenu packageMenu) {
		

		packageMenuService.save(packageMenu);

		return R.ok();
	}

	/**
	 * 修改角色
	 */
	@Log("修改套餐")
	@RequestMapping("/update")
	@RequiresPermissions("sys:packageMenu:update")
	public R update(PackageMenu packageMenu) {

		packageMenuService.update(packageMenu);

		return R.ok();
	}

	/**
	 * 删除套餐
	 */
	@Log("删除套餐")
	@RequestMapping("/delete")
	@RequiresPermissions("sys:packageMenu:delete")
	public R delete(PackageMenu packageMenu) {
		packageMenuService.deletePackageMenuById(packageMenu);

		return R.ok();
	}
}
