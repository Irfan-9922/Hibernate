/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.Date;

import javax.persistence.Column;
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
private	Adress ad;

	
	/**
 * @return the ad
 */
public Adress getAd() {
	return ad;
}
/**
 * @param ad the ad to set
 */
public void setAd(Adress ad) {
	this.ad = ad;
}
	
	/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "student [no=" + no + ", name=" + name + ", ad=" + ad + "]";
}
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

}
