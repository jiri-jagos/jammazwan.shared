package jammazwan.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryCategoryJpa {
	private static final long serialVersionUID = 41463787969243L;
	@Id
	private int num;
	private String category;
	private String name;

	public CountryCategoryJpa() {
		super();
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getTableName() {
//		String tableName = Utils.getMethodNameLikeFromDelimited(name, ' ');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '-');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, ',');
//		tableName = Utils.getMethodNameLikeFromDelimited(tableName, '/');
//		tableName = Utils.lowFirst(category) + tableName;
//		System.out.println(tableName);
//		return tableName;
//	}

}
