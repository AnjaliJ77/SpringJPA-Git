package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class SampleDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println("Datetime "+ datetime);
		LocalDate localdate= LocalDate.now();
		System.out.println("localdateNow "+localdate);
		LocalTime localtime= LocalTime.now();
		System.out.println("LocalTime "+localtime);
		
		OffsetDateTime offsetdatetime=OffsetDateTime.now();
		System.out.println("offsetdatetime "+offsetdatetime);
		ZonedDateTime zoneddatetime=ZonedDateTime.now();
		System.out.println("zoneddatetime "+zoneddatetime);
		
		
		LocalDateTime sample=datetime.plusYears(2);
		System.out.println(sample);

	}

}
