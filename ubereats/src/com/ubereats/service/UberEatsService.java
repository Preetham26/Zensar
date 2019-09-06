package com.ubereats.service;

import com.ubereats.dao.UberEatsDAO;
import com.ubereats.dao.UberEatsDAOInterface;
import com.ubereats.entity.UberEats;

public class UberEatsService implements UberEatsServiceInterface
{

	public static UberEatsServiceInterface createServiceObject() 
	{
		// TODO Auto-generated method stub
		return new UberEatsService();
	}

	@Override
	public int createProfile(UberEats ue) 
	{
		UberEatsDAOInterface ud = UberEatsDAO.createDaoObject();
		return ud.createProfileDAO(ue);
	}

}
