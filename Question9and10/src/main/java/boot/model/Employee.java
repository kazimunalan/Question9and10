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

@Entity(name="t_employee")
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String employee_name;
	private String employee_surname;
	private int employee_salary;
	
	@OneToMany(mappedBy = "employee")
	private List<Department> department;

	
	public Employee(){}
	




	public Employee(int id, String employee_name, String employee_surname, int employee_salary,
			List<Department> department) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_surname = employee_surname;
		this.employee_salary = employee_salary;
		this.department = department;
	}










	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public String getEmployee_surname() {
		return employee_surname;
	}



	public void setEmployee_surname(String employee_surname) {
		this.employee_surname = employee_surname;
	}



	public int getEmployee_salary() {
		return employee_salary;
	}



	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	


	public List<Department> getDepartment() {
		return department;
	}





	public void setDepartment(List<Department> department) {
		this.department = department;
	}





	@Override
	public String toString() {
		return "Task [id=" + id + ", employee_name=" + employee_name + ", employee_surname=" + employee_surname + ", employee_salary=" + employee_salary
				+  "]";
	}

	
}
