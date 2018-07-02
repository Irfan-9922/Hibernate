/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:11:51 am
 *DATE:01-Sep-2017
 *TAGS:
 */
@Entity
public class vichel {
	@Id @GeneratedValue
	private String vichelid;
	private String vichelname;
	
	@Override
	public String toString() {
		return "vichel [vichelid=" + vichelid + ", vichelname=" + vichelname + "]";
	}
	public String getVichelid() {
		return vichelid;
	}
	public void setVichelid(String vichelid) {
		this.vichelid = vichelid;
	}
	public String getVichelname() {
		return vichelname;
	}
	public void setVichelname(String vichelname) {
		this.vichelname = vichelname;
	}

}
