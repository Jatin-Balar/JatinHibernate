package com.hibernate.JatinHibernate;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptop")
public class Lap {
	@Id
	private int lId;
	
	private String lName;
	
	@ManyToMany		 
	private List<Stu> student = new ArrayList<Stu>();

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	

	public List<Stu> getStudent() {
		return student;
	}

	public void setStudent(List<Stu> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}
	

}
