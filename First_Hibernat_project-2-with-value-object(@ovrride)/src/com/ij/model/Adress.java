/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:27:42 am
 *TIME:01-Sep-2017
 *TAGS:
 */
@Embeddable
public class Adress {
	
	private String street;
	private String	city;
	private String pin;
	private String phno;
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", pin=" + pin + ", phno=" + phno + "]";
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public void setPhno(String phno) {
		this.phno = phno;
	}

}
