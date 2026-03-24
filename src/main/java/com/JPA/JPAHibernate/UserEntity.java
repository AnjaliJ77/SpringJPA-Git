package com.JPA.JPAHibernate;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "UserEntityCache")
@Table(name = "userentity",uniqueConstraints = {
				@UniqueConstraint(columnNames="uname")})



public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	//@Column(name = "uname", nullable = false, unique = true, length = 50)
	private String uname;
	private int uage;
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
	 
	
	
	public UserEntity() {
		super();
	}
	

	public UserEntity(long uid, String uname, int uage) {
		//super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
	}
	

}
