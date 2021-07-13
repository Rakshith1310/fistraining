package com.fis.app.test2;

import java.util.List;

import com.fis.app.dao.DatabaseUtil;
import com.fis.app.dao.ElectronicDeviceDAOImpl;
import com.fis.app.dao.IElectronicDeviceDAO;
import com.fis.app.model.ElectrnoicDevice;

public class TestRunnerClass2 {

	public static void main(String[] args) {
		
		try {
			
			// Animal a = new Dog();
			IElectronicDeviceDAO dao = new ElectronicDeviceDAOImpl();
			
			
			ElectrnoicDevice d1 = new ElectrnoicDevice("laptop",101, "dell",1000, 1001, 5, "black"); 
			/*
			 * ElectrnoicDevice d2 = new ElectrnoicDevice("mobile",103, "oneplus",2000,
			 * 2001, 4, "black"); ElectrnoicDevice d3 = new
			 * ElectrnoicDevice("mobile",102,"oneplus",2500, 2501, 5, "black");
			 */
				
			  boolean a = dao.addDevice(d1); 
			  System.out.println(a);
			 
			 
			 
			
			
			//Retrieving all devices
			/*
			 * List<ElectrnoicDevice> list = dao.getAllDevices();
			 * list.stream().forEach((device)->System.out.println(device));
			 */
			
			
			//Deleting device based on device.
			
			/* boolean isDeleted = dao.deleteDevice(101); System.out.println(isDeleted); 
			System.out.println(isDeleted);*/
			 
			//Changing price of a device.
			//ElectrnoicDevice priceChangedDevice= dao.changeDevicePrice(101, 3400);  
			  
			//changeDeviceRating
			/* ElectrnoicDevice ratingChangedDevice= dao.changeDevicePrice(101, 99); */  
			
			//geDevicesBasedOnBrandNameAndType
			/*List<ElectrnoicDevice> nameTypeBasedDevices = dao.geDevicesBasedOnBrandNameAndType("oneplus", "mobile");*/
			
			//countDeviceType
			/* dao.countDeviceType("laptop"); */

			  
			
			 
			
		} catch (Exception e) {
			System.out.println(" Problem "+e);
		}
	}
}
