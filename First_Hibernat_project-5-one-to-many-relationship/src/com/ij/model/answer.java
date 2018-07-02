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
	
	private String listOfAnswer;
	@Id @GeneratedValue
	private int answerid;
	
	@Override
	public String toString() {
		return "answer [listOfAnswer=" + listOfAnswer + ", answerid=" + answerid + "]";
	}
	
	public String getListOfAnswer() {
		return listOfAnswer;
	}

	public void setListOfAnswer(String string) {
		this.listOfAnswer = string;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

}
