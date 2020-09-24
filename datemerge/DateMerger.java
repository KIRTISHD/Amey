package datemerge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DateMerger {
	
	public static List<DateRange> mergeDates(List<DateRange> dateRanges){
		List<DateRange> sortedDateList = sortList(dateRanges);
		List<DateRange> outputDateList = new ArrayList<DateRange>();

		// set initial dates
		DateRange temp = sortedDateList.get(0);
		LocalDate startDate = temp.startDate;
		LocalDate endDate = temp.endDate;
		
		for(int i = 0; i < sortedDateList.size(); i++) {
			
			DateRange current = sortedDateList.get(i);
			
			if (current.startDate.isEqual(endDate) || current.startDate.isBefore(endDate)) {
				// Max of current's enddate or global enddate
				endDate = current.endDate.isAfter(endDate) ? current.endDate : endDate;
			}
			else {
				outputDateList.add(new DateRange(startDate, endDate));
				startDate = current.startDate;
				endDate = current.endDate;
			}
		}
		
		outputDateList.add(new DateRange(startDate, endDate));
		
		return outputDateList;
	}
	
	public static void displayList(List<DateRange> dateRanges) {
		for(DateRange tempDates : dateRanges) {
			System.out.println(tempDates.startDate.format(DateTimeFormatter.ofPattern("d MMM uuuu")) + " - " + tempDates.endDate.format(DateTimeFormatter.ofPattern("d MMM uuuu")));
		}
	}
	
	public static List<DateRange> sortList(List<DateRange> dateRanges){
		
		Collections.sort(dateRanges, (d1, d2) -> d1.startDate.compareTo(d2.startDate));
		
		return dateRanges;
	}

}

