package boot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity(name="t_department")
public class Department implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String department_name;
	private String department_description;
	
	@ManyToOne//employe ile iliskilendirme
	private Employee employee;
	
	@OneToMany(mappedBy = "department") //meetings ile iliskilendirme
	private List<Meetings> meetings;
	
	public Department(){}
	

	public Department(int id, String department_name, String department_description, Employee employee) {
		super();
		this.id = id;
		this.department_name = department_name;
		this.department_description = department_description;
		this.employee = employee;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDepartment_name() {
		return department_name;
	}


	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}


	public String getDepartment_description() {
		return department_description;
	}


	public void setDepartment_description(String department_description) {
		this.department_description = department_description;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", department_name=" + department_name + ", department_description=" + department_description + ", employee=" + employee
				+  "]";
	}

	
}
