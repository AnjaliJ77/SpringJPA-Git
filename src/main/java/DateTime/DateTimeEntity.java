package DateTime;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DateTimeTable")
public class DateTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(unique = true)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate localdate;   //yyyy-MM-dd   we can change the format using @JSONFormat
	
	
	private LocalTime localtimeValue;    //hr-min-sec
	private LocalDateTime localdatetime;
	private Date date;
	private OffsetDateTime offsetdatetime;
	private ZonedDateTime zoneddatetime;
	public DateTimeEntity() {
		super();
	}
	public Long getId() {
		return id;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public LocalTime getLocaltimeValue() {
		return localtimeValue;
	}
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public Date getDate() {
		return date;
	}
	public OffsetDateTime getOffsetdatetime() {
		return offsetdatetime;
	}
	public ZonedDateTime getZoneddatetime() {
		return zoneddatetime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	public void setLocaltimeValue(LocalTime localtimeValue) {
		this.localtimeValue = localtimeValue;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setOffsetdatetime(OffsetDateTime offsetdatetime) {
		this.offsetdatetime = offsetdatetime;
	}
	public void setZoneddatetime(ZonedDateTime zoneddatetime) {
		this.zoneddatetime = zoneddatetime;
	}
	
	
	

}
