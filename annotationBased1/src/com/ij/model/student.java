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
@Transient
	private Date date;
	
		/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + ", date=" + date + "]";
	}
		/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
		
	/**
	 * @return the id
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param id the id to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
