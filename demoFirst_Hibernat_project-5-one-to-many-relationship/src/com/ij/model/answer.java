/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:12:39 am
 *DATE:01-Sep-2017
 *TAGS:
 */
@Entity
public class answer {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "answer [ans=" + ans + "]";
	}	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	private String ans;
}