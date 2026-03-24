package DateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DateTimeSer {

	@Autowired
	DateTimeRepo datetimerepo;
	public ResponseEntity<?> saveDate(DateTimeEntity datetimeentity) {
		System.out.println("Saving student...");
		datetimerepo.save(datetimeentity);
		System.out.println("Saved...");
		return ResponseEntity.ok().build();
	}

}
