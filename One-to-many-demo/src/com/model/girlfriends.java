/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:26:39 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
@Table(name="GFF")
public class girlfriends {
	@Id @GeneratedValue
	private int phno;
	private String name;
	private int age;
	@ManyToMany
	private List<student> getboyfriendList=new ArrayList();
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "girlfriends [phno=" + phno + ", name=" + name + ", age=" + age + ", getboyfriendList="
				+ getboyfriendList + "]";
	}
	public List<student> getGetboyfriendList() {
		return getboyfriendList;
	}
	public void setGetboyfriendList(List<student> getboyfriendList) {
		this.getboyfriendList = getboyfriendList;
	}

}
