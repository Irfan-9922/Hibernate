/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:10:03 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
public class adress {
	@Id @GeneratedValue
	private int zipcode;
	private String city;
	private String countery;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "adress [zipcode=" + zipcode + ", city=" + city + ", countery=" + countery + "]";
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountery() {
		return countery;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}

}
