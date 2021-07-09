package day3sorted;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;
import java.util.Collection;

import inheritance.ElectronicDevices;
import inheritance.Computer;



public class ElectronicsSorted {

	public static void main(String[] args) {
		Set<ElectronicDevices> computers = new TreeSet<>();
		computers.add(new Computer(2000, 1024, false, 88));
		computers.add(new Computer(70500, 2100, false, 99));
		computers.add(new Computer(4000, 2100, false, 77));
		
		//** Default method
		//doPrint(computers);
		//System.out.println(computers);
		
		//method2 step1 **converting set to list
		List<ElectronicDevices> eleDevices = new ArrayList<>();
		eleDevices.addAll(computers);
		
		//method2 step2. call collection.sort(list);
		// Power based sorting
		Collections.sort(eleDevices, new PowerSort());
		//doPrint(eleDevices);
		
		//rating based sorting
		Collections.sort(eleDevices, new RatingSorted());
		doPrint(eleDevices);
	
	}

	public static void doPrint(Collection<ElectronicDevices> collections)
	{
		for(ElectronicDevices device: collections)
		{
			System.out.println(device);
		}

	}
	
}
