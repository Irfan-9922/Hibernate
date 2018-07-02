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
import javax.persistence.OneToMany;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:10:34 am
 *DATE:01-Sep-2017
 *TAGS:
 */
@Entity
public class question {
	@Id @GeneratedValue
	private int id;
	private String question;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	@ElementCollection
	@OneToMany
    private List<answer> answer=new ArrayList();
	public List<answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<answer> answer) {
		this.answer = answer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
