package com.cg.tutor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="rate_tbl")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="rateId")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	@Column
	private int rateId; //variable
	
	@Column
	private int rate;
	
	@Column
	private String comment;
	
	@ManyToOne
	@JoinColumn(name="parenId")
	private Parent parent;

	//getter-setter
	public int getRateId() {
		return rateId;
	}

	public void setRateId(int rateId) {
		this.rateId = rateId;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}
