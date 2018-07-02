/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:37:37 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
public class student {
	@Id @GeneratedValue
	private int no;
	@Embedded
	private friends frinds1;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [no=" + no +  "]";
	}
	
	public friends getFrinds1() {
		return frinds1;
	}
	public void setFrinds1(friends frinds1) {
		this.frinds1 = frinds1;
	}

}
