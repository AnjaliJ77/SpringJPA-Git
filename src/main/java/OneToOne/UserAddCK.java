package OneToOne;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserAddCK implements Serializable {
	
	@Column(name = "pincode")
	long pincode;
	
	@Column(name = "dist")
	String dist;
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof UserAddCK)) return false;
	        UserAddCK that = (UserAddCK) o;
	        return pincode == that.pincode &&
	                Objects.equals(dist, that.dist);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(pincode, dist);
	    }
	
	

}
