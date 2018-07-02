/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
	@ElementCollection
	private List<subject> listofsubject=new ArrayList();


	
	
	public List<subject> getListofsubject() {
		return listofsubject;
	}
	public void setListofsubject(List<subject> listofsubject) {
		this.listofsubject = listofsubject;
	}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "student [no=" + no + ", name=" + name + ", listofsubject=" + listofsubject + "]";
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
