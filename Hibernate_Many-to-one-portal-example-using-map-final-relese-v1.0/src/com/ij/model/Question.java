/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.model;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:10:49 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
@Entity

public class Question {
	@Id @GeneratedValue
	private int Qid;
	private String question;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	private Map<String,String> answer;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", question=" + question + ", answer=" + answer + "]";
	}
	@ElementCollection
	public Map<String, String> getAnswer() {
		return answer;
	}
	
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	

}
