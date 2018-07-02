/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.Embeddable;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:15:30 am
 *DATE:01-Sep-2017
 *TAGS:
 */
@Embeddable
public class subject {
	private String computer;
	private String sciance;
	private String history;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "subject [computer=" + computer + ", sciance=" + sciance + ", history=" + history + "]";
	}
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public String getSciance() {
		return sciance;
	}
	public void setSciance(String sciance) {
		this.sciance = sciance;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}

}
