package OneToOne;
import OneToOne.UserDetail;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "orderu")
public class Orderrr {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String ordername;
	public Orderrr() {
		
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "uid")
	UserDetail user;
	public long getId() {
		return id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public void setUser(UserDetail userDetail) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
