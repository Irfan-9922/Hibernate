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
private int qid;
private String quest;
@ElementCollection
@OneToMany
private List<answer> listofans=new ArrayList();
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuest() {
	return quest;
}
public void setQuest(String quest) {
	this.quest = quest;
}
public List<answer> getListofans() {
	return listofans;
}
public void setListofans(List<answer> listofans) {
	this.listofans = listofans;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "question [qid=" + qid + ", quest=" + quest + ", listofans=" + listofans + "]";
}

}
