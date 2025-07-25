import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;




public class MenstrualAppTest{

	@Test
	void testGetEndOfCycleWorks() {
        LocalDate actualDate = MenstrualApp.getDateOfEndOfMenstrualCycle(LocalDate.of(2025, 8, 3), 26);
	LocalDate expectedDate = LocalDate.of(2025, 8, 28);
	assertEquals(actualDate, expectedDate);
        }
	
	@Test
	void testGetEndOfCycleRejectsNegativecycleDurationLengthInput() {
        LocalDate actualDate = MenstrualApp.getDateOfEndOfMenstrualCycle(LocalDate.of(2025, 8, 3), -26);
	LocalDate expectedDate = null;
	assertEquals(actualDate, expectedDate);
        }

	@Test
	void testGetEndOfCycleRejectsFiguresOutOfTheNormalMenstrualWindow() {
        LocalDate actualDate = MenstrualApp.getDateOfEndOfMenstrualCycle(LocalDate.of(2025, 8, 3), 40);
	LocalDate expectedDate = null;
	assertEquals(actualDate, expectedDate);
        }

	@Test
	void testGetEndOfFlowDaysWorks() {
        LocalDate actualDate = MenstrualApp.getEndOfFlowDays(LocalDate.of(2025, 8, 3), 7);
	LocalDate expectedDate = LocalDate.of(2025, 8, 10);
	assertEquals(actualDate, expectedDate);       
	}


	@Test
	void testGetEndOfFlowDaysRejectsNegativeFlowDays() {
        LocalDate actualDate = MenstrualApp.getEndOfFlowDays(LocalDate.of(2025, 8, 3), -7);
	LocalDate expectedDate = null;
	assertEquals(actualDate, expectedDate);       
	}
	

	@Test
	void testGetFertileWindowStartWork() {
        LocalDate actualDate = MenstrualApp.getFertileWindowStartDate(LocalDate.of(2025, 8, 28));
	LocalDate expectedDate = LocalDate.of(2025, 8, 12);
	assertEquals(actualDate, expectedDate);
        }
	
	
	@Test
	void testGetFertileWindowEndWork() {
        LocalDate actualDate = MenstrualApp.getFertileWindowEndDate(LocalDate.of(2025, 8, 28));
	LocalDate expectedDate = LocalDate.of(2025, 8, 16);
	assertEquals(actualDate, expectedDate);
        }
	
	@Test
	void testGetSafeDaysAfterFertileWindowWorks() {
        LocalDate actualDate = MenstrualApp.getStartOfSafeDaysAfterFertileWindow(LocalDate.of(2025, 8, 28));
	LocalDate expectedDate = LocalDate.of(2025, 8, 17);
	assertEquals(actualDate, expectedDate);
        }




}



