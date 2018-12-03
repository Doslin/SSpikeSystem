package com.doude.service;

import java.util.List;


import com.doude.enity.Msuser;
import com.doude.vo.msuser.MsuserVo;

public interface MsUserService {
	

	
	public void insertUser(Msuser msuser);
	
	public Msuser queryMsuserByid(int id);
	
	public void updateMsuser(Msuser msuser);
	public void deleteMsuserbyid(int id);
	public List<Msuser> queryMsuserbyvo(MsuserVo msuserVo);
	
	public Msuser queryMsuserByuseraccount(String useraccount);
	
}
