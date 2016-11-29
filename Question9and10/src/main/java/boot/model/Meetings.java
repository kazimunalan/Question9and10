package boot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="t_meetings")
public class Meetings implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String meetings_name;
	private String meetings_description;
	
	@ManyToOne//department ile iliskilendirme
	private Department department;
	
	public Meetings(){}
	

	


	public Meetings(int id, String meetings_name, String meetings_description, Department department) {
		super();
		this.id = id;
		this.meetings_name = meetings_name;
		this.meetings_description = meetings_description;
		this.department = department;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getMeetings_name() {
		return meetings_name;
	}





	public void setMeetings_name(String meetings_name) {
		this.meetings_name = meetings_name;
	}





	public String getMeetings_description() {
		return meetings_description;
	}





	public void setMeetings_description(String meetings_description) {
		this.meetings_description = meetings_description;
	}





	public Department getDepartment() {
		return department;
	}





	public void setDepartment(Department department) {
		this.department = department;
	}





	@Override
	public String toString() {
		return "Task [id=" + id + ", meetings_name=" + meetings_name + ", meetings_description=" + meetings_description + "department=" + department
				+  "]";
	}

	
}
