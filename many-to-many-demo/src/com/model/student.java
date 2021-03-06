/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:26:16 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
public class student {
	@Id @GeneratedValue
	private int no;
	private String name;
	@OneToMany
	@ElementCollection
	private List<girlfriends> listofgrilfrends=new ArrayList<>();
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<girlfriends> getListofgrilfrends() {
		return listofgrilfrends;
	}
	public void setListofgrilfrends(List<girlfriends> listofgrilfrends) {
		this.listofgrilfrends = listofgrilfrends;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + ", listofgrilfrends=" + listofgrilfrends + "]";
	}
	

}
