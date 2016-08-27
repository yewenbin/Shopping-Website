package com.fangfang.shop.model;

public class Category {
	private int id;
	@ValidateForm(type=ValidateType.NotNull,errorMsg="类型名称不能为空")
	private String name;
	
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
}
