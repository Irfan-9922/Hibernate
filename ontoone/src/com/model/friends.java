/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import javax.persistence.Embeddable;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:39:10 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Embeddable
public class friends {
	private String name;
	private int phno;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "friends [name=" + name + ", phno=" + phno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}

}
