package cn.jeefast.system.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 套餐列表
 * </p>
 *
 * @author theodo
 * @since 2020-06-07
 */
@TableName("package_menu")
public class PackageMenu extends Model<PackageMenu> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 套餐名称
     */
	private String name;
    /**
     * 套餐价格
     */
	@TableField("menu_price")
	private String menuPrice;
    /**
     * 使用餐别：0:早餐；1午餐；2：晚餐；3：宵夜
     */
	private String type;
	
	private String[] typearr;
    public String[] getTypearr() {
		return typearr;
	}

	public void setTypearr(String[] typearr) {
		this.typearr = typearr;
	}

	/**
     * 餐品
     */
	@TableField("menu_food")
	private String menuFood;
    /**
     * 小食
     */
	@TableField("menu_snack")
	private String menuSnack;
    /**
     * 饮品
     */
	@TableField("menu_drink")
	private String menuDrink;
    /**
     * 创建人姓名
     */
	@TableField("creat_name")
	private String creatName;
    /**
     * 创建人id
     */
	@TableField("create_id")
	private String createId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(String menuPrice) {
		this.menuPrice = menuPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMenuFood() {
		return menuFood;
	}

	public void setMenuFood(String menuFood) {
		this.menuFood = menuFood;
	}

	public String getMenuSnack() {
		return menuSnack;
	}

	public void setMenuSnack(String menuSnack) {
		this.menuSnack = menuSnack;
	}

	public String getMenuDrink() {
		return menuDrink;
	}

	public void setMenuDrink(String menuDrink) {
		this.menuDrink = menuDrink;
	}

	public String getCreatName() {
		return creatName;
	}

	public void setCreatName(String creatName) {
		this.creatName = creatName;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "PackageMenu{" +
			", id=" + id +
			", name=" + name +
			", menuPrice=" + menuPrice +
			", type=" + type +
			", menuFood=" + menuFood +
			", menuSnack=" + menuSnack +
			", menuDrink=" + menuDrink +
			", creatName=" + creatName +
			", createId=" + createId +
			"}";
	}
}
