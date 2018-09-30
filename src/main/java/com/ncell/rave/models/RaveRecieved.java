package com.ncell.rave.models;

public class RaveRecieved {
	
	private Integer resId;
	private String resName;
	private String resDesignation;
	private String resDepartment;
	private String resProfileImage;
	
	public RaveRecieved() {
		super();
	}

	public RaveRecieved(Integer resId, String resName, String resDesignation, String resDepartment,
			String resProfileImage) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.resDesignation = resDesignation;
		this.resDepartment = resDepartment;
		this.resProfileImage = resProfileImage;
	}

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResDesignation() {
		return resDesignation;
	}

	public void setResDesignation(String resDesignation) {
		this.resDesignation = resDesignation;
	}

	public String getResDepartment() {
		return resDepartment;
	}

	public void setResDepartment(String resDepartment) {
		this.resDepartment = resDepartment;
	}

	public String getResProfileImage() {
		return resProfileImage;
	}

	public void setResProfileImage(String resProfileImage) {
		this.resProfileImage = resProfileImage;
	}
	
	
	
	



}
