package com.ubereats.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.ubereats.entity.UberEats;

public class UberEatsDAO implements UberEatsDAOInterface
{

	public static UberEatsDAOInterface createDaoObject() 
	{
		return new UberEatsDAO();
	}

	@Override
	public int createProfileDAO(UberEats ue) 
	{
		int i =0;
		try 
		{
			Context initCtx = new InitialContext();
			DataSource ds= (DataSource)initCtx.lookup("java:/zensar");
		
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@TRNW57SLPC0172.ind.zensar.com:1521:orcl","system","Zensar123");
	PreparedStatement ps = con.prepareStatement("insert into UberEats values(?,?,?)");
	ps.setString(1,ue.getName());
	ps.setString(2, ue.getPassword());
	ps.setString(3,ue.getEmail());
	i=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	
}
