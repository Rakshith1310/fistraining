package com.fis.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectrnoicDevice;

public interface IElectronicDeviceDAO {

	
	public boolean addDevice(ElectrnoicDevice device) throws Exception;
	public List<ElectrnoicDevice> getAllDevices() throws Exception;
	
	public ElectrnoicDevice changeDevicePrice(int deviceId,int newPrice)throws NoDeviceFoundException, SQLException;
	public ElectrnoicDevice changeDeviceRating(int deviceId,int newRating)throws NoDeviceFoundException, SQLException;
	
	public boolean deleteDevice(int deviceId)throws NoDeviceFoundException, SQLException;
	
	public List<ElectrnoicDevice> geDevicesBasedOnBrandNameAndType(String brandName,String type)throws NoDeviceFoundException, SQLException;
	public int countDeviceType(String type) throws NoDeviceFoundException, SQLException;
	//public List getSumofPriceBasedOnType(String type) throws NoDeviceFoundException, SQLException;
	
	
	
}
