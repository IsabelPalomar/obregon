package com.isabelpalomar.obregon.models;

public class Store {
	
	 private int    id;
	 private String name;
	 private String address;
	 private int    phone;
	 private String url;
	 private String email;
	 private String schedule;
	 private Integer image;

	 
	//Store constructor
	public Store(int id, String name, String address, int phone, String url,
			String email, String schedule, int image) {
		
		 this.id       =  id;
		 this.name     =  name;
		 this.address  =  address;
		 this.phone    =  phone;
		 this.url      =  url;
		 this.email    =  email;
		 this.schedule =  schedule;
		 this.image    =  image;

	
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public Integer getImage() {
		return image;
	}
	public void setImage(Integer image) {
		this.image = image;
	}
	
}
