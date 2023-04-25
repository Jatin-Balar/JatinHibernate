package com.hibernate.JatinHibernate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Stu {

	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "student",fetch = FetchType.EAGER)
	private List<Lap> l = new ArrayList<Lap>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Lap> getL() {
		return l;
	}
	public void setL(List<Lap> l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	

}
