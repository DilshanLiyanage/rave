package com.ncell.rave.models;

import java.util.ArrayList;
import java.util.List;

public class RaveSender {
	private Integer id;
	private List<Integer> coEmployees = new ArrayList<>();
	private int category;
	private List<Integer> witness = new ArrayList<>();
	private String comment;
	public RaveSender() {
		super();
	}
	public RaveSender(Integer id, List<Integer> coEmployees, int category, List<Integer> witness, String comment) {
		super();
		this.id = id;
		this.coEmployees = coEmployees;
		this.category = category;
		this.witness = witness;
		this.comment = comment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getCoEmployees() {
		return coEmployees;
	}
	public void setCoEmployees(List<Integer> coEmployees) {
		this.coEmployees = coEmployees;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public List<Integer> getWitness() {
		return witness;
	}
	public void setWitness(List<Integer> witness) {
		this.witness = witness;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
