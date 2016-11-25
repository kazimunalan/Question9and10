package boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="t_meetings")
public class Meetings implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String meetings_name;
	private String meetings_description;
	

	
	public Meetings(){}
	

	public Meetings(int id, String meetings_name, String meetings_description) {
		super();
		this.id = id;
		this.meetings_name = meetings_name;
		this.meetings_description = meetings_description;
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


	@Override
	public String toString() {
		return "Task [id=" + id + ", meetings_name=" + meetings_name + ", meetings_description=" + meetings_description
				+  "]";
	}

	
}
