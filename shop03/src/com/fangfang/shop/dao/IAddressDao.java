package com.fangfang.shop.dao;

import java.util.List;

import com.fangfang.shop.model.Address;

public interface IAddressDao {
	public void add(Address address,int userId);
	public void delete(int id);
	public void update(Address address);
	public Address load(int id);
	public List<Address> list(int userId);
}
