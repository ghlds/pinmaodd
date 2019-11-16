package com.softtron.pinmaodd.daos;

import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

import com.softtron.pinmaodd.demos.TProduct;
@Mapper
public interface TProductDao {

	public Set<Object> findallProduct(); 
	public void deleteProduct(Object productId);
	public void updateProduct(TProduct tproduct);
	public int insertProduct(TProduct tproduct);
}
