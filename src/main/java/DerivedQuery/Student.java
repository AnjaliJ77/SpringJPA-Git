package DerivedQuery;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long sid;
	String name;
	String sname;
	public Student() {
		
	}
	public long getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public String getSname() {
		return sname;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

}
