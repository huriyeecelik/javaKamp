package dayFourHomework3.entities;

import dayFourHomework3.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private int discount;

	public Campaign() {
	}

	public Campaign(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
