/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.domain;

/**
 * NAME:shaikh irfan
 *
 * DATE:5:50:08 pm
 *TIME:31-Aug-2017
 *TAGS:
 */
public class employee {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "employee [no=" + no + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	private int no;
	private String fname;
	private String lname;
	private String email;
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
