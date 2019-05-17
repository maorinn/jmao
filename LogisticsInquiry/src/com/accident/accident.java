package com.accident;

public class accident {
	//ÊÂ¹Ê¶ÔÏó
	private String Accident_ID;
	private String Driver_Name;
	private String Accident_PlaceTime;
	private String Accident_Time;
	private String Accident_PlaceAddress;
	private String Accident_Remark;
	public String getAccident_ID() {
		return Accident_ID;
	}
	public void setAccident_ID(String accident_ID) {
		Accident_ID = accident_ID;
	}
	public String getDriver_Name() {
		return Driver_Name;
	}
	public void setDriver_Name(String driver_Name) {
		Driver_Name = driver_Name;
	}
	public String getAccident_PlaceTime() {
		return Accident_PlaceTime;
	}
	public void setAccident_PlaceTime(String accident_PlaceTime) {
		Accident_PlaceTime = accident_PlaceTime;
	}
	public String getAccident_Time() {
		return Accident_Time;
	}
	public void setAccident_Time(String accident_Time) {
		Accident_Time = accident_Time;
	}
	public String getAccident_PlaceAddress() {
		return Accident_PlaceAddress;
	}
	public void setAccident_PlaceAddress(String accident_PlaceAddress) {
		Accident_PlaceAddress = accident_PlaceAddress;
	}
	public String getAccident_Remark() {
		return Accident_Remark;
	}
	public void setAccident_Remark(String accident_Remark) {
		Accident_Remark = accident_Remark;
	}
	public accident(String accident_ID, String driver_Name, String accident_PlaceTime, String accident_Time,
			String accident_PlaceAddress, String accident_Remark) {
		Accident_ID = accident_ID;
		Driver_Name = driver_Name;
		Accident_PlaceTime = accident_PlaceTime;
		Accident_Time = accident_Time;
		Accident_PlaceAddress = accident_PlaceAddress;
		Accident_Remark = accident_Remark;
	}
	
}
