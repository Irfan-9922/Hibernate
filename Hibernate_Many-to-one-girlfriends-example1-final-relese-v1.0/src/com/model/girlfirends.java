/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:50:08 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity
public class girlfirends {
	@Id @GeneratedValue
	private int phno;
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	private String gname;
	private String age;
	private String otherBoyFriends;
	private String isbeautifull;
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOtherBoyFriends() {
		return otherBoyFriends;
	}
	public void setOtherBoyFriends(String otherBoyFriends) {
		this.otherBoyFriends = otherBoyFriends;
	}
	public String getIsbeautifull() {
		return isbeautifull;
	}
	public void setIsbeautifull(String isbeautifull) {
		this.isbeautifull = isbeautifull;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "girlfirends [gname=" + gname + ", age=" + age + ", otherBoyFriends=" + otherBoyFriends
				+ ", isbeautifull=" + isbeautifull + "]";
	}
	
	

}
