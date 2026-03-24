package OneToOne;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "useru")
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long uid;
	@Column(name = "Username", unique = true)
	String uname;
	int uage;
	
	@OneToMany(mappedBy = "user")
	private List<Orderrr> order=new ArrayList();

	
	public UserDetail() {
		
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public List<Orderrr> getOrder() {
		return order;
	}

	public void setOrder1(List<Orderrr> order) {
		this.order = order;
	}

	
	
	
	
	

}
