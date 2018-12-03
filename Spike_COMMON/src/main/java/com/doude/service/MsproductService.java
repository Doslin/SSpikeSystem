package com.doude.service;


import java.util.List;

import com.doude.enity.Msproductinfo;

import com.doude.vo.msproductinfo.MsProductVo;

public interface MsproductService {
	


	public void applymsproduct(Msproductinfo msproductinfo);
	

	public List<Msproductinfo> listmsproduct(MsProductVo msProductVo);

	public Msproductinfo querymsproductByid(int id);
	
	public void deletemsproductByid(int id);
	
	public void updatemsproduct(Msproductinfo msproductinfo);
	

	public void updatemsproductstate(int id,int state);
	
	
	
}
