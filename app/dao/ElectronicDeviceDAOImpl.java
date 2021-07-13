package com.fis.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectrnoicDevice;

public class ElectronicDeviceDAOImpl implements IElectronicDeviceDAO {
	
	Connection con = null;
	
	String addingDevice = "insert into fisapp.electronicdevice values (?,?,?,?,?,?,? )";
	String getAllDevices= "select * from fisapp.electronicdevice";
	String changeDevicePrice= "update table fisapp.electronicdevice set cost=? where deviceId=?";
	String changeDeviceRating= "update table fisapp.electronicdevice set rating=? where deviceId=?";
	String deleteDevice= "delete from fisapp.electronicdevice where deviceId=?";
	String geDevicesBasedOnBrandNameAndType = "select * from fisapp.electronicdevice where brandName=? and deviceType=?";
	String countDeviceType = "select * from fisapp.electronicdevice where brandName=?";
	String getSumofPriceBasedOnTyp = "";

	@Override
	public boolean addDevice(ElectrnoicDevice device) throws SQLException {
		con = DatabaseUtil.getConnection();
		boolean added = false;
		if (con!=null)
		{
			
			String deviceType = device.getDeviceType();
			 int deviceId = device.getDeviceId();
			 String brandName = device.getBrandName();
			 int cost = device.getCost();
			 int power = device.getPower();
			 int starRatings = device.getStarRatings();
			 String color = device.getColor();
			
			PreparedStatement ps = con.prepareStatement(addingDevice);
			ps.setString(1, deviceType);
			ps.setInt(2, deviceId);
			ps.setString(3, brandName);
			ps.setInt(4, cost);
			ps.setInt(5, power);
			ps.setInt(6, starRatings);
			ps.setString(7, color);
			
			
			int i = ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("Devie added successfully");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<ElectrnoicDevice> getAllDevices() throws SQLException {
		con = DatabaseUtil.getConnection();
		List<ElectrnoicDevice> devicelist = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(getAllDevices);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ElectrnoicDevice temp = new ElectrnoicDevice(); // default emp,

				temp.setDeviceId(rs.getInt(1));		//we can pass either colum no(starts wid1) or name of the column(in quotes)		
				temp.setDeviceType(rs.getString("deviceType"));
				temp.setBrandName(rs.getString("brandName"));
				temp.setCost(rs.getInt("cost"));
				temp.setPower(rs.getInt("power"));
				temp.setStarRatings(rs.getInt("starRating"));
				temp.setColor(rs.getString(7));
				
				devicelist.add(temp);
			}

		}
		return devicelist;
	}

	@Override
	public ElectrnoicDevice changeDevicePrice(int deviceId, int newPrice) throws NoDeviceFoundException, SQLException {
		con = DatabaseUtil.getConnection();
		ElectrnoicDevice device =null;
		if (con!=null)
		{
			PreparedStatement ps =con.prepareStatement(changeDevicePrice);
			ps.setInt(1, newPrice);
			ps.setInt(2, deviceId);
			
			boolean isFound = false;
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 isFound = true;
				 ElectrnoicDevice temp = new ElectrnoicDevice();
				 
				 temp.setDeviceId(rs.getInt(1));		//we can pass either colum no(starts wid1) or name of the column(in quotes)		
				 temp.setDeviceType(rs.getString("deviceType"));
				 temp.setBrandName(rs.getString("brandName"));
				 temp.setCost(rs.getInt("cost"));
				temp.setPower(rs.getInt("power"));
				temp.setStarRatings(rs.getInt("starRating"));
				temp.setColor(rs.getString(7));
				 
				device = temp;
			}
			if (isFound == false) throw new NoDeviceFoundException();
		}
			return device ;
			
	}

	@Override
	public ElectrnoicDevice changeDeviceRating(int deviceId, int newRating) throws SQLException, NoDeviceFoundException {
		con = DatabaseUtil.getConnection();
		ElectrnoicDevice device =null;
		if (con!=null)
		{
			PreparedStatement ps =con.prepareStatement(changeDeviceRating);
			ps.setInt(1, newRating);
			ps.setInt(2, deviceId);
			
			boolean isFound = false;
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 isFound = true;
				 ElectrnoicDevice temp = new ElectrnoicDevice();
				 
				 temp.setDeviceId(rs.getInt(1));		//we can pass either colum no(starts wid1) or name of the column(in quotes)		
				 temp.setDeviceType(rs.getString("deviceType"));
				 temp.setBrandName(rs.getString("brandName"));
				 temp.setCost(rs.getInt("cost"));
				temp.setPower(rs.getInt("power"));
				temp.setStarRatings(rs.getInt("starRating"));
				temp.setColor(rs.getString(7));
				 
				device = temp;
			}
			if (isFound == false) 
				{
				throw new NoDeviceFoundException();
				}
		}
			return device ;
			
	}

	@Override
	public boolean deleteDevice(int deviceId) throws NoDeviceFoundException, SQLException {
		con = DatabaseUtil.getConnection();
		//boolean isDeleted = false;
		if(con!=null)
		{
			PreparedStatement ps = con.prepareStatement(deleteDevice);
			ps.setInt(1, deviceId);
			
			int i = ps.executeUpdate();
			if (i!=0)
			{
				System.out.println("Deleted record succesfully");
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public List<ElectrnoicDevice> geDevicesBasedOnBrandNameAndType(String brandName, String type) throws SQLException, NoDeviceFoundException
	{
		List<ElectrnoicDevice> devicelist = new ArrayList<ElectrnoicDevice>();
		con = DatabaseUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(geDevicesBasedOnBrandNameAndType);
		ps.setString(1, brandName);
		ps.setString(2,  type);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			ElectrnoicDevice temp = new ElectrnoicDevice();
			
			temp.setDeviceId(rs.getInt(1));		//we can pass either colum no(starts wid1) or name of the column(in quotes)		
			temp.setDeviceType(rs.getString("deviceType"));
			temp.setBrandName(rs.getString("brandName"));
			temp.setCost(rs.getInt("cost"));
			temp.setPower(rs.getInt("power"));
			temp.setStarRatings(rs.getInt("starRating"));
			temp.setColor(rs.getString(7));

			devicelist.add(temp);
			
		}
		if(devicelist.size()==0) {
			return null;
		}
		return devicelist;
	}

	@Override
	public int countDeviceType(String type) throws SQLException, NoDeviceFoundException {
		List<ElectrnoicDevice> devicelist = new ArrayList<ElectrnoicDevice>();
		con = DatabaseUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(countDeviceType);
		ps.setString(1, type);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			ElectrnoicDevice temp = new ElectrnoicDevice();
			
			temp.setDeviceId(rs.getInt(1));		//we can pass either colum no(starts wid1) or name of the column(in quotes)		
			temp.setDeviceType(rs.getString("deviceType"));
			temp.setBrandName(rs.getString("brandName"));
			temp.setCost(rs.getInt("cost"));
			temp.setPower(rs.getInt("power"));
			temp.setStarRatings(rs.getInt("starRating"));
			temp.setColor(rs.getString(7));

			devicelist.add(temp);
			
		}
		if(devicelist.size()>00) {
			System.out.print("Devices of your type: ");
			return devicelist.size();
		}
		return 0;
	}
	
	
	
	/*
	 * @Override public List getSumofPriceBasedOnType(String type) throws
	 * SQLException, NoDeviceFoundException { // TODO Auto-generated method stub
	 * return null; }
	 */

}// class





