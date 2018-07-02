/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:08:10 am
 *TIME:01-Sep-2017
 *TAGS:
 */
@Entity
public class student {
	@Id @GeneratedValue
	private int no;
	private String name;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column = @Column(name="Home_Steet_Adress")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="pin",column=@Column(name="Home_pinCode")),
	@AttributeOverride(name="phno",column=@Column(name="HOME_PHNO"))
	})
private	Adress Home_adress;
	private Adress Office_Adress;

	
	public Adress getHome_adress() {
		return Home_adress;
	}
	public void setHome_adress(Adress home_adress) {
		Home_adress = home_adress;
	}
	public Adress getOffice_Adress() {
		return Office_Adress;
	}
	public void setOffice_Adress(Adress office_Adress) {
		Office_Adress = office_Adress;
	}
	/**
 * @return the ad
 */

	
	public int getNo() {
		return no;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + ", Home_adress=" + Home_adress + ", Office_Adress="
				+ Office_Adress + "]";
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

}
