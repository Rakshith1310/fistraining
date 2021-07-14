package com.fis.spring.app.model;

import java.io.Serializable;

public class ElectronicDevices implements Serializable, Comparable<ElectronicDevices> {
	
	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevices(int power, int memory, boolean bluetooth, int ratings) {
		super();
		this.power = power;
		this.memory = memory;
		this.bluetooth = bluetooth;
		this.ratings = ratings;
	}
	int power;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	int memory;
	boolean bluetooth;
	int ratings;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bluetooth ? 1231 : 1237);
		result = prime * result + memory;
		result = prime * result + power;
		result = prime * result + ratings;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevices other = (ElectronicDevices) obj;
		if (bluetooth != other.bluetooth)
			return false;
		if (memory != other.memory)
			return false;
		if (power != other.power)
			return false;
		if (ratings != other.ratings)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ElectronicDevices [power=" + power + ", memory=" + memory + ", bluetooth=" + bluetooth + ", ratings="
				+ ratings + "]";
	}
	
	public int compareTo(ElectronicDevices o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}