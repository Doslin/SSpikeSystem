package com.doude.service;


import com.doude.enity.Msproductdetail;


public interface MsproductDetailService {
	

	
	public void insertMsproductdetail(Msproductdetail msproductdetail);
	public Msproductdetail queryMsproductdetailByid(int productid);
	public void updateMsproductdetail(Msproductdetail msproductdetail);

	
}
