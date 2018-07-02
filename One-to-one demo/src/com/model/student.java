/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:07:41 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
public class student {
	
	private String name;
	@Id @GeneratedValue
	private int no;
	@OneToOne
	private adress adress1;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [name=" + name + ", no=" + no + ", adress1=" + adress1 + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public adress getAdress1() {
		return adress1;
	}
	public void setAdress1(adress adress1) {
		this.adress1 = adress1;
	}
	
	
}
