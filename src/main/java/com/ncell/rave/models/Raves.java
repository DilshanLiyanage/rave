package com.ncell.rave.models;

import java.util.ArrayList;
import java.util.List;

public class Raves {
	private Integer id;
	private List<RaveRecieved> coEmployees = new ArrayList<>();
	private String categoryName;
	private String comment;
	private Boolean sent; 
	private List<RaveRecieved> acknowledgedBy = new ArrayList<>();
	private String timestamp;
	public Raves() {
		super();
	}
	public Raves(Integer id, List<RaveRecieved> coEmployees, String categoryName, String comment, Boolean sent,
			List<RaveRecieved> acknowledgedBy, String timestamp) {
		super();
		this.id = id;
		this.coEmployees = coEmployees;
		this.categoryName = categoryName;
		this.comment = comment;
		this.sent = sent;
		this.acknowledgedBy = acknowledgedBy;
		this.timestamp = timestamp;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<RaveRecieved> getCoEmployees() {
		return coEmployees;
	}
	public void setCoEmployees(List<RaveRecieved> coEmployees) {
		this.coEmployees = coEmployees;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Boolean getSent() {
		return sent;
	}
	public void setSent(Boolean sent) {
		this.sent = sent;
	}
	public List<RaveRecieved> getAcknowledgedBy() {
		return acknowledgedBy;
	}
	public void setAcknowledgedBy(List<RaveRecieved> acknowledgedBy) {
		this.acknowledgedBy = acknowledgedBy;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	
	
}
