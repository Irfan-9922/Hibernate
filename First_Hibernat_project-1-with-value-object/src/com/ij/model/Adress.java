/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

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
	@Embedded
	private city1 ci;
	/**
	 * @return the ci
	 */
	public city1 getCi() {
		return ci;
	}
	/**
	 * @param ci the ci to set
	 */
	public void setCi(city1 ci) {
		this.ci = ci;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", pin=" + pin + ", phno=" + phno + ", ci=" + ci + "]";
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the phno
	 */
	public String getPhno() {
		return phno;
	}
	/**
	 * @param phno the phno to set
	 */
	public void setPhno(String phno) {
		this.phno = phno;
	}

}
