import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate a = LocalDate.of(2025,8,11);
		LocalDate b = LocalDate.now();
		LocalDate nextMonday = b.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		LocalDate s = b.with(DayOfWeek.MONDAY);
		System.out.println(DayOfWeek.MONDAY.name().equals("MONDAY"));
		System.out.println(nextMonday);
		System.out.println(s);
		System.out.println(a.equals(b) + ", " + a.isBefore(b));
		
	}

}
