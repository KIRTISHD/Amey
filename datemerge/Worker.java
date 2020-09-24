package datemerge;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Worker {

	public static void main(String[] args) {
		
		List<DateRange> tempList = new ArrayList<DateRange>();

		DateRange d1 = new DateRange(LocalDate.of(2014, 1, 1), LocalDate.of(2014, 1, 30));
		DateRange d2 = new DateRange(LocalDate.of(2014, 1, 15), LocalDate.of(2014, 2, 15));
		DateRange d3 = new DateRange(LocalDate.of(2014, 3, 10), LocalDate.of(2014, 4, 15));
		DateRange d4 = new DateRange(LocalDate.of(2014, 4, 10), LocalDate.of(2014, 5, 15));
		
		tempList.add(d4);
		tempList.add(d3);
		tempList.add(d2);
		tempList.add(d1);

		List<DateRange> outputList = DateMerger.mergeDates(tempList);
		
		DateMerger.displayList(outputList);

	}

}

