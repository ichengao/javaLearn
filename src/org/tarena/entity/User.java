package org.tarena.entity;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String phone;
	private String pwd;
	private String name;

	public User() {
	}
	public User(int id,String name,String pwd,String phone){
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.pwd=pwd;
	}
	public User(String name,String pwd,String phone){
		super();
		this.name=name;
		this.phone=phone;
		this.pwd=pwd;
	}
	
	public int getId(){
		return this.id;
	}
	public String getPwd(){
		return this.pwd;
	}
	public String getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(this == null){
			return false;
		}
		if(obj instanceof User){
			User o=(User) obj;
			return this.id==o.id;
		}
		
		return true;
	}
	
	@Override
	public String toString(){
		return id+","+"name"+","+pwd+","+phone;
	}
}
