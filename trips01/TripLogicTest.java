package trips01;
import org.junit.*;
import static org.junit.Assert.*;


public class TripLogicTest {
	
	private TripLogic Logic1;
	private TripData[] Data1;
	private TripLogic Logic2;
	private TripData[] Data2;
	
	@Before
	public void setUp() {
		TripLogic Logic1 = new TripLogic("14.03.16", "15,03,16", "Rome", "Iceland",4);
		Data1 = Logic1.getTripData();
		TripLogic Logic2 = new TripLogic("15.08.07", "17.08.07", "Greenland", "Iceland", 4);
		Data2 = Logic2.getTripData();
	}
	
	
	@Test
	public void testLogic1StartDate() {
		assertEquals("14.03.16", Data1[0].getStartDate());
	}
	
	@Test
	public void testLogic1EndDate() {
		assertEquals("15.03.16", Data1[0].getEndDate());
	}
	
	@Test
	public void testLogic1FlightToIceland() {
		assertEquals("Flight A732", Data1[0].getFromIceland());
	}
	
	@Test
	public void testLogic1SecondHotel() {
		assertEquals("Hotel Saga", Data1[0].getHotelsToStay()[1]);
	}
	
	@Test
	public void testLogic1FirstDaytrip() {
		assertEquals("Hiking trip", Data1[0].getTours()[0]);
	}
	
	@Test
	public void testLogic2StartDate() {
		assertEquals("14.03.16", Data2[0].getStartDate());
	}
	
	@Test
	public void testLogic2EndDate() {
		assertEquals("15.03.16", Data2[0].getEndDate());
	}
	
	@Test
	public void testLogic2FlightToIceland() {
		assertEquals("Flight A732", Data2[0].getFromIceland());
	}
	
	@Test
	public void testLogic2SecondHotel() {
		assertEquals("Hotel Saga", Data2[0].getHotelsToStay()[1]);
	}
	
	@Test
	public void testLogic2FirstDaytrip() {
		assertEquals("Hiking trip", Data2[0].getTours()[0]);
	}
	
	@After
	public void tearDown() {
		Logic1 = null;
		Data1 = null;
		Logic2 = null;
		Data2 = null;
	}

}
