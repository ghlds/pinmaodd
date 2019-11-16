package com.softtron.pinmaodd.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtron.pinmaodd.daos.TProductDao;
import com.softtron.pinmaodd.demos.TProduct;

@RestController
public class RouterController {

	@Autowired
	TProductDao tproductdao;
	@RequestMapping("/findall.do")
	public Set findall(){
		return tproductdao.findallProduct();
	}
	@RequestMapping("/delete.do")
	public void delete(@RequestBody Object productId){
		tproductdao.deleteProduct(productId);
	}
	@RequestMapping("/update.do")
	public void update(@RequestBody TProduct tproduct){
		tproductdao.updateProduct(tproduct);
	}
	@RequestMapping("/insert.do")
	public int insert(@RequestBody TProduct tproduct){
		return tproductdao.insertProduct(tproduct);
	}
	
	
	
}
