/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.domain;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * NAME:shaikh irfan
 *
 * TIME:2:25:47 am
 *DATE:09-Sep-2017
 *TAGS:
 */
@Entity
@Table(name="Map")
public class question {
	@Id 
	private int no;
	/**
	 * @param no
	 * @param name
	 * @param que
	 * @param answer
	 */
	public question(int no, String name, String que, Map<String, String> answer) {
		super();
		this.no = no;
		this.name = name;
		this.que = que;
		this.answer = answer;
	}
	private String name;
	private String que;
	@ElementCollection
	
	
	private Map<String,String> answer;
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
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "question [no=" + no + ", name=" + name + ", que=" + que + ", answer=" + answer + "]";
	}

}
