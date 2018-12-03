package com.doude.service;

import java.util.List;


import com.doude.enity.Msorder;



public interface MsoderService {
	

	
	public void insertMsOrder(Msorder msorder);

	
	public List<Msorder> queryorderbyuserid(int userid);
	
	public List<Msorder> queryorderbymerchantid(int merchantid);
	
	public void updateorderpaystatusbyid(int paystatus,int id,int paytype);
}
