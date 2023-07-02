package com.RespApi.PawanRest.Customer;

public class CustDetails {
	
	
	private int  Id;
	private String Name;
	private String address;
	private String phonenumber;
	
	
	

	public CustDetails(int id, String name, String address, String phonenumber) {
		super();
		this.Id = id;
		this.Name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}




	public int getId() {
		return Id;
	}




	public void setId(int id) {
		this.Id = id;
	}




	public String getName() {
		return Name;
	}




	public void setName(String name) {
		this.Name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPhonenumber() {
		return phonenumber;
	}




	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}




	

	
}
