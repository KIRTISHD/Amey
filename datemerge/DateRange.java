package datemerge;

import java.time.LocalDate;

public class DateRange {

	public LocalDate startDate;
	public LocalDate endDate;
	
	public DateRange(LocalDate startDate, LocalDate endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
